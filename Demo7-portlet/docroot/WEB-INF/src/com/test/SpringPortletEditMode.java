package com.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletPreferences;
import javax.portlet.ReadOnlyException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileVersion;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.util.DocumentConversionUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.PortletDisplay;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.NoSuchFileEntryException;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.util.AudioProcessorUtil;
import com.liferay.portlet.documentlibrary.util.DLUtil;
import com.liferay.portlet.documentlibrary.util.ImageProcessorUtil;
import com.liferay.portlet.documentlibrary.util.PDFProcessor;
import com.liferay.portlet.documentlibrary.util.PDFProcessorUtil;
import com.liferay.portlet.documentlibrary.util.VideoProcessor;
import com.liferay.portlet.documentlibrary.util.VideoProcessorUtil;


@Controller
@RequestMapping(value = "EDIT")
public class SpringPortletEditMode {
	
	@RenderMapping
	public String view(Model model,RenderRequest request, RenderResponse response) throws PortalException, SystemException{
		
		
//		ThemeDisplay themeDisplay= (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
//		PortletDisplay portletDisplay= themeDisplay.getPortletDisplay();	
//		String portletId= portletDisplay.getId();
//		String instanceId= portletDisplay.getInstanceId();
//		System.out.println("portletId =" +portletId);
//		System.out.println("instanceId =" +instanceId);
//		
//		model.addAttribute("username", "wzhonggo");
//		model.addAttribute("portletId", portletId);
		   
		User currentUser = PortalUtil.getUser(request);
		
		String orderByCol = ParamUtil.getString(request, "orderByCol");
		String orderByType = ParamUtil.getString(request, "orderByType");
		
		long groupFileEntriesUserId = 0;

		// only show mine document file 
		groupFileEntriesUserId = currentUser.getUserId();
		
//		long repositoryId = GetterUtil.getLong((String)request.getAttribute("view.jsp-repositoryId"));
		long repositoryId = 12809;
		
		int status = WorkflowConstants.STATUS_APPROVED;
		
		long folderId = 0;

//		if (permissionChecker.isCompanyAdmin() || permissionChecker.isGroupAdmin(scopeGroupId)) {
//			status = WorkflowConstants.STATUS_ANY;
//		}
		int total = DLAppServiceUtil.getGroupFileEntriesCount(repositoryId, groupFileEntriesUserId, folderId, null, status);

//		searchContainer.setTotal(total);
		
		int entryStart = 0;
		int entryEnd = 20;
		int pageCount = 20;
		int currentPage = 1;
		if (total <= entryStart) {
			entryStart = (currentPage - 1) * pageCount;
			entryEnd = entryStart + pageCount;
		}

		OrderByComparator orderByComparator = DLUtil.getRepositoryModelOrderByComparator(orderByCol, orderByType);
		String[] mimeTypes = new String[1];
		// only search zip file
		mimeTypes[0] = "application/zip";
		
		List<FileEntry> results = DLAppServiceUtil.getGroupFileEntries(repositoryId, groupFileEntriesUserId, folderId, mimeTypes, status, entryStart, entryEnd, orderByComparator);
		
//		for(FileEntry fileEntry : results){
//			System.out.println("getReadCount "+  fileEntry.getReadCount());
//			System.out.println("getCreateDate " + fileEntry.getCreateDate());
//			FileVersion latestFileVersion = fileEntry.getFileVersion();
//			System.out.println("getReadCount" + fileEntry.getReadCount());
//			System.out.println("getSize()" + latestFileVersion.getSize());
//			
//		}
		model.addAttribute("results", results);
		return "edit";
	}
	
	@RenderMapping(params = "action=save")
	public String save(Model model ,RenderRequest request, RenderResponse response) {
		String view =  "success";
		try {
//			String url = PortalUtil.getCurrentURL(request);		
			//get param form url  http://www.liferay.com/zh/community/wiki/-/wiki/Main/URL+Parameters+in+Portlets
			HttpServletRequest httpServletReqeust = PortalUtil.getHttpServletRequest(request);
			long fileEntryId = Long.valueOf(PortalUtil.getOriginalServletRequest(httpServletReqeust).getParameter("fileEntryId"));
			DLFileEntry  dlFileEntry  = DLFileEntryLocalServiceUtil.fetchDLFileEntry(fileEntryId);
				
			PortletPreferences  portletPreferences = request.getPreferences();
			portletPreferences.setValue("uuid", dlFileEntry.getUuid());
			portletPreferences.setValue("groupId", String.valueOf(dlFileEntry.getGroupId()));
			portletPreferences.setValue("version", dlFileEntry.getVersion());
			
//			portletPreferences.setValue("uuid", "99ebd4a7-1b80-4675-8c2e-294cd3631202");
//			portletPreferences.setValue("groupId", "12809");
//			portletPreferences.setValue("version", "1.0");
			portletPreferences.store();	
			
			model.addAttribute("msg" , "Save Successfully");
		}catch (Exception e){
			e.printStackTrace();
			view = "error";
			model.addAttribute("msg" , "Save Error");
		}
	
		return view;
	}
	
	/*@ActionMapping(params = "action=save")
	public String  save(Model model ,ActionRequest  request, ActionResponse response) throws Exception{
		String view =  "success";
		try {
			HttpServletRequest httpServletReqeust = PortalUtil.getHttpServletRequest(request);
			long fileEntryId = Long.valueOf(httpServletReqeust.getParameter("fileEntryId"));
			long fileEntryId = ParamUtil.getLong(request, "fileEntryId");
			DLFileEntry  dlFileEntry  = DLFileEntryLocalServiceUtil.fetchDLFileEntry(fileEntryId);
				
			PortletPreferences  portletPreferences = request.getPreferences();
			System.out.println("==============================");
			portletPreferences.setValue("uuid", dlFileEntry.getUuid());
			portletPreferences.setValue("groupId", String.valueOf(dlFileEntry.getGroupId()));
			portletPreferences.setValue("version", dlFileEntry.getVersion());
			portletPreferences.store();	
			
			
//			portletPreferences.setValue("DLFileEntryUUID", "123123");
//			portletPreferences.store();
			
			model.addAttribute("msg" , "Save Successfully");
		}catch (Exception e){
			e.printStackTrace();
			view = "error";
			model.addAttribute("msg" , "Save Error");
		}
	
		return view;
	}*/
}
