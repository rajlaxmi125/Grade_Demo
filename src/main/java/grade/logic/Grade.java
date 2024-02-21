package grade.logic;

public class Grade {
	public static char showgrade(int percentage)
	{
		if(percentage<0)
			throw new IllegalArgumentException("Number grade cannot be 0");
		else if(percentage<60)
			return 'F';
		else if(percentage<70)
			return 'D';
		else if(percentage<80)
			return 'C';
		else if(percentage<90)
			return 'B';
		else 
			return 'A';
	}

}
