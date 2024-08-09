/*
 * 9. Wap enter a string and rotate the character 
 * clockwise direction.
 */

package string.assignmet.com;

import java.util.Scanner;

public class RotatesTheCharInClockWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		char ch[]=str.toCharArray();
		char ch1=ch[ch.length-1];
		for(int i=ch.length-1;i>0;i--) {
			ch[i]=ch[i-1];
		}
		ch[0]=ch1;
		System.out.println("Clock wise direction: ");
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+"");
		}
	}

}
