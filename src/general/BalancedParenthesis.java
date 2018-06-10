package general;

import java.io.*;
import java.util.*;

public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "I am sick today(:()";
		String s="(:)";
		Stack<String> stack = new Stack<String>();
		
		s = s.replace(":)", "H");
		s = s.replace(":(","S");
		s= s.replace(":", "");
		
		System.out.println(s);
		if (s != null){
			char[] content = s.toCharArray();
			for(int i=0;i<s.length();i++){
				String str =""+ content[i];
				if(str.equals("(" ))
					stack.push(str);
				else if(str.equals(")")){
					System.out.println("peek = "+stack.peek());
					if(stack.isEmpty())
						System.out.println("NO1");
					
					String opening = stack.peek();
					 if( opening.equals("("))
						stack.pop();				
					
				}
								
			}
		}
		if(stack.isEmpty())
			System.out.println("YES");
		else
			System.out.println("NO");
		

	}

}
