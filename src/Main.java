import java.util.Scanner;
import java.lang.String;

public class Main {
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		String str = input.next().toString(); 
	//	char[]arr=str.toCharArray();
		
		String[]sarr=str.split("\\+|-|\\*|/");//numbersarr[0]
		String[]sarr1=str.split("\\d+");//sarr1[0]里面为空的，从sarr[1]开始赋值
		
		int []num=new int[sarr.length];//把String数组转化成int型数组
		//int []num1=num=new int[sarr.length];
		//String[]ch=new String[sarr1.length];
		int index=sarr1.length;
		
		for(int i=0;i<sarr.length;i++){
			num[i]=Integer.parseInt(sarr[i]);		
		}
		
		for(int i=1;i<index;i++){
			if(sarr1[i].equals("*")||sarr1[i].equals("/")){
				
				if(sarr1[i].equals("*")){
					num[i-1]=num[i-1]*num[i];
					for(int j=i;j<index-1;j++){
						num[j]=num[j+1];
						sarr1[j]=sarr1[j+1];
					}
					index=index-1;
				}
				
				if(sarr1[i].equals("/")){
					num[i-1]=num[i-1]/num[i];
					for(int j=i;j<index-1;j++){
						num[j]=num[j+1];
						sarr1[j]=sarr1[j+1];
					}
					index=index-1;
					
				}
				
			}			
		}
		for(int i=1;i<index;i++){
			if(sarr1[i].equals("+")||sarr1[i].equals("-")){
				
				if(sarr1[i].equals("+")){
					num[i-1]=num[i-1]+num[i];
					for(int j=i;j<index-1;j++){
						num[j]=num[j+1];
						sarr1[j]=sarr1[j+1];
					}	
					index=index-1;
				}
				
				if(sarr1[i].equals("-")){
					num[i-1]=num[i-1]-num[i];
					for(int j=i;j<index-1;j++){
						num[j]=num[j+1];
						sarr1[j]=sarr1[j+1];
					}
					index=index-1;
					
				}
				
			}			
		}
		
		System.out.print(num[0]);		

	} 

}

