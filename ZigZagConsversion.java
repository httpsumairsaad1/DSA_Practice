class Solution {
	public Solution()
	{
		System.out.println("Start:");
	}
public String convert(String s, int numRows) {
        StringBuilder[] sbs =  new StringBuilder[numRows];
        for (int i=0; i<numRows; i++)
        {
            sbs[i]=new StringBuilder();
        }
        
        //define variables
        char[] arr= s.toCharArray();
        int n = arr.length;
        int index=0;
        
        //transverse ZigZag
        while(index<n)
        {
            //go down
            for(int j=0; j<numRows && index < n; j++)
            {
                sbs[j].append(arr[index++]); 
            }
            
            //go up before start
            for(int j=numRows-2; j>0 && index < n; j--)
            {
                sbs[j].append(arr[index++]); 
            }
        }
        StringBuilder res = sbs[0];
        for(int i=1; i< numRows; i++)
            {
                res.append(sbs[i].toString()); 
            }
        return res.toString();
    }
}
public class ZigZagConsversion
{
	public static void main(String[] args) {
		String st = "UmairSaadKhatti";
		Solution ob = new Solution();
		st = ob.convert(st, 4);
		System.out.println(st);
		
	}
}