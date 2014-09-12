package LeetCode;
import java.util.*;

public class Reverse_Words_in_a_String {
	
	public static String reverseWords(String s) {
		if(s==""||"".equals(s.trim())){
			return s.trim();
		}
		List<String> list = new ArrayList<String>();  
		s = s.trim();
		StringBuffer sb = new StringBuffer();
		int i = 0;
		int len = s.length();
		
		while(i < len){
			sb = new StringBuffer();  //每次输入一个单词就清空一遍StringBuffer
			while(i < len&&s.charAt(i) != ' '){
				sb.append(String.valueOf(s.charAt(i)));
				i++;			
			}
			while(i < len&&s.charAt(i) == ' '){
				i++;
			}//一旦出现了空格，到删除完空格后就直接跳到list.add了，所以还是一个个单词在一起的
			list.add(sb.toString());			
		}
		
		int size = list.size();
		sb = new StringBuffer(); 		
		for(i=size-1;i >= 0;i--){
			sb.append(list.get(i)+" ");			
		}
		return sb.toString().trim();        
    }
	public static void main(String[] args){
		String s = "the     sky     is blue";
		System.out.println(reverseWords(s));
	}

}
