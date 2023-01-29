// Unit 3, Module 4

public class PowerExample6 {

    public static void main (String[] argv)
    {
	int p = power (3, 4);
	System.out.println ( "3^4 = " + p);
    }

    static int power (int a, int b)
    {
	/*
	if (b == 0) {
	    return 1;
	} */
	System.out.println ("b=" + b);
	return (a * power (a, b-1));
    }

}
