public class FermatPrime {
	public static void main(String[] args) {
		int res[] = new int[5];
		// TODO Auto-generated method stub
		for( int i=0; i<5; i++) {
			res[i] = (int)Math.pow(2, Math.pow(2, i))+1;
			System.out.println(res[i]);
		}
	}
}
