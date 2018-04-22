package base1;

public class swapwithouttemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 12, b = 10;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a+" "+b);
	}

}
