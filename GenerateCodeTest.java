package app;

import com.ccba.app.security.MD5Encrptor;
import org.apache.commons.lang3.RandomStringUtils;

public class GenerateCodeTest {

	public static void main(String[] args) {
//		String random = RandomStringUtils.random(6, true, true);
//        System.out.println(random);
		MD5Encrptor encService = new MD5Encrptor();
		String encPassword = encService.md5("A123456b");
		System.out.println("AAAAAAAA::"+encPassword);
	}

}
