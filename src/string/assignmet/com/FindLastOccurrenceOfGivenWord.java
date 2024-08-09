package string.assignmet.com;

import java.util.Scanner;

public class FindLastOccurrenceOfGivenWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string : ");
		String str = sc.nextLine();
		String s[] = str.split(" ");
		int c=0;
		for(int i=0;i<s.length;i++) {
			if(s[s.length-1].equals(s[i])) {
				c++;
			}
		}
		System.out.println("Last occurrence of given word: " +c);
	}

}
