package string.assignmet.com;

import java.util.Arrays;
import java.util.Scanner;

public class SwapLastTwoCharaters {

	SwapLastTwoCharaters(String str) {
		if(str.length()<2) {
			System.out.println("Array is too short...");
			return;
		}
		char c[] = str.toCharArray();
		char temp = c[c.length-2];
		c[c.length-2]=c[c.length-1];
		c[c.length-1]=temp;
		System.out.println(Arrays.toString(c));
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str = sc.nextLine();
        SwapLastTwoCharaters c = new SwapLastTwoCharaters(str);
    }
}

