package string.assignmet.com;

import java.util.Scanner;

public class RemoveLastOccurrenceOfword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string : ");
		String str = sc.nextLine();
		String s[]=str.split(" ");
		int x=str.lastIndexOf(str);
		for(int i=0;i<s.length;i++) {
			if(i==x) {
				continue;
			}
			System.out.print(s[i]+" ");
		}
	}

}
