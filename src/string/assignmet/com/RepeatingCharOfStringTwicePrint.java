package string.assignmet.com;

import java.util.Scanner;

public class RepeatingCharOfStringTwicePrint {

	RepeatingCharOfStringTwicePrint(String str) {
		char c[] = str.toCharArray();
		String s="";
		for(int i=0;i<c.length;i++) {
			if(c[i]!=c[c.length-1]) {
				System.out.print(c[i]+""+c[i]);
			}
			else {
				System.out.print(c[c.length-1]);
			}
		}
		System.out.print(s+"");
	}

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str = sc.nextLine();
        RepeatingCharOfStringTwicePrint c = new RepeatingCharOfStringTwicePrint(str);
    }
}

