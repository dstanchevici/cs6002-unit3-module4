// Unit 3, Module 4

public class ArraySearch {

    public static void main (String[] argv)
    {
	int[] testData = {51, 24, 63, 73, 42, 85, 71, 41, 87, 32};

	int searchTerm = 42;

	boolean found = search (testData, searchTerm, 0);

	System.out.println ("found=" + found);
    }

    static boolean search (int[] A, int value, int index)
    {
	if (index >= A.length) {
	    return false;
	}
	if (A[index] == value) {
	    return true;
        }
    
        return search (A, value, index+1);
    }
}
