
public class ManhattanWithCallCount {

    static int numCalls;
    static int[][] gridValues;

    public static void main (String[] argv)
    {
        // Test case 1: go from (2,2) to (0,0)
	int r = 2;
	int c = 2;
	numCalls = 0;
	gridValues = new int [r+1][c+1];
	int n = countPaths (r, c);
	System.out.println ("r=" + r + " c=" + c + " => n=" + n + "; numCalls=" + numCalls);

        // Test case 2: go from (5,7) to (0,0)
	r = 5;
	c = 7;
	numCalls = 0;
	gridValues = new int [r+1][c+1];
	n = countPaths (r, c);
	System.out.println ("r=" + r + " c=" + c + " => n=" + n + "; numCalls=" + numCalls);


    }


    static int countPaths (int numRows, int numCols)
    {
	numCalls ++;

        // Bottom-out cases:
	if ( (numRows == 0) || (numCols == 0) ) {
	    return 1;
	}
	if ( gridValues[numRows][numCols] != 0 ) {
	    return gridValues[numRows][numCols];
	}

	// Otherwise, reduce to two sub-problems and add.
        int downCount = countPaths (numRows-1, numCols);
	int rightCount = countPaths (numRows, numCols-1);
	gridValues[numRows][numCols] = downCount + rightCount;
	// printGrid();
	// System.out.println ("----------------");
	return gridValues[numRows][numCols];
    }

    static void printGrid() {
	for (int i=0; i<gridValues.length; i++) {
	    for (int j=0; j<gridValues[i].length; j++) {
		System.out.print (gridValues[i][j] + " ");
	    }
	    System.out.println ();
	}
    }
}
