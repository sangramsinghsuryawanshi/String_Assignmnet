package string.assignmet.com;

import java.util.Arrays;
import java.util.Scanner;

public class PrintMostRepetedStringCharEle {

	PrintMostRepetedStringCharEle(String str) {
        char[] ch = str.toCharArray();
        char c='\0';
        char c1='\0';
        int max=0;
        for(int i=0;i<ch.length;i++) {
        	int c2=1;
        	for(int j=i+1;j<ch.length;j++) {
        		if(ch[i]==ch[j] && ch[i]!='\0') {
        			c2++;
        			ch[j]='\0';
        		}
        	}
        	if(c2>max) {
        		max=c2;
        		c1=ch[i];
        	}
        }
        System.out.println("Given most repeted charater is: "+c1+" and count is "+max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str = sc.nextLine();
        PrintMostRepetedStringCharEle c = new PrintMostRepetedStringCharEle(str);
    }
}
