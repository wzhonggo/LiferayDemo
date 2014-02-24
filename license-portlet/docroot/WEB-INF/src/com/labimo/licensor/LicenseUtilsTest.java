package com.labimo.licensor;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.UUID;

import org.apache.commons.io.IOUtils;

//import com.labimo.model.License;
import com.liferay.portal.kernel.util.FileUtil;

public class LicenseUtilsTest {
	
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
		
//		license.loadKeyRing(LicenseUtilsTest.class.getClassLoader().getResourceAsStream(publicKey), digest);
		license.loadKeyRing(LicenseUtilsTest.class.getClassLoader().getResourceAsStream("pubring.gpg"), digest);
//		license.loadKeyRing("pubring.gpg", digest);
		
		license.setLicenseEncoded(licenseString);
		 if (license.isVerified()) {
             System.out.println("---LICENSE STRING PLAIN TEXT START\n");
             for(Entry<Object, Object> entry : license.licenseProperties.entrySet()){

                 System.out.println(entry.getKey() + " = " + entry.getValue());

             }
             System.out.println("---LICENSE STRING PLAIN TEXT END\n");
             System.out.println("Encoding license key id=" + license.getDecodeKeyId() + "L\n");
             System.out.println("---KEY RING DIGEST START\n");
             System.out.println(license.dumpPublicKeyRingDigest());
             System.out.println("---KEY RING DIGEST END\n");
         } else {
        	 license = null;
             System.err.println("The license can not be verified.");
         }
		return license;

	}
	
	
	
	

	
	
	public static String getUuid() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();

	}
	
	public static void main(String[] args){
		Utils utils = new Utils();
//		utils.setLicenseUuid("123456");
		System.out.println(utils.getLicenseUuid());
	}
	
	
	

}
