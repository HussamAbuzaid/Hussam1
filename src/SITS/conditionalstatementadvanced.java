package SITS;

public class conditionalstatementadvanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score= 0;
		String  grade;
		if  (score>=90 && score<=100)
		{
		grade= "A";
		
		}
		else if (score>= 80 && score<90)
			
		{
			
		grade= "B";
		
		}
		
		else if (score>= 70 && score<80)
			
		{
			
			grade= "C";
					
		}
		else if (score>=0 && score<70)
			
		{
			grade= "very bad";
		}
		else
		{
			
			grade= "You have entered invalid grade";
			
		}
		System.out.println(grade);
	}

}
