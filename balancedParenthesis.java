
public class balancedParenthesis {

	
	static class stack{
		
		int top = -1;
		char[] stack = new char[100];
		
		public void push(char x) {
			if(top == 99) {
				System.out.println("stack is full");
				}
				else {
					stack[++top] = x;
				}
			}
		
		public char pop() {
			char element = 0;
			if(top == -1) {
				System.out.println("Stack is underflow");
			}
			else {
				element = stack[top];
				top--;
			}
			return element;
		}
		
		boolean isEmpty() {
			return (top == - 1)?true : false;
		}
	}
	
	static boolean isMatching(char char1, char char2) {
	  
		if(char1 == '(' && char2 == ')')
			return true;
		else if(char1 == '{' && char2 == '}')
			return true;
		else if(char1 == '[' && char2 == ']')
			return true;
		else
			return false;
   }
	
	static boolean isbalanced(char exp[]) {
		
		stack st = new stack();
		
		for(int i = 0;i<exp.length;i++) {
			
			if(exp[i]  == '(' || exp[i] == '{' || exp[i] == '[') {
				st.push(exp[i]);
			}
			if(exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {
				
				if(st.isEmpty()) {
					
					return false;
				}
			
			
			 else if ( !isMatching(st.pop(), exp[i]) )
             {
                 return false;
             }
        }
		
		if(st.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
		}
		return false;
     }
		
	
	public static void main(String args[]) {
		
		char exp[] = { '(','{','}',')','[',']'};
		
		if(isbalanced(exp)) {
			System.out.println("Balanced");
		}
		else
			System.out.println("Unbalanced");
			
	}
		
	}

