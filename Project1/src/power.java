
public class power {

	
	
		static boolean checkNumber (int n)
		{
			if(n==0)
			return false;

		return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == 
			(int)(Math.floor(((Math.log(n) / Math.log(2)))));
		}

	
		public static void main(String[] args)
		{
			if(checkNumber (31))
			System.out.println("Yes");
			else
			System.out.println("No");
			
			
		}
		


	}


