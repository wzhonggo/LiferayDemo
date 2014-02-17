package com.labimo.licensor;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Properties;
import java.util.UUID;

import com.labimo.model.License;

public class LicenseUtils {
	
	private static byte[] digest = new byte[] { (byte) 0x0E, (byte) 0x63, (byte) 0x63,
			(byte) 0x06, (byte) 0xDB, (byte) 0x12, (byte) 0x3C, (byte) 0x22,
			(byte) 0x34, (byte) 0x89, (byte) 0xE7, (byte) 0xFF, (byte) 0xF9,
			(byte) 0xB0, (byte) 0x40, (byte) 0xDE, (byte) 0x13, (byte) 0xF6,
			(byte) 0xE0, (byte) 0x14, (byte) 0x3B, (byte) 0xBF, (byte) 0x7C,
			(byte) 0x27, (byte) 0x59, (byte) 0x3A, (byte) 0xE2, (byte) 0x03,
			(byte) 0x79, (byte) 0xDF, (byte) 0xB2, (byte) 0xE1, };
	private static  String publicKey = "pubring.gpg";
	

	public static com.labimo.licensor.License decode(String licenseString) throws Exception {
		com.labimo.licensor.License license = new com.labimo.licensor.License();
		
		license.loadKeyRing(LicenseUtils.class.getClassLoader().getResourceAsStream(
				publicKey), digest);
//		license.setLicense(licenseString);
//		license.setLicenseEncoded((new ByteArrayInputStream(licenseString.getBytes())));
		license.setLicenseEncoded(licenseString);

//		 license.setLicenseEncodedFromFile("license.txt");
		
		
//		System.out.println("++++++++++++++++++++++++++++++++++++++++");
//		System.out.println(licenseString);
//		System.out.println("===================================================================");
//		System.out.println(license.getLicenseString());
//		System.out.println("===================================================================");
//        System.out.println(license.getFeature("issue-date"));
//        System.out.println(license.getFeature("valid-date"));
		return license;

	}
	
	
	public static Properties getLicenseProperties(String licenseString) throws Exception {
		Properties licenseProperties = null;
		com.labimo.licensor.License license = new com.labimo.licensor.License();
		
//		license.loadKeyRing(LicenseUtilsTest.class.getClassLoader().getResourceAsStream(publicKey), digest);
		license.loadKeyRing(LicenseUtilsTest.class.getClassLoader().getResourceAsStream("pubring.gpg"), digest);
//		license.loadKeyRing("pubring.gpg", digest);
		
		license.setLicenseEncoded(licenseString);
		 if (license.isVerified()) {
			 licenseProperties =  license.licenseProperties;
         } else {
             System.err.println("The license can not be verified.");
             
         }
		 return licenseProperties; 

	}
	

	
	public static String getUuid() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();

	}

}
