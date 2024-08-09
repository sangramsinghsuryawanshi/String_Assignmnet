/*
 * Write a Java program to find last occurrence of a character in a given string.
 */

package string.assignmet.com;

import java.util.Scanner;

public class FindLastOccurrenceOfCharacter {
	FindLastOccurrenceOfCharacter(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		char c[]=str.toCharArray();
		char maxele='m';
		int max=str.lastIndexOf(maxele);
		System.out.println("Last Occurrence of Given character is: "+max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindLastOccurrenceOfCharacter f = new FindLastOccurrenceOfCharacter();
	}

}
