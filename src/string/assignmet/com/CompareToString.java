/*
 * Q14. Write a Java program to compare two strings 
 lexicographically, ignoring case differences. 
Sample Output:
String 1: This is exercise 1
String 2: This is Exercise 1
"This is exercise 1" is equal to "This is Exercise 1"

 */

package string.assignmet.com;

import java.util.Scanner;

public class CompareToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter string 1: ");
	     String str = sc.nextLine();
	     System.out.print("Enter string 2: ");
	     String str1 = sc.nextLine();
	     for(int i=0;i<str.length();i++) {
	    		 if(str.equalsIgnoreCase(str1)) {
	    			 System.out.println("This is exercise 1 is equal to This is Exercise 1");
	    			 break;
	    		 }
	     }
	     
	}

}
