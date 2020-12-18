package aes256;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

public class AesTest {

	public static void main(String[] args) throws NoSuchAlgorithmException, GeneralSecurityException {
		try {
			AES256Util util = new AES256Util() ;
			System.out.println(util.encrypt("jckim"));
			//"K94HxzMUNPRYPveKbjbeFA==", 
			
			System.out.println(util.decrypt("Q/PjoA7XyFm+Ot8H4Snd6g=="));
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
	}

}
