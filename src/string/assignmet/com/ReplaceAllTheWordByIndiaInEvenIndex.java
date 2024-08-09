/*
 * Q19. WAP to replace all the words by 
 * INDIA that are prensent at even index.
 */

package string.assignmet.com;

import java.util.Scanner;

public class ReplaceAllTheWordByIndiaInEvenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter string 1: ");
	     String str = sc.nextLine();
	     String s[]=str.split(" ");
	     for(int i=0;i<s.length;i++) {
	    	 if(i%2==0) {
	    		 s[i]="INDIA";
	    	}
	    	 System.out.println(s[i]);
	    }
	}
}
