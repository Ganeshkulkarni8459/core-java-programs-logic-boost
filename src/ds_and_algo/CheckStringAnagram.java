package ds_and_algo;

import java.util.Arrays;

public class CheckStringAnagram {
	public static boolean isAnagram(String str1,String str2) {
		//remove all spaces and convert string into lowercase
		// '\\s'=regular expression for white space
		str1 = str1.replaceAll("\\s", " ").toLowerCase();
		str1 = str1.replaceAll("\\s", " ").toLowerCase();
		
		if(str1.length() != str2.length()) {
			return false;
		}
		char[] Array1 = str1.toCharArray();
		char[] Array2 = str2.toCharArray();
		
		Arrays.sort(Array1);
		Arrays.sort(Array2);
		
		return Arrays.equals(Array1, Array2);
	}
	public static void main(String[] args) {
        String str1 = "race  ";
        String str2 = "care";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

}
