
import java.util.*;

public class SearchComparison {

    static int comparisonCount;

    public static void main (String[] argv)
    {
	// Optional: Change the seed to see different random values  
	RandTool.setSeed (1234);

        // Fill an array with some random values - for testing.
        int size = 10_000;
        int[] testData = makeRandomSortedArray (size);
        
        // Generate a random search term.
        int value = RandTool.uniform (1, size);
 
        // Simple search.
	comparisonCount = 0;
        boolean found = simpleSearch (testData, value);
        System.out.println ("found = " + found);
	System.out.println ("Simple search with array size " + testData.length + " makes " + comparisonCount + " comparisons.");
	System.out.println ("--------------");

        // Binary.
	comparisonCount = 0;
        found = binarySearch (testData, value, 0, testData.length-1);
        System.out.println ("found = " + found);
	System.out.println ("Binary search with array size " + testData.length + " makes " + comparisonCount + " comparisons.");
	System.out.println ("--------------");
    }
    

    static boolean simpleSearch (int[] A, int value)
    {

        for (int i=0; i<A.length; i++) {
	    comparisonCount++;
            if (A[i] == value) {
                return true;
            }
        }

        return false;
    }


    static boolean binarySearch (int[] A, int value, int start, int end)
    {

        // Only need to check if the interval got inverted.
	comparisonCount++;
        if (start > end) {
            return false;
        }
        
        // Find the middle:
        int mid = (start + end) / 2;
	
	comparisonCount++;
        if (A[mid] == value) {
	    return true;
        }
        else if (value < A[mid]) {
	    comparisonCount++;
	    // Search the left half: A[start],...,A[mid-1]
            return binarySearch (A, value, start, mid-1);
        }
        else {
	    comparisonCount++;
            // Search the right half: A[mid+1],...,A[end]
            return binarySearch (A, value, mid+1, end);
        }
    }



    static int[] makeRandomSortedArray (int length)
    {
        int[] A = new int [length];

	for (int i=0; i<A.length; i++) {
	    A[i] = RandTool.uniform (1, 2*length);
	}

        Arrays.sort (A);

        return A;
    }
}
