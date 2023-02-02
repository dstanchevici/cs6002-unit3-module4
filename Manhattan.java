// Unit 3, Module 4

public class Manhattan {

    public static void main (String[] arv)
    {

	int r = 2, c = 2;
	int n = countPaths (r, c);
	System.out.println ("r=" + r + " c=" + c + " -> n=" + n);
/*
	r = 2;
	c = 2;
	n = countPaths (r, c);
	System.out.println ("r=" + r + " c=" + c + " -> n=" + n);

	r = 5;
	c = 7;
	n = countPaths (r, c);
	System.out.println ("r=" + r + " c=" + c + " -> n=" + n);
*/
    }

    static int countPaths (int numRows, int numCols)
    {
	if ( (numRows == 0) || (numCols == 0) ) {
	    return 1;
	}

	int downCount = countPaths (numRows-1, numCols);
	System.out.println ("downCount: downCount=" + downCount);
	int rightCount = countPaths (numRows, numCols-1);
	System.out.println ("rightCount: downCount=" + downCount + " rightCount=" + rightCount );
	return (downCount + rightCount);
    }

}
