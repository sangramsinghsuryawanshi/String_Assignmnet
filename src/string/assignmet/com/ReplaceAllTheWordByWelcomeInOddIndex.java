package string.assignmet.com;

import java.util.Scanner;

public class ReplaceAllTheWordByWelcomeInOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter string 1: ");
	     String str = sc.nextLine();
	     String s[]=str.split(" ");
	     for(int i=0;i<s.length;i++) {
	    	 if(i%2!=0) {
	    		s[i]="welcome";
	    	}
	    	 System.out.print(s[i]+" ");
	    }
	}
}
