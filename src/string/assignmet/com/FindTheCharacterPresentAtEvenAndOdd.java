/*
 * 3. Wap enter a string and the character present
 *  at even and odd position individually.
 */

package string.assignmet.com;

import java.util.Scanner;

public class FindTheCharacterPresentAtEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if((i+1)%2==0 && ch[i]!=' ') {
				System.out.println("Even: "+str.charAt(i));
			}else if((i+1)%2!=0 && ch[i]!=' ') {
				System.out.println("Odd: "+str.charAt(i));
			}
		}
	}

}
