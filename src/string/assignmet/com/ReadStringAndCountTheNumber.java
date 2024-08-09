/*
 * 1. Write a Java program that reads a string and counts the
 *  number of digits in the string. 
 */

package string.assignmet.com;

import java.util.Scanner;

public class ReadStringAndCountTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		int cnt=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				cnt++;
			}
		}
		System.out.println("Given number of digits in string is: "+cnt);
	}

}
