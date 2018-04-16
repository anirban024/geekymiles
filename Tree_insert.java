
class tree{
	int key;
	tree left , right;
	
	tree(int key){
		this. key = key;
		left = right = null;
	}
}

public class Tree_insert {
    
	tree root;
	
	Tree_insert(int key){
		root = new tree(key);
		
	}
	 Tree_insert() {
		// TODO Auto-generated method stub
       root = null;		
	}

   void preorder(tree node) {
	   
	   if(node == null)
		   return;
	   
	   System.out.print(node.key+ " ");
	   
	   preorder(node.left);
	   
	   preorder(node.right);
   }
   
   void inorder(tree node) {
	   
	   if(node == null)
	   { return;}
	   
	   inorder(node.left);
	   
	   System.out.print(node.key+" ");
	   
	   inorder(node.right);
   }
   
   void postorder(tree node) {
	   
	   if(node == null)
		   return;
	   
	   postorder(node.left);
	   postorder(node.right);
	   System.out.print(node.key+" ");
   }
   
   
   void postorder()  {     postorder(root);  }
   void inorder()    {     inorder(root);   }
   void preorder()   {     preorder(root);  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Tree_insert obj = new Tree_insert();
        
        obj.root = new tree(1);
        obj.root.left = new tree(2);
        obj.root.right = new tree(3);
        obj.root.left.left = new tree(4);
        obj.root.left.right = new tree(5);
        
        System.out.println("preorder traversal");
        obj.preorder();
        System.out.println("inorder traversal");
        obj.inorder();
        System.out.println("postorder traversal");
        obj.postorder();
        
      
	}

}
