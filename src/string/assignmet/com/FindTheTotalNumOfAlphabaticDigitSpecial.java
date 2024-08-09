package string.assignmet.com;

import java.util.Scanner;

public class FindTheTotalNumOfAlphabaticDigitSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string : ");
		String str = sc.nextLine();
		char[]ch=str.toCharArray();
		int cnt=0,cnt1=0,cnt2=0;
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i])) {
				cnt++;
			}else if(Character.isAlphabetic(ch[i])) {
				cnt1++;
			}else {
				cnt2++;
			}
		}
		System.out.println("Digit count is: "+cnt);
		System.out.println("Aplphabtic count is: "+cnt1);
		System.out.println("Special character count is: "+cnt2);
	}

}
