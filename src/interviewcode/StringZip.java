package interviewcode;

/*通过键盘输入一串小写字母(a~z)组成的字符串。请编写一个字符串压缩程序，将字符串中连续出席的重复字母进行压缩，并输出压缩后的字符串。
 压缩规则：
 1、仅压缩连续重复出现的字符。比如字符串"abcbc"由于无连续重复字符，压缩后的字符串还是"abcbc"。
 2、压缩字段的格式为"字符重复的次数+字符"。例如：字符串"xxxyyyyyyz"压缩后就成为"3x6yz"。*/
import java.util.Scanner;

public class StringZip {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		String s = input.next().toString();
		System.out.print(Stringzip(s));
	}

	static String Stringzip(String s) {
	    String _str = "";
	     
	    int i = 0;   //游标位置
	    char c;      //游标字符
	    while(i<s.length()) {          
	        int n = 1;   //相邻相同字符的个数
	        c = s.charAt(i);
	        for(int j=i+1; j<s.length(); j++) {
	            char _c = s.charAt(j);
	            if(c==_c) {
	                n++;
	            } else {
	                break;
	            }
	        }
	         
	        if(n==1) {
	            _str += c;
	        } else if(n>1){
	            _str += String.valueOf(n) + c; 
	        }
	 
	        i += n;  //游标位置
	    }
	     
	    return _str; 
	}
}
