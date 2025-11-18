
public class CR_WK7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//DoSomeCalculation(5, 5, 1, 1);
		//MakeSequence(5);
		System.out.println(CalculateGradeLetter("28","10"));
	}
	public static void DoSomeCalculation(double a, double b, double c, double d) 
		{			
		System.out.println((a+b)/(c+d));
	}
	
	//"111112222333445"
	public static String MakeSequence(int N) 
	{
		for (int i = 1; i <= N; i++) 
		{
			System.out.println(i);			
		}

		return "";
	}

	public static String CalculateGradeLetter(String strGrade, String strBonus)
	{
		if (strGrade == null || strBonus == null) {
			return "-1";	
		}
		if (strGrade.isBlank() || strBonus.isBlank()) {
			return "-2";
		}
		int actual_Grade;
		int actual_Bonus;
		try 
		{
			actual_Grade = Integer.parseInt(strGrade);
			actual_Bonus = Integer.parseInt(strBonus);
			

		} catch (Exception e) {
			return "-3";
		}
		
		
		int result = actual_Grade + actual_Bonus;
		
		if(result >= 70) {
			return "A";
		}
		if(result >= 60) {
			return "B";
		}
		if(result >= 50) {
			return "C";
		}
		if(result >= 40) {
			return "D";
		}
		
		return "F";
	}

}
