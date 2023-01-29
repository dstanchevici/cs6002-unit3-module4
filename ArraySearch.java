// Unit 3, Module 4

// NOTE to GRADER: I am switching the two if-statements in search()
//  and setting searchTerm to 1 (a value not in the array)
//  to complete exercise 4.17, which states,
//  "Before implementing, can you see the problem?"
//  Thus, I assume that we have to implement the changes described in 4.17
//  inside ArraySearch.

public class ArraySearch {

    public static void main (String[] argv)
    {
	int[] testData = {51, 24, 63, 73, 42, 85, 71, 41, 87, 32};

	int searchTerm = 1;

	boolean found = search (testData, searchTerm, 0);

	System.out.println ("found=" + found);
    }

    static boolean search (int[] A, int value, int index)
    {
	if (A[index] == value) {
	    return true;
        }
	if (index >= A.length) {
	    return false;
	}
	System.out.println ("index=" + index);
        return search (A, value, index+1);
    }
}
