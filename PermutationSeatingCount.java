
public class PermutationSeatingCount {

    static int count;

    public static void main (String[] argv)
    {
	// Test 1:
	int numSeats = 3, numPeople = 2;
	count = 0;
	int n = countPermutations (numSeats, numPeople);
	System.out.println (numPeople + " can sit on " + numSeats + " seats in " + n + " different arrangements");

	// Test 2:
	numSeats = 5;
	count = 0;
	n = countPermutations (numSeats, numPeople);
	System.out.println (numPeople + " can sit on " + numSeats + " seats in " + n + " different arrangements");


    }

    static int countPermutations (int numSpaces, int numRemaining)
    {
	count ++;
	if (numRemaining == 0) {
	    return 1;
	}
	// System.out.println ("count=" + count + " numSpaces=" + numSpaces + " numRemaining=" + numRemaining);
	// System.out.println ("--------------");
	return 	numSpaces * countPermutations (numSpaces-1, numRemaining-1);
	
    }

}
