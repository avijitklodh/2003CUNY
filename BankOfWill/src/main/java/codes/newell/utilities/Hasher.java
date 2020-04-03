package codes.newell.utilities;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

import javax.xml.bind.DatatypeConverter;

public final class Hasher {

	private static String salt = "defaultsaltevenlesssecurethanthealreadynotsecure$$(*BW(EVFSDOIFHSLKEGHskldhf";

	public static String hash(String input) {
		input += salt;
		try {
			// Every implementation of Java is required to support this.
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(input.getBytes(StandardCharsets.UTF_8));
			byte[] digest = md.digest();

			return DatatypeConverter.printHexBinary(digest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	public static void setSalt(String salt) {
		Hasher.salt = salt;
	}

	public static void main(String[] args) {
		// expect 44123bdcf25e60dc4099368afcad808f34aa993f2d01266e676ffa6d811fceb1
		System.out.println(Hasher.hash("Javarmi123"));

		// expect f1d5f8d75bb55c777207c251d07d9091dc10fe7d6682db869106aacb4b7df678
		Hasher.setSalt("");
		System.out.println(Hasher.hash("Javarmi123"));

	}

}
