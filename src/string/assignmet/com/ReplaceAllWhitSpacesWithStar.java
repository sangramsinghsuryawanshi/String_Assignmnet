/*
 *  Q13. Wap take a string and replace all whilespace  with start(*).

i/p
String s=java is a very good programming language";
o/p
String s=java*is*a*very*good*programming*language;

 */

package string.assignmet.com;

import java.util.Scanner;

public class ReplaceAllWhitSpacesWithStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter string 1: ");
	        String str = sc.nextLine();
	        String s=str.replaceAll(" ", "*");
	        for(int i=0;i<str.length();i++) {
	        	System.out.print(s);
	        	break;
	        }
	}

}
