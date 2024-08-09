package string.assignmet.com;

import java.util.Scanner;

public class PrintThoseWordFristCharIsVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		String s[] = str.split(" ");
		System.out.print("\nGiven word which first character is vowel: ");
		for(int i=0;i<s.length;i++) {
			if(s[i].charAt(0)=='a' || s[i].charAt(0)=='e' || s[i].charAt(0)=='i' || s[i].charAt(0)=='o' || s[i].charAt(0)=='u' ) {
				System.out.print(s[i]+" ");
			}
		}
	}

}
