package q;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCI(1000, 0.05, 12, 10);
	}
	public static double CCI(double P, double r, double t, double y) {
	    return P * Math.pow(1 + (r / t), t * y);
	}

}


