package string.assignmet.com;

import java.util.Scanner;

public class FindNonRepeatingCharater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int c=0;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					c++;
				}
			}
			if(c==0){
				System.out.println("First charater is non repeated is: "+ch[i]);
				break;
			}
		}
	}
}

