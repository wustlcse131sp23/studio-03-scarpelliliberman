package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("What integer do you want to find all prime numbers up until?");
		int n = in.nextInt();
		
		boolean [] prime = new boolean [n+1]; 
	
		for (int i=2; i<=n; i++)
			
		{
			prime[i]=true;
	
			for (int p=2; p<Math.sqrt(n); p++)	 
			{
				if ((i%p == 0) && (i!=p))
				{
					prime[i] = false;
				}
		
			}
		if (prime[i]==true)
			{
				System.out.println(i + " is a prime number");
			}
		}
		
			
		
	}

}
