// Examples of recursive programs

public class Factorial {
	
	static int sum(int n)
	{
		if (n <= 0)
			return 0;			// base case
		else
			return n + sum(n - 1);	// iterative case
		
	}
	
	static int fact(int n)
	{
		if (n <= 1)
			return 1;			// base case
		else
			return n * fact(n - 1);	// iterative case
		
	}
	
	static int fib(int n)
	{
		if (n == 0)
	        return 0;
	 
	    if (n == 1 || n == 2)
	        return 1; 
	    else
	        return (fib(n - 1) + fib(n - 2));
		
	}

	static int gcd(int n1, int n2)
	{
		if (n2 != 0)
		{
            return gcd(n2, n1 % n2);
       } 
       else
       {
         return n1;
       }
   }
	
	public static void main(String[] args) {
		
		int n = 5;
		
		System.out.println(" Sum of first " + n + " numbers = " + sum(n));
		
		System.out.println(" Factorial of " + n + " = " + fact(n));
		
		System.out.println(" GCD of 6 and 4 " +  " = " + gcd(6,4) );
		
		
		for(int i=0; i< 7; i++)
			System.out.println(fib(i)); 

	}
}