// Unit 3, module 4

import java.util.*;

public class PermutationSeating {
    static int recCount = 0;

    public static void main (String[] argv)
    {
	int numSeats = 5, numPeople = 2;
	int[] seats  = new int [numSeats];
	printPermutations (numSeats, numPeople, seats, 1);
	System.out.println ("recCount=" + recCount);
    }

    static void printPermutations (int numSpaces, int numRemaining, int[] seats, int person)
    {
	System.out.println ("Enter printPermutations #" + (recCount));
	//recCount++;
	if (numRemaining == 0) {
	    System.out.println ( Arrays. toString(seats) );
	    recCount++
	    return;
	}

	for (int i=0; i<seats.length; i++) {
	    System.out.println ("Enter for-loop. i=" + i);
	    if (seats[i] == 0) {
		seats[i] = person;
		System.out.println ("seats[" + i + "]=" + seats[i]);
		printPermutations (numSpaces-1, numRemaining-1, seats, person+1);
		System.out.println ("Returned from permutation");
		seats[i] = 0;
		System.out.println ("After returning seats[" + i + "]=" + seats[i]);
	    }
	}
    }





}
