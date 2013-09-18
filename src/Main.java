import java.util.Scanner;
import java.lang.String;

public class Main {
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		String str = input.next().toString(); 
	//	char[]arr=str.toCharArray();
		
		String[]sarr=str.split("\\+|-|\\*|/");//number
		String[]sarr1=str.split("\\d+");//char
		
		int []num=new int[sarr.length];//把String数组转化成int型数组
		int []num1=num;
		String[]ch=sarr1;
		
		for(int i=0;i<sarr.length;i++){
			num[i]=Integer.parseInt(sarr[i]);		
		}
		
		for(int i=0;i<sarr1.length-1;i++){
			if(sarr1[i].equals("*")||sarr1[i].equals("/")){
				if(sarr1[i].equals("*")){
					num1[i]=num[i]*num[i+1];
					for(int j=i+i;j<num.length-1;j++){
						num1[j]=num1[j+1];
						ch[j-1]=sarr1[j];
					}					
				}
				if(sarr1[i].equals("/")){
					num1[i]=num[i]/num[i+1];
					for(int j=i+i;j<num.length-1;j++){
						num1[j]=num1[j+1];
						ch[j-1]=sarr1[j];
					}	
					
				}				
			}			
		}
		for(int i=0;i<ch.length-1;i++){
			if(ch[i].equals("+")||ch[i].equals("-")){
				if(ch[i].equals("+")){
					num1[i]=num1[i]+num1[i+1];
					for(int j=i+i;j<num1.length-1;j++){
						num1[j]=num1[j+1];
						ch[j-1]=ch[j];
					}					
				}
				if(ch[i].equals("-")){
					num1[i]=num1[i]-num1[i+1];
					for(int j=i+i;j<num1.length-1;j++){
						num1[j]=num1[j+1];
						ch[j-1]=ch[j];
					}	
					
				}				
			}			
		} 
		
		System.out.print(num1[0]);
		
		

	} 

}

