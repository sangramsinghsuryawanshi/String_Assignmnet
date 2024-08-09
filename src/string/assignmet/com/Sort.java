package string.assignmet.com;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		String s[]=str.split(" ");
		Arrays.sort(s);
		System.out.println("Given ascending string is: "+Arrays.toString(s));
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].compareTo(s[j])<0) {
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println("Descending String is: "+Arrays.toString(s));
	}
}
