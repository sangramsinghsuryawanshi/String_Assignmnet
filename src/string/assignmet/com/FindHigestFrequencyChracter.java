package string.assignmet.com;

import java.util.Arrays;
import java.util.Scanner;

public class FindHigestFrequencyChracter {

	public void higestFrequencyChar(String s,Scanner sc) {
		char c[]=s.toCharArray();
		int max=0;
		char maxele='\0';
		for(int i=0;i<c.length;i++) {
			int cnt=1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					cnt++;
					c[j]='\0';
				}
			}
			if(c[i]!='\0' && c[i]!=' ' && cnt>=max) {
				max=cnt;
				maxele=c[i];
			}
		}
		System.out.println("Highest frequency of character is: "+maxele);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String s = sc.nextLine();
		FindHigestFrequencyChracter f = new FindHigestFrequencyChracter();
		f.higestFrequencyChar(s,sc);
	}

}
