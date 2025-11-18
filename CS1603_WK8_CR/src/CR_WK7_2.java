
public class CR_WK7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//DoSomeCalculation(5, 5, 1, 1);
		
		System.out.println(MakeSequence(5));
	}
	public static void DoSomeCalculation(double a, double b, double c, double d) 
		{			
		System.out.println((a+b)/(c+d));
	}
	
	//"111112222333445"
	public static String MakeSequence(int N) 
	{
		String result = "";
		if (N<1) {
			return "";
		}
		for (int i = 0; i <= N; i++) 
		{	
			for (int j = N-i; j > 0; j--) {
				result = result + (i+1);
			}
		}

		return result;
	}
}
