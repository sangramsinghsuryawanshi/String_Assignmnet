/*
 * Q18. WAP print all the words of 
 * String that are starting from vowel character.
 */

package string.assignmet.com;

import java.util.Scanner;

public class FindStartingOfAllWorsIsVowelOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter string 1: ");
	     String str = sc.nextLine();
	     String s[]=str.split(" ");
	     System.out.println("String that are starting from vowel character");
	     for(int i=0;i<s.length;i++) {
	    	 if(s[i].charAt(0)=='a' || s[i].charAt(0)=='i' || 
	    			 s[i].charAt(0)=='o' || s[i].charAt(0)=='u' 
	    			 || s[i].charAt(0)=='e') {
	    		 System.out.print(s[i]+" ");
	    	 }
	     }
	}

}
