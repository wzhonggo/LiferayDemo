package com.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Demo6
 */
public class Demo6 extends MVCPortlet {
	
	public void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		System.out.println("======================");
		List<AssetEntry> results = new ArrayList<AssetEntry>();
//		DynamicQuery query = DynamicQueryFactoryUtil.forClass(AssetEntry.class)
//				.add(PropertyFactoryUtil.forName("title").eq("111122222222"));
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(AssetEntry.class)
				.add(PropertyFactoryUtil.forName("classNameId").eq(new Long(10116)))
				.add(PropertyFactoryUtil.forName("classPK").eq(new Long(23010)))
				.add(PropertyFactoryUtil.forName("userId").eq(new Long(10201)));
		List<AssetEntry> temp;
		try {
			temp = AssetEntryLocalServiceUtil.dynamicQuery(query);
			for (AssetEntry assetEntry : temp) {
				System.out.println("title = " + assetEntry.getTitle());
			}
			results.addAll(AssetEntryLocalServiceUtil.dynamicQuery(query));
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
//		System.out.println("filename  = " +request.getAttribute("filename"));
//		String filename = request.getParameter("filename");
		String filename = (String) request.getAttribute("filename");
		System.out.println("filename =" + filename);
		if(filename!=null || !"".equals(filename) || !"null".equals(filename)){
			System.out.println("1111111");
			super.doView(request,  response);
		}else{
			System.out.println("222222222");
			include("/html/demo6/download.jsp", request, response);
		}
	}

	@ProcessAction(name = "download")
	public void download(ActionRequest request, ActionResponse response)
			throws PortletException, IOException, PortalException,
			SystemException {
		System.out.println("download ");
		String filename = request.getParameter("filename");
		System.out.println("filename =" + filename);
		request.setAttribute("filename", filename);
//		getPortletContext().getRequestDispatcher("/download.jsp").include(
//				request, response);
//		include("/html/demo6/download.jsp", request, response);

	}
	
	/*@RenderMapping(params = "action=edit")
	public String edit(Model model){
		model.addAttribute("edit", "action=edit");
		return "edit";
	}*/
}
