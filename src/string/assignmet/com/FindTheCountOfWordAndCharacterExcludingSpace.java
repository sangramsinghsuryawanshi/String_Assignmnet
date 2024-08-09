package string.assignmet.com;

import java.util.Scanner;

public class FindTheCountOfWordAndCharacterExcludingSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		char c1='\0';
		char ch[]=str.toCharArray();
		int c=0,w=1;
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]!=' ') {
				c++;
			}
			else if(ch[i]==' ' && ch[i+1]!=' ') {
				w++;
			}
		}
		System.out.println("The count of string word is: "+w);
		System.out.println("Count of charater is: "+c);
	}

}
