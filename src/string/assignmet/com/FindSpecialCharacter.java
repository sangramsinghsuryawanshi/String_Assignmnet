/*
 * 6. Program to check if a string contains any special character
 */

package string.assignmet.com;

import java.util.Scanner;

public class FindSpecialCharacter {
	public String specialChar(String str) {
		String s="[^a-zA-Z0-9]";
		for(int i=0;i<str.length();i++) {
			if(str.contains(s)) {
				return "A string not contains any special character";
			}
		}
		return "A string contains special character";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		FindSpecialCharacter f = new FindSpecialCharacter();
		String s1=f.specialChar(str);
		System.out.println(s1);
	}

}
