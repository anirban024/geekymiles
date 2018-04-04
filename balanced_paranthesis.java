import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class balanced_paranthesis {

	
	static boolean valid(Character c) {
		if (c=='(' || c==')' || c=='[' || c==']' || c=='{' || c=='}') {return true;}
		return false;
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		Stack<Character> stack = new Stack<>();
		Boolean balanced = true;
		for(int i = 0; i<st.length(); i++) {
			char c = st.charAt(i);
			if(!valid(c)) {System.out.print("0");break;}
			if(c=='(' || c=='{' || c=='[') {
				stack.push(c);
			}
			else {
				if(stack.isEmpty()) {
					balanced = false;  System.out.print("1");break;
				}
				if(c==')' && stack.peek()=='(') {
					stack.pop();
				}
				else if(c==']'&& stack.peek()=='[') {
					stack.pop();
				}
				else if(c=='}'&& stack.peek()=='{') {
					stack.pop();
				}
				else {
					System.out.print("2");
					balanced = false; break;
				}
			}
		}
		
		if(!stack.isEmpty()) {
			System.out.print("3");
			balanced = false;
		}
		
		System.out.print(""+balanced);
		
	}
	
}
