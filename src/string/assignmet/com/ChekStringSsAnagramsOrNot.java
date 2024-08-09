package string.assignmet.com;

import java.util.Arrays;
import java.util.Scanner;

public class ChekStringSsAnagramsOrNot {

    ChekStringSsAnagramsOrNot(String str, String str1) {
        char[] ch = str.toCharArray();
        char[] ch1 = str1.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);
        String s = new String(ch);
        String s1 = new String(ch1);

        if (s1.equals(s1)) {
            System.out.println("Given strings are anagrams.");
        } else {
            System.out.println("Given strings are not anagrams.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str = sc.nextLine();
        System.out.print("Enter string 2: ");
        String str1 = sc.nextLine();
        ChekStringSsAnagramsOrNot c = new ChekStringSsAnagramsOrNot(str, str1);
    }
}
