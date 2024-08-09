package string.assignmet.com;

import java.util.Scanner;

public class FindLowestFrequencyOfChar {
	FindLowestFrequencyOfChar(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		char ch[]=str.toCharArray();
		int min=Integer.MAX_VALUE;
		char minele='\0';
		for(int i=0;i<ch.length;i++) {
			int cnt =1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					cnt++;
					ch[j]='\0'; 
				}
			}
			if(ch[i]!='\0' && ch[i]!=' ' && cnt<=min) {
				min=cnt;
				minele=ch[i];
		}
	}
	System.out.println("Lowest frequency of character is: "+minele);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindLowestFrequencyOfChar f = new FindLowestFrequencyOfChar();
	}

}
