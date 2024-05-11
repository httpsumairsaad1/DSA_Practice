// using Binary Search;
class B
{
	public int findsmallest( int []n, int l, int r)
	{
		//base-condition.
		if(l>r)
			return l;
		
		int mid = l + (r-l)/2;
		
		if (n[mid] == mid) {
			// lies on the right half
            return findsmallest(n, mid + 1, r);
        }
        else {
            // mismatch lies on the left half
            return findsmallest(n, l, mid - 1);
        }	
	}
}
public class SmallestMissingElem {
	public static void main(String[] args) {
		B ob = new B();
		int [] nums = {0,1,2,3,4,5,6};
		int left=0, right = nums.length-1;
		System.out.println("Missing : "+ ob.findsmallest(nums, left, right));
	}
}
