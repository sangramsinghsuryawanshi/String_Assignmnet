package string.assignmet.com;

import java.util.Scanner;

public class ReplaceLastOccurrneceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		System.out.println("Enter given character: ");
		char ch1=sc.next().charAt(0);
		String st=str.replace('a', ch1);
		System.out.println("------------------------\nReplace last occurrence: ");
		for(int i=0;i<st.length();i++) {
			System.out.print(st.charAt(i));
		}
	}
}
