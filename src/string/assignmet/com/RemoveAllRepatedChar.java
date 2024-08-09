package string.assignmet.com;

import java.util.Scanner;

public class RemoveAllRepatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		char c[]=str.toCharArray();
		System.out.println("------------------------\nRemoved all repated occurrence: ");
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]&& c[i]!=' ') {
					c[j]='\0';
				}
			}
			if(c[i]!='\0') {
				System.out.print(c[i]);
			}
		}
	}

}
