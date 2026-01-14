package t;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	PMT(5000, 6, 10);
	}
		

	public static double PMT(double P, double r, double n) {
	
	double NR = r/100;
	double NR1 = NR/12;
	double Nn = n*12;
	double PMT = ((P*NR1) * Math.pow((1+NR1), Nn)) / (Math.pow((1+NR1), Nn) -1);
	
	return PMT;
}
}