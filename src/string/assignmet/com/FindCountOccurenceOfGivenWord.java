package string.assignmet.com;

import java.util.Scanner;

public class FindCountOccurenceOfGivenWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string : ");
		String str = sc.nextLine();
		String s1[]=str.split(" ");
		String s="java";
		int c=0;
		for(int i=0;i<s1.length;i++) {
			if(s1[i].equals(s)){
				c++;
			}
		}
		System.out.println("given word occurence: "+c);
	}

}
