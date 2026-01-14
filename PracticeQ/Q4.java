package q;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsRightAngled(3, 4, 5);
	}
	public static int IsRightAngled(int a, int b, int c) {
	    if (a < 5 || a > 30 || b < 5 || b > 30 || c < 5 || c > 30) {
	        return -2;
	    }

	    int a2 = a * a;
	    int b2 = b * b;
	    int c2 = c * c;

	    if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
	        return 1;
	    }

	    return 0;
	}


}


