/*
 * 11.
Input : Geeks$For$Geeks
Output : String is not accepted.
Input : Geeks For Geeks
Output : String is accepted

 */
package string.assignmet.com;

import java.util.Scanner;

public class CheckStringAcceptedOrNot {
	public void checkString(String str) {
		String s="$";
		char ch[]=str.toCharArray();
		char v='$';
		for(int i=0;i<str.length();i++) {
			if(str.contains(s)) {
				System.out.println("String is not accepted");
				break;
			}else {
				System.out.println("String is accepted");
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		CheckStringAcceptedOrNot c = new CheckStringAcceptedOrNot();
		c.checkString(str);
	}

}
