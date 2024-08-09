/*
 * Q17. WAP to print the frequncy of each word of String.
 */

package string.assignmet.com;

import java.util.Scanner;

public class FrequencyOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter string 1: ");
	     String str = sc.nextLine();
	     String s[]=str.split(" ");
	     for(int i=0;i<s.length;i++) {
	    	 int cnt=1;
	    	 for(int j=i+1;j<s.length;j++) {
	    		 if(s[i].equals(s[j])) {
	    			 cnt++;
	    			 s[j]="null";
	    		 }
	    	 }
	    	 if(s[i]!="null") {
	    		 System.out.println(s[i]+" count-> "+cnt); 
	    	 }
	     }
	}

}
