package string.assignmet.com;

import java.util.Scanner;

public class ConvertTheFirstChaiInUpperCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		String s[] = str.split(" ");
		String d1 =" ";
		System.out.print("\nGiven first charater in upper case is: ");
		for(int i=0;i<s.length;i++) {
			d1+=Character.toUpperCase(s[i].charAt(0))+s[i].substring(1)+" ";
		}
		System.out.println(d1+" ");
	}
}
