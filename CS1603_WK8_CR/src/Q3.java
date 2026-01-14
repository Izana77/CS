package t;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	CalculateAngle(3, 4, 5);
	}
	public static double CalculateAngle(double a, double b, double c) {
		
		double doublea = a*a;
		double doubleb = b*b;
		double doublec = c*c;
		double cosA = (doubleb + doublec - doublea) / (2 * b * c);
		if (cosA > 1 || cosA < -1) {
			return -1; // Invalid triangle sides
		}
		double angleA = Math.acos(cosA);
		double angleADegrees = Math.toDegrees(angleA);
		return angleADegrees;
}
}