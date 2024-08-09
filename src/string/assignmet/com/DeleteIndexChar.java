/*
 * Q21. String s="Welcome to the India"
     Output: Wlcme t th nd

 */

package string.assignmet.com;

import java.util.Scanner;

public class DeleteIndexChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter string 1: ");
	     String str = sc.nextLine();
	     char ch[]=str.toCharArray();
	     for(int i=0;i<ch.length;i++) {
	    	 if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
	    		 continue;
	    	 }
	    	 System.out.print(ch[i]+" ");
	     }
	}

}
