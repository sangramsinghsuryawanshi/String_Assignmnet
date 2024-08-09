/*
 * Q12.Wap enter a string and find the count of uppercase, 
 * lowercase, digits and special 
   characters in a string.
 */

package string.assignmet.com;

import java.util.Scanner;

public class FindTheCountOfCharAlphaDigit {

	FindTheCountOfCharAlphaDigit(String str) {
		int upperc=0,lowerc=0,digitc=0,specialcharc=0,sp=0;
		char str1='\0';
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++) {
			  sp++;
			 if(Character.isLowerCase(c[i])) {
				lowerc++;
			}else if(Character.isUpperCase(c[i])) {
				upperc++;
			}else if(Character.isDigit(c[i])) {
				digitc++;
			}else {
				specialcharc++;
			}
		}
		System.out.println("count of lower case is: "+lowerc);
		System.out.println("count of upper case is: "+upperc);
		System.out.println("count of digit is: "+digitc);
		System.out.println("count of special charater is: "+specialcharc);
	}

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str = sc.nextLine();
        FindTheCountOfCharAlphaDigit c = new FindTheCountOfCharAlphaDigit(str);
    }
}
