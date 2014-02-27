package com.labimo.licensor;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

import com.labimo.model.Activation;
import com.labimo.model.License;
import com.labimo.portlet.LicenseManage;
import com.labimo.service.ActivationLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;

public class LicenseUtils {
	
	private static byte[] digest = new byte[] { (byte) 0x0E, (byte) 0x63, (byte) 0x63,
			(byte) 0x06, (byte) 0xDB, (byte) 0x12, (byte) 0x3C, (byte) 0x22,
			(byte) 0x34, (byte) 0x89, (byte) 0xE7, (byte) 0xFF, (byte) 0xF9,
			(byte) 0xB0, (byte) 0x40, (byte) 0xDE, (byte) 0x13, (byte) 0xF6,
			(byte) 0xE0, (byte) 0x14, (byte) 0x3B, (byte) 0xBF, (byte) 0x7C,
			(byte) 0x27, (byte) 0x59, (byte) 0x3A, (byte) 0xE2, (byte) 0x03,
			(byte) 0x79, (byte) 0xDF, (byte) 0xB2, (byte) 0xE1, };
	private static  String publicKey = "pubring.gpg";
	private static  String password = "123456789";
	private static String pattern = "yyyy-MM-dd";
	

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
	
	
	public static List<Activation> getActivationListByLicenseUuid(String licenseUuid) {
	
		List<Activation> activationList = new ArrayList<Activation>();
		try {
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(Activation.class).add(
					PropertyFactoryUtil.forName("licenseUuid").eq(licenseUuid));
			activationList = ActivationLocalServiceUtil.dynamicQuery(query);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return activationList;

	}
	
	public static String getHardwareUuidsByLicenseUuid(String licenseUuid) {
		
		String hardwareUuids=""; 
		List<Activation> activationList = new ArrayList<Activation>();
		try {
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(Activation.class).add(
					PropertyFactoryUtil.forName("licenseUuid").eq(licenseUuid));
			activationList = ActivationLocalServiceUtil.dynamicQuery(query);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		for(Activation activation : activationList ){
			hardwareUuids += activation.getHardwareUuid()+ " ";
		}
		return hardwareUuids;

	}

	
	public static String  getChargesLicenseContent(String hardwareUuid,
			String issueDate, String validDate) throws Exception {

	
		com.labimo.licensor.License license = new com.labimo.licensor.License();
//		HardwareBinder hb = new HardwareBinder();
//		hb.setUseHwAddress();
		// System.out.print(hb.getMachineIdString());
//		Utils utils = new Utils();
		license.setLicense("uuid=" + hardwareUuid
				+ "\n issue-date=" +issueDate +" \n valid-date=" + validDate);
		license.loadKey(
				LicenseManage.class.getClassLoader().getResourceAsStream(
						"secring.gpg"), "wzhonggo (test) <wzhonggo@test.com>");

		// String licenseFileName = "chargesLicense.txt";
		String encoded = license.encodeLicense(password);
		// OutputStream os = new FileOutputStream(licenseFileName);
		// os.write(encoded.getBytes("utf-8"));
		// os.close();

		System.out.println(encoded.length());
		return encoded;
	}
	
	public static String getChargesLicenseContent(String hardwareUuid,
			Date issueDate, Date validDate) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		 return getChargesLicenseContent(hardwareUuid,
				sdf.format(issueDate) , sdf.format(validDate));
	}
	
	
	public static String getCustomUuid(UUID uuid) {
		  String id ="";
	        int position = 2;
	        int radix = 36;
	        long value = 3;
	        long least =uuid.getLeastSignificantBits();
	        long most  =uuid.getMostSignificantBits();
	        long leastValue = least & value;
	        long mostValue = most & value;
	        long sumValue = ((leastValue)<< 2) | mostValue;

	  
	        String lastString = Long.toString(least >>> position, radix);

	        int lastIndex=lastString.length();
	        for(; lastIndex<12; lastIndex++){
	            lastString = "0" + lastString;
	        }
	        String mostString = Long.toString(most >>> position, radix);

	        int  mostIndex=mostString.length();
	        for(; mostIndex<12; mostIndex++){
	            mostString = "0" + mostString;
	        }
	        String uuidPrefix = lastString + mostString;      

	        long sum = 0;
	        for(char c : uuidPrefix.toCharArray()){
	            sum  = sum +  Long.parseLong(String.valueOf(c), radix);
	        }
	      
	        sum =sum<<4 | sumValue;
	        String uuidSuffix  = Long.toString(sum , radix) ;
	        int uuidSuffixIndex=uuidSuffix.length();
	        for(; uuidSuffixIndex<3; uuidSuffixIndex++){
	            uuidSuffix = "0" + uuidSuffix;
	        }
	        id = uuidPrefix + uuidSuffix;
	        id = id.toUpperCase();
	   
	        return id;

	}
	
	public static boolean checkUuid(String uuid){
		boolean result = false;
	
		int uuidLength=27;
		int radix = 36;
		int length=24;
		
		if(uuid!=null && uuid.length()==uuidLength){
			uuid = uuid.toLowerCase();
			String hUuid = uuid.substring(0, length);
			String uuidsuffix = uuid.substring(length, uuid.length());
			System.out.println("hUuid=" + hUuid);
			System.out.println("srcCode=" + uuidsuffix);
			
			long  srcCode= Long.parseLong(uuidsuffix, radix) >> 4;
			 long destCode = 0;
		     for(char c : hUuid.toCharArray()){
		    	 destCode  = destCode +  Long.parseLong(String.valueOf(c), 36);
		     }
			System.out.println("destCode=" +  destCode);
			System.out.println("srcCode=" +  srcCode);
			if(srcCode == destCode){
				result =true;
			}
			
			
	}
		return result;
		
	}
	
	
	public static String formatToUuid(String uuid){
		if(uuid!=null && uuid.length()==27){
			uuid = uuid.substring(0, 5) + "-" + uuid.substring(5,9)+ "-" + uuid.substring(9,14)+ "-" + uuid.substring(14,18) + "-" + uuid.substring(18, 23) + "-" + uuid.substring(23, 27);
		}
		return uuid;
	}
	
	public static String formatToString(String uuid){
		if(uuid!=null){
			uuid = uuid.replaceAll("-", "");
		}

		return uuid;
	}
}
