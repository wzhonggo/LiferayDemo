package com.test;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.counter.service.CounterLocalService;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;
import com.liferay.portlet.social.model.SocialActivity;
import com.liferay.portlet.social.service.SocialActivityLocalService;
import com.liferay.portlet.social.service.SocialActivityLocalServiceUtil;
import com.liferay.portlet.social.service.persistence.SocialActivityPersistence;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.model.Foo;
import com.test.model.impl.FooImpl;
import com.test.service.FooLocalService;
import com.test.service.FooLocalServiceUtil;
import com.test.service.impl.FooLocalServiceImpl;

/**
 * Portlet implementation class Demo4
 */
public class Demo4 extends MVCPortlet {

	public void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		System.out.println("Demo4  doView ");

		// Foo foo = new FooImpl();
		// foo.setCreateDate(new Date());
		// foo.setUserName("wzgong");
		// try {
		// FooLocalServiceUtil.addFoo(foo);
		// } catch (SystemException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		System.out.println("Demo4 setvalue");
		System.out.println("=============================================");
		for (String key : request.getParameterMap().keySet()) {
			System.out.println(key + " = " + request.getParameter(key));
		}

		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(com.liferay.portal.kernel.util.WebKeys.THEME_DISPLAY);
		Layout layout = themeDisplay.getLayout();
		long plid = layout.getPlid();
		System.out.println("layout plid = " + plid);
		System.out.println("layout name  = " + layout.getName());
		System.out.println("=============================================");
		
		
		

		// add page rating to request attribute
		System.out.println("getPathMain  = " + themeDisplay.getPathMain());
		Foo foo = null ;
		try {
			foo = FooLocalServiceUtil.getFoo(0);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("resourcePK", String.valueOf(foo.getFooId()));
		//request.setAttribute("resourcePK", String.valueOf(foo.getFooId()));
		super.doView(request, response);
	}

	@ProcessAction(name = "getValue")
	public void getValue(ActionRequest request, ActionResponse response)
			throws PortletException, IOException, PortalException,
			SystemException {
		System.out.println("Demo4 getValue");
		String userName = request.getParameter("name");
		System.out.println("userName = " + userName);

		String userName2 = ParamUtil.getString(request, "name");
		System.out.println("userName2 = " + userName2);

		DynamicQuery query = DynamicQueryFactoryUtil.forClass(Foo.class).add(
				PropertyFactoryUtil.forName("userName").eq(userName));
		List<Foo> results = FooLocalServiceUtil.dynamicQuery(query);
		String getVaule = null ;
		if (results != null && results.size() > 0) {
			Foo foo = results.get(0);
			System.out.println(foo.getUserName());
			getVaule = foo.getUserName();
			request.setAttribute("name", foo.getUserName());
		}
		
		
		String className = Foo.class.getName();
		long classPK = 15414;
		JSONObject extraDataJSONObject = JSONFactoryUtil.createJSONObject();
		extraDataJSONObject.put("title", "get value :" + getVaule);

		User currentUser = PortalUtil.getUser(request);
		long gourpId = 12809;
//		long gourpId = currentUser.getGroupId();
		 System.out.println("gourpId  =  " + currentUser.getGroupId());
		
		SocialActivityLocalServiceUtil.addActivity(currentUser.getUserId(),
				gourpId, className, classPK, Demo4onstants.GET_VALUE,
				extraDataJSONObject.toString(), 0);

	}

	@ProcessAction(name = "setvalue")
	public void setvalue(ActionRequest request, ActionResponse response)
			throws PortletException, IOException, PortalException,
			SystemException {
		System.out.println("Demo4 setvalue");
		String userName = request.getParameter("userName");
		System.out.println("userName = " + userName);
		String userName2 = ParamUtil.getString(request, "userName");
		System.out.println("userName2 = " + userName2);
		Foo foo = new FooImpl();
		foo.setCreateDate(new Date());
		foo.setFooId(FooLocalServiceUtil.getFoosCount() + 1);
		foo.setUserName(userName);
		FooLocalServiceUtil.addFoo(foo);
		System.out.println(foo.getUserName());

		// String className = ParamUtil.getString(request, "className"); //
//		long classPK = ParamUtil.getLong(request, "classPK");
//		String className = "com.test.model.Foo";
		String className = Foo.class.getName();
		long classPK = 15414;
		// AssetEntry assetEntry = AssetEntryLocalServiceUtil.fetchEntry( // className,
//				classPK);

		JSONObject extraDataJSONObject = JSONFactoryUtil.createJSONObject();
		extraDataJSONObject.put("title", "set value :" + userName);

		User currentUser = PortalUtil.getUser(request);
		long gourpId = 12809;
//		long gourpId = currentUser.getGroupId();
		 System.out.println("gourpId  =  " + currentUser.getGroupId());
		
		SocialActivityLocalServiceUtil.addActivity(currentUser.getUserId(),
				gourpId, className, classPK, Demo4onstants.SET_VALUE,
				extraDataJSONObject.toString(), 0);
	}
}
