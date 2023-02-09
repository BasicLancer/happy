
import java.util.Scanner;

	//import java.util.concurrent.Callable;

		interface A
	{
		interface B
	{
		public int callMe(int sum);
	}
	}


	public class Ggi implements A
		{
			int fin1=0;
			int sum=0;
			
			public static void main(String[] args)
			{
				Scanner in=new Scanner(System.in);
				System.out.print("Enter the number to be tested as happy or unhappy : ");
				int num=(int)Math.pow(in.nextInt(), 2);
				System.out.println(num);
				Ggi p=new Ggi();
				while(num>9)
				{
					System.out.println(p.callMe(num));
					num=p.callMe(num);
				}
				if(num==1)
					System.out.println("Its a happy number : )");
				else
					System.out.println("Its unhappy :(");		
			}
		   public 	int callMe(int num)
			{
			   int rem = 0, sum = 0;  
		          
		        //Calculates the sum of squares of digits  
		        while(num > 0){  
		            rem = num%10;  
		            sum = sum + (rem*rem);  
		            num = num/10;  
		        }  
		        return sum;  
			}
		}
