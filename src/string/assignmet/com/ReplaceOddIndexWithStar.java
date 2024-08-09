/*
 * 7. WAP to replace all the odd index character with *(Star) in String. 
 */

package string.assignmet.com;

import java.util.Scanner;

public class ReplaceOddIndexWithStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		char ch[]=str.toCharArray();
		System.out.print("Replace all the odd index with *: ");
		for(int i=0;i<ch.length;i++) {
			if(i%2==0 && ch[i]!=' ') {
				System.out.print(ch[i]+"*");
			}
		}
	}

}
