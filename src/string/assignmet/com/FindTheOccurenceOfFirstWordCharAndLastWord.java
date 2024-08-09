package string.assignmet.com;

import java.util.Scanner;

public class FindTheOccurenceOfFirstWordCharAndLastWord {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter given string: ");
			String s = sc.nextLine();
			String s1[]=s.split(" ");
			String fword=s1[0];
			String lword=s1[s1.length-1];
			char c =s.charAt(0);
			char c1=s.charAt(s.length()-1);
			int cnt=0,cnt1=0,cnt2=0,cnt3=0;
			for(int i=0;i<s1.length;i++) {
				if(s1[i].equals(fword)) {
					cnt++;
				}if(s1[i].equals(lword)) {
					cnt1++;
				}
			}
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==c) {
					cnt2++;
				}if(s.charAt(i)==c1) {
					cnt3++;
				}
			}
			System.out.println("First word occurrence: "+cnt);
			System.out.println("last word occurrence: "+cnt1);
			System.out.println("First chrarcater occurrence: "+cnt2);
			System.out.println("First chrarcater occurrence: "+cnt3);
	}
}
