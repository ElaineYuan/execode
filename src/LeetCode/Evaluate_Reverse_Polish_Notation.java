package LeetCode;
import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
	public  static void main(String[] args){
		String[] tokens = {"0","3","/"};
		System.out.println(evalRPN(tokens));
	}
	
	public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<String>();
        
		for(int i = 0;i<tokens.length;i++){		    
			if(tokens[i].equals("+")){
				int r = Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
				stack.push(String.valueOf(r));
				
			}else if(tokens[i].equals("-")){
				int r1 = Integer.parseInt(stack.pop());
				int r2 = Integer.parseInt(stack.pop());
				int r =  r2 - r1;
				stack.push(String.valueOf(r));
				
			}else if(tokens[i].equals("*")){
				int r = Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop());
				stack.push(String.valueOf(r));
				
			}else if(tokens[i].equals("/")){			
					int r1 = Integer.parseInt(stack.pop());
					int r2 = Integer.parseInt(stack.pop());
					int r =  r2 / r1;
					stack.push(String.valueOf(r));
					
			}else{
				stack.push(tokens[i]);
			}			
		}
		return Integer.parseInt(stack.pop());
    }

}

//String有valueOf这个方法，Integer有parseInt方法
//字符串比较用equals,除非比较null时可以用==


