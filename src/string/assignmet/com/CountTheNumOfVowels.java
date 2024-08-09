/*
 * 2. Write a program that takes in a string and counts 
 * the number of vowels in it.	
 */

package string.assignmet.com;

import java.util.Scanner;

public class CountTheNumOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		int cnt=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'
					||str.charAt(i)=='o' || str.charAt(i)=='u') {
				cnt++;
			}
		}
		System.out.println("Given number of vowels in string is: "+cnt);
	}

}