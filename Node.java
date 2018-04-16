
	public class Node{
		public static final char[] key = null;
		int data;
		Node left,right;
		
		Node(int data){
			this.data = data;
			left = right = null;
		}
			public int getdata() {
				return data;
			}
			
			public void setdata(int data) {
				this.data = data;
			}
			
			public Node getleft() {
				return  left;
			}
			
			public void setleft(Node left) {
				this.left = left;
			}
			
			public Node getright() {
				return right;
			}
			
			public void setright(Node right) {
				this.right = right;
			}
		}
	