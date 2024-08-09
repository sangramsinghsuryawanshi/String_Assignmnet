package string.assignmet.com;

import java.util.Scanner;

public class FindTheCountOfEachFrequencyChar {

	FindTheCountOfEachFrequencyChar(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int cnt =1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					cnt++;
					ch[j]='\0'; 
				}
			}
			if(ch[i]!='\0' && ch[i]!=' ') {
				System.out.println(ch[i]+" <-Character Count-> "+cnt);
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindTheCountOfEachFrequencyChar f = new FindTheCountOfEachFrequencyChar();
	}

}
