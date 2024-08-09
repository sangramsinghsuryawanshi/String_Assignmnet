/*
 * Q15. WAP to reverse the word that are present at even index.
 */

package string.assignmet.com;

import java.util.Scanner;

public class ReplaceTheWordAtEvenInd {
	public static void rev(String s) {
		String s1[] = s.split(" ");
		for(int i=0;i<s1.length;i++) {
			if(i%2==0) {
				s1[i]=revm(s1[i]);
			}
			System.out.println(s1[i]+" ");
		}
	}
	public static String revm(String s) {
		char ch[]=s.toCharArray();
		char s1[] = new char[ch.length];
		int ind=0;
		for(int i=ch.length-1;i>=0;i--) {
			s1[ind++]=ch[i];
		}
		String str = new String(s1);
		return str;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String s = sc.nextLine();
		ReplaceTheWordAtEvenInd r = new ReplaceTheWordAtEvenInd();
		ReplaceTheWordAtEvenInd.rev(s);
		ReplaceTheWordAtEvenInd.revm(s);
	}

}
