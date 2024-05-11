public class TestGoldbach
{
	private static boolean isPrime(int num){
		for(int i=2; i<=num/2; i++) {
	          if(num%i==0) {
	        	  return false;
	          }
	    }
	    return true;
	}
	public static void main(String[] args) 
	{
		int range = 50;
		System.out.println("4 = 2+2");
		for(int i=6; i<=range; i+=2)
		{
			System.out.print(i);
			for(int p=3; p<=i/2; p+=2) {
				if(isPrime(p)&&isPrime(i-p)) {
					System.out.print(" = "+p+"+"+(i-p));
				}
			}
			System.out.println();
		}
	}
} 