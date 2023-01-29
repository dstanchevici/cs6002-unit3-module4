
public class Palindrome2 {

    public static void main (String[] argv)
    {
        String str = "redder";
        char[] letters = str.toCharArray();
        System.out.println ( str + " " + checkPalindrome(letters,0,letters.length-1) );

        str = "river";
        letters = str.toCharArray();
        System.out.println ( str + " " + checkPalindrome(letters,0,letters.length-1) );

        str = "neveroddoreven";
        letters = str.toCharArray();
        System.out.println ( str + " " + checkPalindrome(letters,0,letters.length-1) );
    }
    

    static String checkPalindrome (char[] A, int first, int last)
    {
	// Two bottom-out cases:
	if ( first >= last ) {
	    return "is a palindrome.";
	}
	if ( A[first] != A[last] ) {
	    return "is not a palindrome.";
	}
	
	// First and last chars matched.
	// Check the pair first+1 and last-1.
	// System.out.println ("first+1=" + (++first) + " last-1=" + (--last) ); 
	return checkPalindrome (A, ++first, --last);
    }

}
