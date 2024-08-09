package string.assignmet.com;

import java.util.Scanner;

public class PrintStringInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		String s[]= str.split(" ");
		System.out.print("Reverse String is: ");
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]+" ");
		}
	}
}
