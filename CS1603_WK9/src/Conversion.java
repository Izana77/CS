
public class Conversion {

	public static void main(String[] args) {
		int[] temp = {13, 44, 16, 11};
		int[] temp2 = {-13, -44, -16, 11};
		CelsiusToFahrenheit(temp2);
	}

	static public double[] CelsiusToFahrenheit(int[] c) 
	{ 
		double[] results = new double[c.length];
		
		//for each
		//F=C×95+32
		for (int i = 0; i < results.length; i++) 
		{ // results could also be c
			if(c[i] < 0);
			{
				return
			}
			double F = c[i] * (9.0/5.0) + 32.0;
			System.out.println(F);
			
			results[i] = F;
		}
		
		return results;
	} 
	
}
