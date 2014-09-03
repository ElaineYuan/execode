package interviewcode;

import java.util.Scanner;

public class NumberWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		SortNumWord(s);
	}
	static void SortNumWord(String s){
		int length=s.length();
		if (length==0)
			return;
		if(length==1)
			System.out.print(s);
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer();
		for(int i=0;i<length;i++){
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
				sb2=sb2.append(s.charAt(i));
			else
				sb1=sb1.append(s.charAt(i));
		}
		String output=sb1.toString()+sb2.toString();
		System.out.print(output);
		
	}
}
