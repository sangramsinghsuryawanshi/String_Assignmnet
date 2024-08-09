package string.assignmet.com;

import java.util.Scanner;

public class RemoveTheLastOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		char c[]=str.toCharArray();
		char ch='i';
		int cnt=str.lastIndexOf(ch);
		System.out.println("------------------------\nlast occurrence removed: ");
		for(int i=0;i<c.length;i++) {
			if(i==cnt) {
				continue;
			}
			System.out.print(c[i]+" ");
		}
	}

}
