/*
 * 5. Write a program to check if a given string starts 
 * with a vowel using charAt().
 */

package string.assignmet.com;

import java.util.Scanner;

public class CheckGivenStringStartWithVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(0)=='a'|| str.charAt(0)=='e' ||
					str.charAt(0)=='i' || str.charAt(0)=='o' || str.charAt(0)=='u') {
				System.out.println("Given string starts with vowel");
				break;
			}else {
				System.out.println("Given string not starts with vowel");
				break;
			}
		}
	}

}
