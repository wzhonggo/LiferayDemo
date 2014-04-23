package com.labimo.portlet;

import java.util.UUID;

public class PortletUtil {
	public static String getUuid() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();

	}
	
}
