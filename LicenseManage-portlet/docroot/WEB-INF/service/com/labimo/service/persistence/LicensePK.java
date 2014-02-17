/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.labimo.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author wzgong
 */
public class LicensePK implements Comparable<LicensePK>, Serializable {
	public String licenseUuid;
	public String hardwareUuid;

	public LicensePK() {
	}

	public LicensePK(String licenseUuid, String hardwareUuid) {
		this.licenseUuid = licenseUuid;
		this.hardwareUuid = hardwareUuid;
	}

	public String getLicenseUuid() {
		return licenseUuid;
	}

	public void setLicenseUuid(String licenseUuid) {
		this.licenseUuid = licenseUuid;
	}

	public String getHardwareUuid() {
		return hardwareUuid;
	}

	public void setHardwareUuid(String hardwareUuid) {
		this.hardwareUuid = hardwareUuid;
	}

	@Override
	public int compareTo(LicensePK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = licenseUuid.compareTo(pk.licenseUuid);

		if (value != 0) {
			return value;
		}

		value = hardwareUuid.compareTo(pk.hardwareUuid);

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LicensePK)) {
			return false;
		}

		LicensePK pk = (LicensePK)obj;

		if ((licenseUuid.equals(pk.licenseUuid)) &&
				(hardwareUuid.equals(pk.hardwareUuid))) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(licenseUuid) + String.valueOf(hardwareUuid)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("licenseUuid");
		sb.append(StringPool.EQUAL);
		sb.append(licenseUuid);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("hardwareUuid");
		sb.append(StringPool.EQUAL);
		sb.append(hardwareUuid);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}