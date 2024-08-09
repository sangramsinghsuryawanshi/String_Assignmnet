package string.assignmet.com;

import java.util.Scanner;

public class FindPercentageOfUpperLoweCseDigitSpecialChar {

	FindPercentageOfUpperLoweCseDigitSpecialChar(String str) {
		int upperc=0,lowerc=0,digitc=0,specialcharc=0,sp=0;
		char str1='\0';
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++) {
			  sp++;
			 if(Character.isLowerCase(c[i])) {
				lowerc++;
			}else if(Character.isUpperCase(c[i])) {
				upperc++;
			}else if(Character.isDigit(c[i])) {
				digitc++;
			}else {
				specialcharc++;
			}
		}
		System.out.println("Percentage of lower case is: "+(double)(lowerc*100)/sp);
		System.out.println("Percentage of upper case is: "+(double)(upperc*100)/sp);
		System.out.println("Percentage of digit is: "+(double)(digitc*100)/sp);
		System.out.println("Percentage of special charater is: "+(double)(specialcharc*100)/sp);
	}

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str = sc.nextLine();
        FindPercentageOfUpperLoweCseDigitSpecialChar c = new FindPercentageOfUpperLoweCseDigitSpecialChar(str);
    }
}


