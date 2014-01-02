package com.test;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;

public class AssetEntryHelp {

	public static List<AssetEntry> getAssetEntries(Hits hits) {
		
		System.out.println("======================");
		List<AssetEntry> results = new ArrayList<AssetEntry>();
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(AssetEntry.class)
				.add(PropertyFactoryUtil.forName("title").eq("111122222222"));
//		DynamicQuery query = DynamicQueryFactoryUtil.forClass(AssetEntry.class)
//				.add(PropertyFactoryUtil.forName("className").eq(10116))
//				.add(PropertyFactoryUtil.forName("classPK").eq(23010))
//				.add(PropertyFactoryUtil.forName("userId").eq(10201));
		List<AssetEntry> temp;
		try {
			temp = AssetEntryLocalServiceUtil.dynamicQuery(query);
			for (AssetEntry assetEntry : temp) {
				System.out.println(assetEntry.getTitle());
			}
			results.addAll(AssetEntryLocalServiceUtil.dynamicQuery(query));
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return results;
	}

}
