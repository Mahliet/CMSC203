
public class CryptoManager 
{
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) 
	{
		
		boolean bound;
		for(int k=0; k<plainText.length();k++)
		{
			if(plainText.charAt(k)>=32 && plainText.charAt(k)<=95)
			{
				return bound=true;
			}
			else
			{
				 return bound=false;
			}
		}
		throw new RuntimeException("method not implemented");
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key)
	{
	
		String encrytext="";
		key=wrapAround(key);
	    for (int k = 0; k < plainText.length(); k++)
		{
				encrytext += Character.toString((char) ((int) plainText.charAt(k) + key));
		}
		return encrytext;
	
	}
	public static int wrapAround(int key)
	{
		  while (key > UPPER_BOUND) 
		  {
		      key-= RANGE; 
		  }
		  return key;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) 
	{
		String encryB="";
		 while (bellasoStr.length() < plainText.length()) 
		 {
			 bellasoStr +=bellasoStr.substring(0, (plainText.length() - bellasoStr.length())); 
		 }
		 for(int k=0;k<plainText.length();k++)
		 {
			 char a=(char)wrapAround((int) plainText.charAt(k) + (int) bellasoStr.charAt(k));
			 encryB+=Character.toString(a);
		 }
		return encryB;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedText, int key) 
	{
		key=wrapAround(key);
		String decryCAtext="";
		for(int k=0;k<encryptedText.length();k++)
		{
			decryCAtext += Character.toString((char) ((int) encryptedText.charAt(k) - key));
		}
		return decryCAtext;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	
	
	public static String decryptBellaso(String encryptedText, String 
			bellasoStr)
			 {
			 String key="";
			 String decrypted="";
			 int x=0;
			 while(key.length()!=encryptedText.length())
			 {
				 key=key+bellasoStr.charAt(x); 
				 x++;
				 if(x==bellasoStr.length())
					 x=0;
			 }
			 
			 for(int i=0;i<encryptedText.length();i++)
			 {
				 int result=encryptedText.charAt(i)-key.charAt(i);
				 if(result<LOWER_BOUND)
				 { 
					 while(result<LOWER_BOUND)
						 result=result+RANGE;
				 } 
				 decrypted=decrypted+(char)result;
			 }
			 
			 	return decrypted;
			 }

}
