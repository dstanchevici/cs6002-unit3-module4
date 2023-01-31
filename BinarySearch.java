// Unit 3, module 4

public class BinarySearch {

    public static void main (String[] argv)
    {
	int[] testData = {24, 32, 41, 42, 51, 63, 71, 73, 85, 87};

	int searchTerm = 32;
	boolean found = binarySearch (testData, searchTerm, 0, testData.length-1);
	System.out.println ("found = " + found);
	System.out.println ("---------------------");

	searchTerm = 55;
	found = binarySearch (testData, searchTerm, 0, testData.length-1);
	System.out.println ("found = " + found);
	System.out.println ("---------------------");

	searchTerm = 88;
	found = binarySearch (testData, searchTerm, 0, testData.length-1);
	System.out.println ("found = " + found);
	System.out.println ("---------------------");
    } // end-main()

    static boolean binarySearch (int[] A, int value, int start, int end)
    {
	// Bottom-out
	if ( (A[start]==value) || (A[end]==value) ) {
	    System.out.println ("Bottom-out (A[start]==value) || (A[end]==value)"); 
	    return true;
	}
	else if (start >= end) {
	    if (start > end) {
		System.out.println ("Bottom-out  (start > end)"); 
	    }
	    else {
		System.out.println ("Bottom-out  (start == end)"); 
	    }
	    return false;
	}

	// Recurse.
	int mid = (start + end) / 2;

	if (value <= A[mid]) {
	    System.out.println ("Recursion for (value <= A[mid])");
	    return binarySearch (A, value, start, mid);
	}
	else {
	    System.out.println ("Recursion for value > A[mid]");
	    return binarySearch (A, value, mid+1, end);
	}
    } // end-binarySearch()

} // end-BinarySearch
