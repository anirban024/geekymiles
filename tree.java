
public class tree {

	int key;
	tree left , right;
	
	tree(int key){
		this.key = key;
		left = right = null;
	}
	
	class binarytree{
		
		tree root;
		
		binarytree(int key){
			root = new tree(key);
		}
		
		binarytree(){
			root = null;
		}
	}
	
	public static void main(String args[]) {
		
		binarytree obj = new binarytree();
	}
}
