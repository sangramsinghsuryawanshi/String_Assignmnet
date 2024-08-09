package string.assignmet.com;

import java.util.Scanner;

public class RotateTheWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter string 1: ");
	     String str = sc.nextLine();
	     String s[]=str.split(" ");
	     for(int i=s.length-1;i>=0;i--) {
	    	 System.out.print(s[i]+" ");
	     }
	}
}
