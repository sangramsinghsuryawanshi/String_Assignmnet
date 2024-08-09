package string.assignmet.com;

import java.util.Scanner;

public class RemoveFirstOccurrenceWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string : ");
		String str = sc.nextLine();
		String s[]=str.split(" ");
		int cnt=0;
		for(int i=0;i<s.length;i++) {
			if(s[0].equals(s[i]) && cnt>0) {
				continue;
			}
			cnt++;
			System.out.print(s[i]+" ");
		}
	}

}
