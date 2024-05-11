import java.util.Scanner;

public class AnagramProgram {

	public static boolean isAnagram( String s1, String s2)
	{
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if ( s1.length() == s2.length())
		{
			int [] n1 = new int [256];
			int [] n2 = new int [256];
			
			
			for ( int i=0; i<s1.length() ; i++)
			{
				n1[(int) s1.charAt(i)] +=1;
				n2[(int) s2.charAt(i)] +=1;
			}
			for( int i=0; i<256; i++ )
			{
				if( n1[i]!=n2[i]) {
					return false;
				}
				
			}
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		//sc.close(); 
		boolean result = isAnagram(str1, str2);
		if(result)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
		
	}

}
