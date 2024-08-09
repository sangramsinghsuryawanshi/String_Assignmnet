package string.assignmet.com;

import java.util.Scanner;

public class RemoveFirstOccurrenceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		char c[]=str.toCharArray();
		char ch='a';
		int cnt=0;
		int max=str.indexOf(ch);
		System.out.println("------------------------\nfirst occurrence removed: ");
		for(int i=0;i<c.length;i++) {
			if(i==max && cnt<=0) {
				continue;
			}
			if(cnt>=0)
			System.out.print(c[i]+" ");
		}
	}
}
