package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.model.DLSyncConstants;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Demo3
 */
public class Demo3 extends MVCPortlet {

	public void init() throws PortletException {
		System.out.println("******** Demo3  init ********");
		super.init();
	}

	public void init(PortletConfig config) throws PortletException {
		System.out
				.println("******** Demo3  init(PortletConfig config) ********");
		super.init(config);
	}

	public void doEdit(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		// getPortletContext()
		// .getRequestDispatcher("/preferences.jsp").include(
		// request, response);
		System.out.println("******** Demo3  doEdit ********");
	}

	public void doHelp(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		System.out.println("******** Demo3  doHelp ********");
	}

	public void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		System.out.println("Demo3  doView ");

		PortletSession ps = request.getPortletSession();
		String falg = (String) ps.getAttribute("TEST_falg",
				PortletSession.APPLICATION_SCOPE);
		System.out.println("falg = " + falg);
		
		
		try {
			User user = PortalUtil.getUser(request);
			int start = -1;
			int end =-1;
			List<DLFolder> dlFolderList =  DLFolderLocalServiceUtil.getCompanyFolders(user.getCompanyId(), start, end);
			for(DLFolder dlFolder : dlFolderList){
				System.out.println(dlFolder.getName() + "   "+ dlFolder.getTreePath());
			}
			request.setAttribute("dlFolderList", dlFolderList);
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (PortalException e) {
			e.printStackTrace();
		}
		super.doView(request, response);
	}

	/*
	 * public void processAction(ActionRequest request, ActionResponse response)
	 * throws PortletException, IOException {
	 * System.out.println("******** Demo3 processAction ********");
	 * 
	 * String[] categories = request.getParameterValues("category"); for (String
	 * categorie : categories) { System.out.println(categorie); } }
	 */

	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		System.out.println("Demo3 render " + request.getParameter("reset"));
		super.render(request, response);
	}

	@ProcessAction(name = "getCategory")
	public void getCategory(ActionRequest request, ActionResponse response)
			throws PortletException, IOException {
		System.out.println("Demo3 getCategory");

		String[] categories = request.getParameterValues("category");
		for (String categorie : categories) {
			System.out.println(categorie);
		}


	}

	@ProcessAction(name = "getName")
	public void getName(ActionRequest request, ActionResponse response)
			throws PortletException, IOException {
		System.out.println("Demo3 getName");

		String[] names = request.getParameterValues("name");
		for (String name : names) {
			System.out.println(name);
		}

	}

	@ProcessAction(name = "uploadCase")
	public void uploadCase(ActionRequest actionRequest,
			ActionResponse actionRresponse) throws PortletException,
			IOException {

		// String folder = getInitParameter("uploadFolder");
//		String folder = "D:\\liferay-portal-tomcat-4.2.0-ce\\upload\\";
//		String realPath = getPortletContext().getRealPath("/");
//
//		System.out.println("RealPath" + realPath + " UploadFolder :" + folder);
		try {
//			UploadPortletRequest uploadRequest = PortalUtil
//					.getUploadPortletRequest(actionRequest);
//			System.out.println("Size: " + uploadRequest.getSize("fileName"));
//			if (uploadRequest.getSize("fileName") == 0) {
//				SessionErrors.add(actionRequest, "error");
//			}
//
//			String sourceFileName = uploadRequest.getFileName("fileName");
//			File file = uploadRequest.getFile("fileName");
//
//			File newFile = null;
//			newFile = new File(folder + sourceFileName);
//
//			InputStream in = new BufferedInputStream(
//					uploadRequest.getFileAsStream("fileName"));
//			FileInputStream fis = new FileInputStream(file);
//			FileOutputStream fos = new FileOutputStream(newFile);
//
//			byte[] bytes_ = FileUtil.getBytes(in);
//			int i = fis.read(bytes_);
//
//			while (i != -1) {
//				fos.write(bytes_, 0, i);
//				i = fis.read(bytes_);
//			}
//			fis.close();
//			fos.close();
//			Float size = (float) newFile.length();
//			System.out.println("file size bytes:" + size);
//			System.out.println("file size Mb:" + size / 1048576);

			SessionMessages.add(actionRequest, "success");

			
			
			
			
			// for add folder to liferay
			User user = PortalUtil.getUser(actionRequest);
			DLFileEntry dlFileEntry = null;
			List<DLFolder> dlFolders;

			 UploadPortletRequest uploadRequest =
			 PortalUtil.getUploadPortletRequest(actionRequest);

			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest
					.getAttribute(WebKeys.THEME_DISPLAY);

			ServiceContext serviceContext = new ServiceContext();
			serviceContext.setAddCommunityPermissions(true);
			serviceContext.setAddGuestPermissions(true);
			serviceContext.setAddGroupPermissions(true);
			
			 serviceContext.setAssetEntryVisible(true);
			 serviceContext.setCompanyId(user.getCompanyId());
			 serviceContext.setScopeGroupId(themeDisplay.getScopeGroupId());
			   System.out.println("getCompanyId " + user.getCompanyId() + "getGroupId " +  user.getGroupId()) ;
			   System.out.println("getScopeGroupId() " + themeDisplay.getScopeGroupId() +"getLayoutGroupId "  + themeDisplay.getLayout().getGroupId()) ;
//			long[] assetCategoryIds = new long[assetCategoryIdsList.size()];
//			for (int i = 0; i < assetCategoryIdsList.size(); i++) {
//			    assetCategoryIds[i] = assetCategoryIdsList.get(i);
//			}
//			serviceContext.setAssetCategoryIds(assetCategoryIds);
//			serviceContext.setScopeGroupId(groupId);
//			if(!tagNames.equals("")) {
//			    serviceContext.setAssetTagNames(tagNames.split(","));
//			}

			long folderId = 0;
			if(uploadRequest.getParameter("folderId")!=null && !"".equals(uploadRequest.getParameter("folderId")) ){
				folderId = Long.valueOf(uploadRequest.getParameter("folderId"));
			}
			System.out.println("folderId" +  ParamUtil.getLong(actionRequest, "folderId"));
			System.out.println("folderId" +  actionRequest.getParameter("folderId"));
			System.out.println("folderId" +  uploadRequest.getParameter("folderId"));
			
//			long repositoryId = 0;
			long repositoryId = themeDisplay.getScopeGroupId();
			long fileEntryTypeId = 0;

		

//			dlFolders = DLFolderLocalServiceUtil.getDLFolders(0,
//					DLFolderLocalServiceUtil.getDLFoldersCount());
//
//			System.out.println("dlFolders = " + dlFolders);
//			
//			for (DLFolder dlFolder : dlFolders) {
//				if ("file".equalsIgnoreCase(dlFolder.getName())) {
//					folderId = dlFolder.getFolderId();
//					repositoryId = dlFolder.getRepositoryId();
//					fileEntryTypeId = dlFolder.getDefaultFileEntryTypeId();
//				}
//			}
//			
//			System.out.println("dlFolders = " + dlFolders);

			File docFile = uploadRequest.getFile("fileName");
			String sourceFileName = uploadRequest.getFileName("fileName");
			InputStream inputStream = new FileInputStream(docFile);
			
//			File docFile = new File("D:\\demo3");
//			String sourceFileName = "SCORM-Driver-with-sample-course-Tin-Can";
//			InputStream inputStream = new FileInputStream(docFile);
//
			dlFileEntry = DLFileEntryLocalServiceUtil.addFileEntry(
					user.getUserId(), themeDisplay.getScopeGroupId(),
					repositoryId, folderId, sourceFileName,
					MimeTypesUtil.getContentType(docFile), sourceFileName,
					"descreption", "changeLog", fileEntryTypeId, null, docFile,
					inputStream, docFile.length(), serviceContext);

		//	 Map<String, Serializable> workflowContext = new HashMap<String, Serializable>();
		//	    workflowContext.put("event",DLSyncConstants.EVENT_UPDATE);
			    
			    
			    DLFileEntryLocalServiceUtil.updateFileEntry(user.getUserId(),dlFileEntry.getFileEntryId(), dlFileEntry.getTitle(),dlFileEntry.getMimeType(), dlFileEntry.getTitle(),dlFileEntry.getDescription(), "changeLog", true, dlFileEntry.getFileEntryTypeId(), null, docFile,
						inputStream, docFile.length(), serviceContext);
			    
			    
			    
//			    DLFolderLocalServiceUtil.addFolder(user.getUserId(), themeDisplay.getScopeGroupId(), repositoryId, true, 10157, "Folder_"+new Random().nextInt(10000)
//			    		, "for test", false, serviceContext);
			    
			   // DLFileEntryLocalServiceUtil.updateDLFileEntry(dlFileEntry);
//			dlFileEntry = DLFileEntryLocalServiceUtil.updateStatus(dlFileEntry.getUserId(), dlFileEntry.getFileVersion().getFileVersionId(), WorkflowConstants.STATUS_APPROVED, workflowContext, serviceContext);
			    
			// DLFileEntryLocalServiceUtil.addFileEntryResources(dlFileEntry,
			// true, true);

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found.");
			e.printStackTrace();
			SessionMessages.add(actionRequest, "error");
		} catch (NullPointerException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
			SessionMessages.add(actionRequest, "error");
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			SessionMessages.add(actionRequest, "error");
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			SessionMessages.add(actionRequest, "error");
		}
	}
}
