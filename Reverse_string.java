
public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String arr1 = "My Name is Anirban";
		
		char tray1[] = arr1.toCharArray();
		
		for(int i = tray1.length - 1; i > 0; i--) {
			System.out.print(tray1[i]);
		}
	}

}
