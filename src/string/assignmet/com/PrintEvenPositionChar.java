/*
 * 4. Wap enter a string and print the character present at even position.
 */

package string.assignmet.com;

import java.util.Scanner;

public class PrintEvenPositionChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		char ch[]=str.toCharArray();
		System.out.print("Given even positon character is: ");
		for(int i=0;i<ch.length;i++) {
			if((i+1)%2==0 && ch[i]!=' ') {
				System.out.print(ch[i]+" ");
			}
		}
	}

}
