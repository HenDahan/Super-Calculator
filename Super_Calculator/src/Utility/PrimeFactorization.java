package Utility;

public class PrimeFactorization {
		
		public static int[] findPrimeFactor (int num)
		{
			
			int [] factors= new int [num/2];
			int prime = 2; 
			int index = 0; 
			while (num !=1)
			{
				if (num % prime == 0)
				{
					num = num / prime;
	 				factors[index] = prime; 
					index++;
				}
				else
					prime = getNextPrime (prime, num);

			}
		
			return factors;
		}
		

		private static int getNextPrime (int prime, int num)
		{
			if (isPrime(num)) 
				prime = num;
			else 
			{
				prime++;
				while (!isPrime(prime) && prime < num)
				{
					prime++;
				}
			}
			return prime;
		}

		private static boolean isPrime(int num)
		{
			boolean bool = true;
			for (int i=2; i<num && bool;i++)
			{
				if (num%i==0)
					bool = false;
			}
			return bool;
			
		}
		

}

