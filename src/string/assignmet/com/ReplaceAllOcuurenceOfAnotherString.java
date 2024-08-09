package string.assignmet.com;

import java.util.Scanner;

public class ReplaceAllOcuurenceOfAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string 1: ");
		String str = sc.nextLine();
		System.out.println("Enter given string 2: ");
		String str1 = sc.nextLine();
		String st=str.replaceAll(str, str1);
		System.out.println("------------------------\nReplace all occurrence with another string: ");
		for(int i=0;i<st.length();i++) {
			System.out.print(st.charAt(i));
		}
	}

}
