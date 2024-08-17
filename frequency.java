package palindrome;

import java.util.Scanner;

public class frequency {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string:");
		String str=sc.nextLine();
		System.out.println("Enter character whose frequency is to be found:");
		char ch=sc.nextLine().charAt(0);
		int count=0,len=str.length();
		for(int i=0;i<len;i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("Frequency of "+ch+" is: "+count);
	}

}
