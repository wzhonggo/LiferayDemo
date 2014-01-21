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
import javax.portlet.PortletPreferences;
import javax.portlet.PortletSession;
import javax.portlet.ProcessAction;
import javax.portlet.ReadOnlyException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.ResourcePermission;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.service.ResourcePermissionServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.asset.model.AssetCategory;
import com.liferay.portlet.asset.model.AssetCategoryProperty;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.asset.service.AssetCategoryLocalServiceUtil;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;
import com.liferay.portlet.asset.service.persistence.AssetEntryUtil;
import com.liferay.portlet.assetpublisher.util.AssetPublisherUtil;
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
		System.out.println("******** Demo3  doEdit ********");
		try {
			User user = PortalUtil.getUser(request);
			int start = -1;
			int end =-1;
			List<DLFolder> dlFolderList =  DLFolderLocalServiceUtil.getCompanyFolders(user.getCompanyId(), start, end);
			for(DLFolder dlFolder : dlFolderList){
				System.out.println(dlFolder.getName() + "   "+ dlFolder.getTreePath());
			}
			request.setAttribute("dlFolderList", dlFolderList);
			
			
			
			List<AssetCategory> assetCategoryList = AssetCategoryLocalServiceUtil.getCategories();
			
			request.setAttribute("assetCategoryList", assetCategoryList);
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (PortalException e) {
			e.printStackTrace();
		}
		super.doEdit(request, response );
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

/*	@ProcessAction(name = "getCategory")
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

	}*/
	
	
	@ProcessAction(name = "savaFolderAndCategery")
	public void getName(ActionRequest request, ActionResponse response){		
		
		try {
			System.out.println("savaFolderAndCategery");
			
			HttpServletRequest httpServletRequest =  PortalUtil.getHttpServletRequest(request);
			String folderId = httpServletRequest.getParameter("folderId");
			String assetCategoryId = httpServletRequest.getParameter("assetCategoryId");
			
			System.out.println("folderId = " + folderId + "  assetCategoryId = " + assetCategoryId );
			if(!Validator.isBlank(folderId) && !Validator.isBlank(assetCategoryId) ){
				PortletPreferences  portletPreferences = request.getPreferences();
				portletPreferences.setValue("folderId", folderId);
				portletPreferences.setValue("assetCategoryId", assetCategoryId);
				portletPreferences.store();	
			    SessionMessages.add(request, "success");
			}else {
				SessionMessages.add(request, "error");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			SessionMessages.add(request, "error");
		}
	
		

	}

	@ProcessAction(name = "uploadCase")
	public void uploadCase(ActionRequest actionRequest,	ActionResponse actionRresponse)  {

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

			

			PortletPreferences  portletPreferences = actionRequest.getPreferences();
			
			
			
			// for add folder to liferay
			User user = PortalUtil.getUser(actionRequest);
			DLFileEntry dlFileEntry = null;
			List<DLFolder> dlFolders;

			 UploadPortletRequest uploadRequest =
			 PortalUtil.getUploadPortletRequest(actionRequest);

			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest
					.getAttribute(WebKeys.THEME_DISPLAY);

//			ServiceContext serviceContext = new ServiceContext();
			ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
			
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
				long assetCategoryId =  Integer.valueOf(portletPreferences.getValue("assetCategoryId", "30501"));
				System.out.println("assetCategoryId " + assetCategoryId );
			   long[] assetCategoryIds  = new long[1];
			   assetCategoryIds[0]=assetCategoryId;
			   // set assetCategoryId to assetentry and assetCategory
			    serviceContext.setAssetCategoryIds(assetCategoryIds);

			long folderId = 0;
			if(uploadRequest.getParameter("folderId")!=null && !"".equals(uploadRequest.getParameter("folderId")) ){
				folderId = Long.valueOf(uploadRequest.getParameter("folderId"));
			}
			folderId = Integer.valueOf(portletPreferences.getValue("folderId", "0"));
		
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
			String descreption ="";
			String changeLog ="";
			
//			File docFile = new File("D:\\demo3");
//			String sourceFileName = "SCORM-Driver-with-sample-course-Tin-Can";
//			InputStream inputStream = new FileInputStream(docFile);
			
			DLFileEntry validatedlFileEntry =DLFileEntryLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), folderId, sourceFileName);
			if(validatedlFileEntry!=null){
				dlFileEntry =  DLFileEntryLocalServiceUtil.updateFileEntry(user.getUserId(),validatedlFileEntry.getFileEntryId(), validatedlFileEntry.getTitle(),MimeTypesUtil.getContentType(docFile), validatedlFileEntry.getTitle(),validatedlFileEntry.getDescription(), changeLog, true, validatedlFileEntry.getFileEntryTypeId(), null, docFile,
						inputStream, docFile.length(), serviceContext);
			}else{

			
				dlFileEntry = DLFileEntryLocalServiceUtil.addFileEntry(
						user.getUserId(), themeDisplay.getScopeGroupId(),
						repositoryId, folderId, sourceFileName,
						MimeTypesUtil.getContentType(docFile), sourceFileName,
						descreption, changeLog, fileEntryTypeId, null, docFile,
						inputStream, docFile.length(), serviceContext);

			//	 Map<String, Serializable> workflowContext = new HashMap<String, Serializable>();
			//	    workflowContext.put("event",DLSyncConstants.EVENT_UPDATE);
				    
				dlFileEntry =  DLFileEntryLocalServiceUtil.updateFileEntry(user.getUserId(),dlFileEntry.getFileEntryId(), dlFileEntry.getTitle(),dlFileEntry.getMimeType(), dlFileEntry.getTitle(),dlFileEntry.getDescription(), changeLog, true, dlFileEntry.getFileEntryTypeId(), null, docFile,
							inputStream, docFile.length(), serviceContext);
				    
				    
				    
//				    DLFolderLocalServiceUtil.addFolder(user.getUserId(), themeDisplay.getScopeGroupId(), repositoryId, true, 10157, "Folder_"+new Random().nextInt(10000)
//				    		, "for test", false, serviceContext);
				    
				   // DLFileEntryLocalServiceUtil.updateDLFileEntry(dlFileEntry);
//				dlFileEntry = DLFileEntryLocalServiceUtil.updateStatus(dlFileEntry.getUserId(), dlFileEntry.getFileVersion().getFileVersionId(), WorkflowConstants.STATUS_APPROVED, workflowContext, serviceContext);
				    
				// DLFileEntryLocalServiceUtil.addFileEntryResources(dlFileEntry,
				// true, true);
				    
//				    AssetCategoryPropertyLocalServiceUtil
				   
					
//					AssetEntry assetEntry =  AssetEntryLocalServiceUtil.getEntry(DLFileEntry.class.getName(), dlFileEntry.getFileEntryId());
//					AssetEntryLocalServiceUtil.updateEntry(assetEntry.getUserId(), assetEntry.getGroupId(), assetEntry.getClassName(), assetEntry.getClassPK(), assetCategoryIds, null);
//				   
//				    AssetEntryUtil.setAssetCategories(assetEntry.getEntryId(), assetCategoryIds);
				
				
				
				AssetPublisherUtil.addAndStoreSelection(
						actionRequest, DLFileEntry.class.getName(),
						dlFileEntry.getFileEntryId(), -1);
				
				AssetPublisherUtil.addRecentFolderId(
						actionRequest, DLFileEntry.class.getName(), folderId);
				
				
				
				// add ResourcePermission
				ResourcePermission guestResourcePermission = ResourcePermissionLocalServiceUtil
	                     .createResourcePermission(CounterLocalServiceUtil.increment());
				guestResourcePermission.setCompanyId(user.getCompanyId());
				guestResourcePermission.setName(DLFileEntry.class.getName());
				guestResourcePermission.setScope(ResourceConstants.SCOPE_INDIVIDUAL);
				guestResourcePermission.setPrimKey(String.valueOf(dlFileEntry.getPrimaryKey()));
				guestResourcePermission.setRoleId(10165);
	          // (VIEW and Add Discussion);
				guestResourcePermission.setActionIds(3);
	             ResourcePermissionLocalServiceUtil.addResourcePermission(guestResourcePermission);
	             
	     		ResourcePermission userRresourcePermission = ResourcePermissionLocalServiceUtil
	                    .createResourcePermission(CounterLocalServiceUtil.increment());
	     		userRresourcePermission.setCompanyId(user.getCompanyId());
	     		userRresourcePermission.setName(DLFileEntry.class.getName());
	     		userRresourcePermission.setScope(ResourceConstants.SCOPE_INDIVIDUAL);
	     		userRresourcePermission.setPrimKey(String.valueOf(dlFileEntry.getPrimaryKey()));
	     		userRresourcePermission.setRoleId(10173);
	         // (VIEW and Add Discussion);
	     		userRresourcePermission.setActionIds(3);
	            ResourcePermissionLocalServiceUtil.addResourcePermission(userRresourcePermission);
	             
	             
	         	ResourcePermission ownerResourcePermission = ResourcePermissionLocalServiceUtil
	                    .createResourcePermission(CounterLocalServiceUtil.increment());
	         	ownerResourcePermission.setCompanyId(user.getCompanyId());
	         	ownerResourcePermission.setName(DLFileEntry.class.getName());
	         	ownerResourcePermission.setScope(ResourceConstants.SCOPE_INDIVIDUAL);
	         	ownerResourcePermission.setPrimKey(String.valueOf(dlFileEntry.getPrimaryKey()));
	         	ownerResourcePermission.setRoleId(10166);
	         	ownerResourcePermission.setActionIds(255);
	         	ownerResourcePermission.setOwnerId(user.getUserId());
	             ResourcePermissionLocalServiceUtil.addResourcePermission(ownerResourcePermission);
	             
//	             ResourcePermissionServiceUtil.setIndividualResourcePermissions(
//	     				resourceGroupId, themeDisplay.getCompanyId(), selResource,
//	     				resourcePrimKey, roleIdsToActionIds);
	             
	             java.lang.String[] actionIds = new String [1];
//	             actionIds[0] = String.valueOf(resourcePermission.getActionIds());
	             actionIds[0] = "VIEW";
	         	Map<Long, String[]> roleIdsToActionIds = new HashMap<Long, String[]>();
	         	roleIdsToActionIds.put(guestResourcePermission.getRoleId(), actionIds);
//	             ResourcePermissionServiceUtil.setIndividualResourcePermissions(
//	            		 themeDisplay.getScopeGroupId(), resourcePermission.getCompanyId(), resourcePermission.getName(),
//	      				resourcePermission.getPrimKey(),resourcePermission.getRoleId(),actionIds );
	             
	             ResourcePermissionServiceUtil.setIndividualResourcePermissions(
	            		 themeDisplay.getScopeGroupId(), guestResourcePermission.getCompanyId(), guestResourcePermission.getName(),
	            		 guestResourcePermission.getPrimKey(),roleIdsToActionIds );
			}
			
         	System.out.println("=============uploadCase========");
			    
			SessionMessages.add(actionRequest, "success");

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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			SessionMessages.add(actionRequest, "error");
		}        
	}
}
