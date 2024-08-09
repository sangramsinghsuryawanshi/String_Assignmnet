package string.assignmet.com;

import java.util.Scanner;

public class ReplaceFirstOccurrenceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		System.out.println("Enter given character: ");
		char ch1=sc.next().charAt(0);
		String ch=str.replace('a', ch1);
		System.out.println("------------------------\nReplace first occurrence: ");
		for(int i=0;i<ch.length();i++) {
			System.out.print(ch.charAt(i));
		}

	}

}
