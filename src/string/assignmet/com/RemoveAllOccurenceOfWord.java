package string.assignmet.com;

import java.util.Scanner;

public class RemoveAllOccurenceOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string : ");
		String str = sc.nextLine();
		String s[]=str.split("java");
		String s1="Java";
		int c=0;
		for(int i=0;i<s.length;i++) {
			if(s[i]==s1) {
				c++;
			}
			System.out.print(s[i]+" ");
		}

	}

}
