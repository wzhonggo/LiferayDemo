package com.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletPreferences;
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

import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileVersion;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.util.DocumentConversionUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.PortletDisplay;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.NoSuchFileEntryException;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.portlet.documentlibrary.util.AudioProcessorUtil;
import com.liferay.portlet.documentlibrary.util.DLUtil;
import com.liferay.portlet.documentlibrary.util.ImageProcessorUtil;
import com.liferay.portlet.documentlibrary.util.PDFProcessor;
import com.liferay.portlet.documentlibrary.util.PDFProcessorUtil;
import com.liferay.portlet.documentlibrary.util.VideoProcessor;
import com.liferay.portlet.documentlibrary.util.VideoProcessorUtil;


@Controller
@RequestMapping(value = "VIEW")
public class SpringPortlet {
	
	@RenderMapping
	public String view(Model model,RenderRequest request, RenderResponse response){
		
		
		ThemeDisplay themeDisplay= (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		PortletDisplay portletDisplay= themeDisplay.getPortletDisplay();	
		String portletId= portletDisplay.getId();
		String instanceId= portletDisplay.getInstanceId();
		System.out.println("portletId =" +portletId);
		System.out.println("instanceId =" +instanceId);
		
		model.addAttribute("username", "wzhonggo");
		model.addAttribute("portletId", portletId);
		return "view";
	}
	
	@RenderMapping(params = "action=edit")
	public String edit(Model model){
		model.addAttribute("action", "action=edit");
		return "edit2";
	}
	
	
	 @ResourceMapping("fileDownload")
	public void  fileDownload(ResourceRequest request, ResourceResponse response) throws Exception{
	        
		 System.out.println("====================================fileDownload==================================");
	       /* File file =  new File("D:\\liferay-portal-tomcat-4.2.0-ce\\liferay-portal-6.2.0-ce-ga1\\data\\document_library\\10157\\12809\\1701\\1.0");
	        String filename = "lo_00n000000000003s_4.zip";
	        
	        response.setContentType("application/zip");
	        response.addProperty("Content-disposition", "atachment; filename="+filename);

	        BufferedInputStream input = null;
	        BufferedOutputStream output = null;

	        input = new BufferedInputStream(new FileInputStream(file));
	        output = new BufferedOutputStream(response.getPortletOutputStream());

	        byte[] buffer = new byte[4096];
	        for (int length = 0; (length = input.read(buffer)) > 0;) {
	        	output.write(buffer, 0, length);
	        }
	        output.flush();
	        output.close();
	        input.close();*/
	        
	        
	        
	        
//	        String uuid = "161e0966-bf24-48b3-97d0-7405ed712c9b";	
		
//	        String uuid = "99ebd4a7-1b80-4675-8c2e-294cd3631202";
//			long groupId = 12809;
//			String version = "1.0";
			
			PortletPreferences  portletPreferences = request.getPreferences();
			String uuid = portletPreferences.getValue("uuid", "");
			long groupId = Integer.valueOf(portletPreferences.getValue("groupId", "0"));
			String version = portletPreferences.getValue("version", "1.0");
			HttpServletRequest httpServletReqeust = PortalUtil.getHttpServletRequest(request);
			HttpServletResponse httpServletResponse = PortalUtil.getHttpServletResponse(response);
		    sendFile(httpServletReqeust, httpServletResponse , uuid, groupId, version);   
	}
	
	
	@ActionMapping(value="download2" ,params = "action=download2")
	public String  download2(Model model ,ActionRequest  request, ActionResponse response) throws Exception{
		
		ThemeDisplay themeDisplay= (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		PortletDisplay portletDisplay= themeDisplay.getPortletDisplay();	
		String portletId= portletDisplay.getId();
		String instanceId= portletDisplay.getInstanceId();
		System.out.println("portletId =" +portletId);
		System.out.println("instanceId =" +instanceId);
		
		
		PortletPreferences  portletPreferences = request.getPreferences();
		portletPreferences.setValue("DLFileEntryUUID", "123123");
		portletPreferences.store();
		
//		DLFileEntryLocalServiceUtil.g
//		
//		
//		ServletResponseUtil.sendFile(
//				request, response, fileName, is, contentLength, contentType);
//		String uuid = "161e0966-bf24-48b3-97d0-7405ed712c9b";
		String uuid = "99ebd4a7-1b80-4675-8c2e-294cd3631202";
		
		long groupId = 12809;
		
//		String uuid = "8616265c-5d79-4559-951e-70fe19ab1f9b";		
//		long groupId = 12809;
		String version = "1.0";
		
//		HttpServletRequest httpServletReqeust =(HttpServletRequest)(FacesContext.getCurrentInstance().getExternalContext().getRequestMap().get("com.liferay.portal.kernel.servlet.PortletServletRequest"));
		
		HttpServletRequest httpServletReqeust = PortalUtil.getHttpServletRequest(request);
		HttpServletResponse httpServletResponse = PortalUtil.getHttpServletResponse(response);
//		sendFile(httpServletReqeust, httpServletResponse , uuid, groupId, version);
		
		
		
		
		
		httpServletResponse.setContentType("application/octet-stream");
		 httpServletResponse.setHeader("Content-Disposition","attachment;filename=movie madness 5.zip");
	 
	       	//Get it from file system
//	       	FileInputStream in = new FileInputStream(new File("D:\\liferay-portal-tomcat-4.2.0-ce\\liferay-portal-6.2.0-ce-ga1\\data\\document_library\\10157\\12809\\1701\\1.0"));
//		 FileInputStream in = 	new FileInputStream(new File("C:\\Users\\wzgong\\Desktop\\uploadFile\\movie madness 5.zip"));
//		 FileInputStream in = 	new FileInputStream(new File("D:\\index.html"));
		 
		 FileInputStream in = 	new FileInputStream(new File("C:\\Users\\wzgong\\Desktop\\uploadFile\\lo_00n000000000003s_4.zip"));
		 
	 
	        ServletOutputStream out = httpServletResponse.getOutputStream();
	 
	        byte[] outputByte = new byte[4096];
	        //copy binary content to output stream
	        while(in.read(outputByte, 0, 4096) != -1){
	        	out.write(outputByte, 0, 4096);
	        }
	        in.close();
	        out.flush();
	        out.close();
	        
	     
	        
		return null;
	}
	
	
	
	@RenderMapping(params = "action=download")
	public String  download(Model model ,RenderRequest request, RenderResponse response) throws Exception{
		/*
		ThemeDisplay themeDisplay= (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		PortletDisplay portletDisplay= themeDisplay.getPortletDisplay();	
		String portletId= portletDisplay.getId();
		String instanceId= portletDisplay.getInstanceId();
		System.out.println("portletId =" +portletId);
		System.out.println("instanceId =" +instanceId);
		
		
		PortletPreferences  portletPreferences = request.getPreferences();
		portletPreferences.setValue("DLFileEntryUUID", "123123");
		portletPreferences.store();
		
//		DLFileEntryLocalServiceUtil.g
//		
//		
//		ServletResponseUtil.sendFile(
//				request, response, fileName, is, contentLength, contentType);
//		String uuid = "161e0966-bf24-48b3-97d0-7405ed712c9b";
		String uuid = "99ebd4a7-1b80-4675-8c2e-294cd3631202";
		
		long groupId = 12809;
		
//		String uuid = "8616265c-5d79-4559-951e-70fe19ab1f9b";		
//		long groupId = 12809;
		String version = "1.0";
		
//		HttpServletRequest httpServletReqeust =(HttpServletRequest)(FacesContext.getCurrentInstance().getExternalContext().getRequestMap().get("com.liferay.portal.kernel.servlet.PortletServletRequest"));
		
		HttpServletRequest httpServletReqeust = PortalUtil.getHttpServletRequest(request);
		HttpServletResponse httpServletResponse = PortalUtil.getHttpServletResponse(response);
//		sendFile(httpServletReqeust, httpServletResponse , uuid, groupId, version);
		
		
		
		
		
		httpServletResponse.setContentType("application/octet-stream");
//		httpServletResponse.setContentType("application/zip");
		httpServletResponse.setHeader("Content-Disposition","attachment;filename=lo_00n000000000003s_4.zip");
	 
	       	//Get it from file system
//	       	FileInputStream in = new FileInputStream(new File("D:\\liferay-portal-tomcat-4.2.0-ce\\liferay-portal-6.2.0-ce-ga1\\data\\document_library\\10157\\12809\\1701\\1.0"));
//		 FileInputStream in = 	new FileInputStream(new File("C:\\Users\\wzgong\\Desktop\\uploadFile\\movie madness 5.zip"));
//		 FileInputStream in = 	new FileInputStream(new File("D:\\index.html"));
		 
		 FileInputStream in = 	new FileInputStream(new File("C:\\Users\\wzgong\\Desktop\\uploadFile\\lo_00n000000000003s_4.zip"));
		 
	 
	        ServletOutputStream out = httpServletResponse.getOutputStream();
//	        OutputStream out = response.getPortletOutputStream();
	 
	        byte[] outputByte = new byte[4096];
	        //copy binary content to output stream
	        while(in.read(outputByte, 0, 4096) != -1){
	        	out.write(outputByte, 0, 4096);
	        }
	        in.close();
	        out.flush();
	        out.close();
	        */
		
	
		
		HttpServletRequest httpServletReqeust = PortalUtil.getHttpServletRequest(request);
		HttpServletResponse httpServletResponse = PortalUtil.getHttpServletResponse(response);
		  File file =  new File("D:\\liferay-portal-tomcat-4.2.0-ce\\liferay-portal-6.2.0-ce-ga1\\data\\document_library\\10157\\12809\\1701\\1.0");
	        String filename = "lo_00n000000000003s_4.zip";
	        
	        httpServletResponse.setContentType("application/zip");
	        httpServletResponse.setHeader("Content-Disposition","attachment;filename=lo_00n000000000003s_4.zip");

	        BufferedInputStream input = null;
	        BufferedOutputStream output = null;

	        input = new BufferedInputStream(new FileInputStream(file));
	        output = new BufferedOutputStream(httpServletResponse.getOutputStream());

	        byte[] buffer = new byte[4096];
	        for (int length = 0; (length = input.read(buffer)) > 0;) {
	        	output.write(buffer, 0, length);
	        }
	        output.flush();
	        output.close();
	        input.close();
	        
	        
		return null;
	}
	
	
	
	//download file for  :  com.liferay.portal.webserver.WebServerServlet   protected void sendFile(HttpServletRequest request, HttpServletResponse response, User user,String[] pathArray)
	protected void sendFile(
			HttpServletRequest request, HttpServletResponse response, String uuid,  long groupId, String version)
		throws Exception {

		// Retrieve file details

//		FileEntry fileEntry = getFileEntry(pathArray);
		FileEntry fileEntry =  DLAppServiceUtil.getFileEntryByUuidAndGroupId(uuid, groupId);
		
//		FileEntry fileEntry = new LiferayFileEntry(DLFileEntryLocalServiceUtil.getFileEntryByUuidAndGroupId(uuid, groupId));
		
		if (fileEntry == null) {
			throw new NoSuchFileEntryException();
		}

//		String version = ParamUtil.getString(request, "version");

		if (Validator.isNull(version)) {
			if (Validator.isNotNull(fileEntry.getVersion())) {
				version = fileEntry.getVersion();
			}
		}

		String tempFileId = DLUtil.getTempFileId(
			fileEntry.getFileEntryId(), version);

//		if (fileEntry.getModel() instanceof DLFileEntry) {
//			LiferayFileEntry liferayFileEntry = (LiferayFileEntry)fileEntry;
//
//			if (liferayFileEntry.isInTrash()) {
//				int status = ParamUtil.getInteger(
//					request, "status", WorkflowConstants.STATUS_APPROVED);
//
//				if (status != WorkflowConstants.STATUS_IN_TRASH) {
//					throw new NoSuchFileEntryException();
//				}
//
//				PermissionChecker permissionChecker =
//					PermissionThreadLocal.getPermissionChecker();
//
//				if (!PortletPermissionUtil.hasControlPanelAccessPermission(
//						permissionChecker, fileEntry.getGroupId(),
//						PortletKeys.TRASH)) {
//
//					throw new PrincipalException();
//				}
//			}
//		}

		FileVersion fileVersion = fileEntry.getFileVersion(version);

//		if ((ParamUtil.getInteger(request, "height") > 0) ||
//			(ParamUtil.getInteger(request, "width") > 0)) {
//
//			InputStream inputStream = fileVersion.getContentStream(true);
//
//			Image image = ImageToolUtil.getImage(inputStream);
//
//			writeImage(image, request, response);
//
//			return;
//		}

		String fileName = fileVersion.getTitle();

		String extension = fileVersion.getExtension();

		if (Validator.isNotNull(extension) &&
			!fileName.endsWith(StringPool.PERIOD + extension)) {

			fileName += StringPool.PERIOD + extension;
		}

		// Handle requested conversion

		boolean converted = false;

		String targetExtension = ParamUtil.getString(
			request, "targetExtension");
		int imageThumbnail = ParamUtil.getInteger(request, "imageThumbnail");
		int documentThumbnail = ParamUtil.getInteger(
			request, "documentThumbnail");
		int previewFileIndex = ParamUtil.getInteger(
			request, "previewFileIndex");
		boolean audioPreview = ParamUtil.getBoolean(request, "audioPreview");
		boolean imagePreview = ParamUtil.getBoolean(request, "imagePreview");
		boolean videoPreview = ParamUtil.getBoolean(request, "videoPreview");
		int videoThumbnail = ParamUtil.getInteger(request, "videoThumbnail");

		InputStream inputStream = null;
		long contentLength = 0;

		if ((imageThumbnail > 0) && (imageThumbnail <= 3)) {
			fileName = FileUtil.stripExtension(fileName).concat(
				StringPool.PERIOD).concat(
					ImageProcessorUtil.getThumbnailType(fileVersion));

			int thumbnailIndex = imageThumbnail - 1;

			inputStream = ImageProcessorUtil.getThumbnailAsStream(
				fileVersion, thumbnailIndex);
			contentLength = ImageProcessorUtil.getThumbnailFileSize(
				fileVersion, thumbnailIndex);

			converted = true;
		}
		else if ((documentThumbnail > 0) && (documentThumbnail <= 3)) {
			fileName = FileUtil.stripExtension(fileName).concat(
				StringPool.PERIOD).concat(PDFProcessor.THUMBNAIL_TYPE);

			int thumbnailIndex = documentThumbnail - 1;

			inputStream = PDFProcessorUtil.getThumbnailAsStream(
				fileVersion, thumbnailIndex);
			contentLength = PDFProcessorUtil.getThumbnailFileSize(
				fileVersion, thumbnailIndex);

			converted = true;
		}
		else if (previewFileIndex > 0) {
			fileName = FileUtil.stripExtension(fileName).concat(
				StringPool.PERIOD).concat(PDFProcessor.PREVIEW_TYPE);
			inputStream = PDFProcessorUtil.getPreviewAsStream(
				fileVersion, previewFileIndex);
			contentLength = PDFProcessorUtil.getPreviewFileSize(
				fileVersion, previewFileIndex);

			converted = true;
		}
		else if (audioPreview || videoPreview) {
			String type = ParamUtil.getString(request, "type");

			fileName = FileUtil.stripExtension(fileName).concat(
				StringPool.PERIOD).concat(type);

			if (audioPreview) {
				inputStream = AudioProcessorUtil.getPreviewAsStream(
					fileVersion, type);
				contentLength = AudioProcessorUtil.getPreviewFileSize(
					fileVersion, type);
			}
			else {
				inputStream = VideoProcessorUtil.getPreviewAsStream(
					fileVersion, type);
				contentLength = VideoProcessorUtil.getPreviewFileSize(
					fileVersion, type);
			}

			converted = true;
		}
		else if (imagePreview) {
			String type = ImageProcessorUtil.getPreviewType(fileVersion);

			fileName = FileUtil.stripExtension(fileName).concat(
				StringPool.PERIOD).concat(type);

			inputStream = ImageProcessorUtil.getPreviewAsStream(fileVersion);

			contentLength = ImageProcessorUtil.getPreviewFileSize(fileVersion);

			converted = true;
		}
		else if ((videoThumbnail > 0) && (videoThumbnail <= 3)) {
			fileName = FileUtil.stripExtension(fileName).concat(
				StringPool.PERIOD).concat(VideoProcessor.THUMBNAIL_TYPE);

			int thumbnailIndex = videoThumbnail - 1;

			inputStream = VideoProcessorUtil.getThumbnailAsStream(
				fileVersion, thumbnailIndex);
			contentLength = VideoProcessorUtil.getThumbnailFileSize(
				fileVersion, thumbnailIndex);

			converted = true;
		}
		else {
			inputStream = fileVersion.getContentStream(true);
			contentLength = fileVersion.getSize();

			if (Validator.isNotNull(targetExtension)) {
				File convertedFile = DocumentConversionUtil.convert(
					tempFileId, inputStream, extension, targetExtension);

				if (convertedFile != null) {
					fileName = FileUtil.stripExtension(fileName).concat(
						StringPool.PERIOD).concat(targetExtension);
					inputStream = new FileInputStream(convertedFile);
					contentLength = convertedFile.length();

					converted = true;
				}
			}
		}

		// Determine proper content type

		String contentType = null;

		if (converted) {
			contentType = MimeTypesUtil.getContentType(fileName);
		}
		else {
			contentType = fileVersion.getMimeType();
		}

//		if (_log.isDebugEnabled()) {
//			_log.debug("Content type set to " + contentType);
//		}
		System.out.println("Content type set to " + contentType);
		System.out.println("fileName =  " + fileName);

		// Send file

//		if (isSupportsRangeHeader(contentType)) {
//			sendFileWithRangeHeader(
//				request, response, fileName, inputStream, contentLength,
//				contentType);
//		}
//		else {
//			ServletResponseUtil.sendFile(
//				request, response, fileName, inputStream, contentLength,
//				contentType);
//		}
		
		ServletResponseUtil.sendFile(
				request, response, fileName, inputStream, contentLength,
				contentType);
	}
}
