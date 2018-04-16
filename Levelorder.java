

class Node1{
	
	int key;
	Node1 left, right;
	
	Node1(int data){
		key = data;
		left = right = null;
	}
}



public class Levelorder {
	
	Node1 root;
		
	Levelorder(){
		root = null;
	}

	void printlevelorder() {
		int h = height(root);
		int i;
		for(i=1;i<=h;i++) 
			{printGiven(root,i);}
		
	}
	
	int height(Node1 root) {
		 
		if(root == null) {
			return 0;
		}else {
		
		int lheight = height(root.left);
		int rheight = height(root.right);
		
		if(lheight > rheight)
			return (lheight + 1);
		else
			return (rheight + 1);
	}
	}
	
	
	void printGiven(Node1 root ,int level) {
		
		if(root == null) {
			return;
		}
		
		if(level == 1) {
			System.out.print(root.key);		}
	
	
		else if(level > 1) {
		
		printGiven(root.left, level - 1);
		printGiven(root.right, level - 1);
		
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Levelorder obj = new Levelorder();
		
		obj.root= new Node1(1);
	       obj.root.left= new Node1(2);
	       obj.root.right= new Node1(3);
	       obj.root.left.left= new Node1(4);
	       obj.root.left.right= new Node1(5);
		
		obj.printlevelorder();

	}

}
