package string.assignmet.com;

import java.util.Arrays;
import java.util.Scanner;

public class CheckFirstAndLastCharIsSameOrNot {

	CheckFirstAndLastCharIsSameOrNot(String str) {
		char c[] = str.toCharArray();
		String s="";
		for(int i=0;i<c.length;i++) {
			if(c[0]==c[c.length-1]) {
				String sub=str.substring(1, c.length-1);
				System.out.println("String without those charater is: "+sub);
				break;
			}else {
				System.out.println("The string is unchanged: ");
				break;
			}
		}
	}

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str = sc.nextLine();
        CheckFirstAndLastCharIsSameOrNot c = new CheckFirstAndLastCharIsSameOrNot(str);
    }
}

