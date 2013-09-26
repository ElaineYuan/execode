import java.util.StringTokenizer;
import java.lang.String;
import java.math.BigInteger;

import java.io.*;

public class Google_Rational_Number_Tree {
	static BigInteger p,q,n;	
	//static final BigInteger two= new BigInteger("2");
	
	public static void main(String[]args) throws Exception{
		File input=new File("B-large-practice.in");
		File output = new File("B-large-practice.out.txt");
		BufferedReader br=new BufferedReader(new FileReader(input));
		BufferedWriter bw=new BufferedWriter(new FileWriter(output));
		
		int num=Integer.valueOf(br.readLine());
		StringTokenizer st;		
		
		for(int k=1;k<=num;k++){
			st=new StringTokenizer(br.readLine());
			int t=Integer.valueOf(st.nextToken());
			
			BigInteger index;
			BigInteger a,b;	
			if(t==1){	
				index=new BigInteger(st.nextToken());
				//index= BigInteger.valueOf(st.nextToken()); 
				//System.out.print("Case #"+id+": ");
				cal_pq(index);
				bw.write("Case #"+k+": "+p+" "+q+"\n");
				//System.out.print(p+" ");
				//System.out.print(q);
			}
			else{
				a=new BigInteger(st.nextToken());
				b=new BigInteger(st.nextToken());
				//a= BigInteger.valueOf(st.nextToken()); 
				//b= BigInteger.valueOf(st.nextToken()); 
				//System.out.print("Case #"+id+": ");
				cal_n(a,b);
				bw.write("Case #"+k+": "+n+"\n");
				//System.out.print(n);				
			}			
		}
		bw.flush();
		bw.close();
		br.close();
	}		
	
	public static void cal_pq(BigInteger index){
		if(index.equals(new BigInteger("1"))){
			p=new BigInteger("1");
			q=new BigInteger("1");
		}
		else{
			cal_pq(index.divide(new BigInteger("2")));
			if(index.remainder(new BigInteger("2")).equals(new BigInteger("0"))){
				//q=p+q;
				q=q.add(p);
				
			}else{
				p=p.add(q);
			}
		}
	}
	public static void cal_n(BigInteger a,BigInteger b){
		if(a.equals(new BigInteger("1"))&&b.equals(new BigInteger("1")))
			n= new BigInteger("1");
		else{
			if(a.compareTo(b)<0){
				cal_n(a,b.subtract(a));
				n= n.multiply(new BigInteger("2"));
				
			}
			else{
				cal_n(a.subtract(b),b);
				//n=2*n+1;
				n=n.multiply(new BigInteger("2")).add(new BigInteger("1"));
			}		
		}		
	}

}
