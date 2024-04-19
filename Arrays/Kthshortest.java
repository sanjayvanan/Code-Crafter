package Arrays;
import java.util.Arrays;

public class Kthshortest {
    	// element in a given array
	public static int kthSmallest(Integer[] arr, int K)
	{
		// Sort the given array
		Arrays.sort(arr);

		// Return K'th element in
		// the sorted array
		return arr[K - 1];
	}

	// driver's code
	public static void main(String[] args)
	{
		Integer arr[] = new Integer[] { 12, 3, 5,6, 7,4,4, 19 };
		int K = 3;

		// Function call
		System.out.print("K'th smallest element is "
						+ kthSmallest(arr, K));
	}
}



// Java code for Kth smallest element
// in an array




// This code is contributed by Chhavi
