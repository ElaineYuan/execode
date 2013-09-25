import java.util.StringTokenizer;
import java.lang.String;
import java.io.*;

public class Google_Rational_Number_Tree {
	static int p,q,n;
	
	public static void main(String[]args) throws Exception{
		File input=new File("A.in");
		File output = new File("A.out.txt");
		BufferedReader br=new BufferedReader(new FileReader(input));
		BufferedWriter bw=new BufferedWriter(new FileWriter(output));
		
		int num=Integer.valueOf(br.readLine());
		StringTokenizer st;		
		
		for(int k=1;k<=num;k++){
			st=new StringTokenizer(br.readLine());
			int t=Integer.valueOf(st.nextToken());
			int index,a,b;	
			if(t==1){				
				index= Integer.valueOf(st.nextToken()); 
				//System.out.print("Case #"+id+": ");
				cal_pq(index);
				bw.write("Case #"+k+": "+p+" "+q+"\n");
				//System.out.print(p+" ");
				//System.out.print(q);
			}
			else{
				a= Integer.valueOf(st.nextToken()); 
				b= Integer.valueOf(st.nextToken()); 
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
	
	public static void cal_pq(int index){
		if(index==1){
			p=1;
			q=1;
		}
		else{
			cal_pq(index/2);
			if(index%2==0){
				q=p+q;
				
			}else{
				p=p+q;
			}
		}
	}
	public static void cal_n(int a,int b){
		if(a==1&&b==1)
			n= 1;
		else{
			if(a<b){
				cal_n(a,b-a);
				n= n*2;
				
			}
			else{
				cal_n(a-b,b);
				n=2*n+1;
			}		
		}		
	}

}
