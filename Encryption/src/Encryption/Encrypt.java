package Encryption;

public class Encrypt {
	public static void main(String[] args) {
		final String secretKey="somerandomsecretkey";
		String originalString="Subhanshu";
		String encrypt=new Encryption().encrypt(originalString,secretKey);
		String decrypt=new Encryption().decrypt(encrypt,secretKey);
		System.out.println(encrypt);
		System.out.println(decrypt);
	}

}
