/*
 * 10. Wap enter a string and rotate the 
 * character Anti-clockwise direction.
 */

package string.assignmet.com;

import java.util.Scanner;

public class RotateCharAntiClockWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		char ch[]=str.toCharArray();
		char c=ch[0];
		for(int i=0;i<ch.length-1;i++) {
			ch[i]=ch[i+1];
		}
		ch[ch.length-1]=c;
		System.out.print("Anti-Clock wise direction: ");
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+"");
		}
	}

}
