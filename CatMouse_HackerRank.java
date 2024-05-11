import java.io.*;

public class CatMouse_HackerRank {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
    	
    	// code here
    	//line 16 to 26.
        int a = Math.abs(x-z);
        int b = Math.abs(y-z);
        if(a>b){
            return "Cat B";
        }
        else if(a<b)
        {
            return "Cat A";
        }
        else{
            return "Mouse C";
        }
    }

  //  private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      /*  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();*/
    }
}
