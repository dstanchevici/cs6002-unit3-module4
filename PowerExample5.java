// Unit 3, Module 4

public class PowerExample5 {

    static int a;
    static int b;

    public static void main (String[] argv)
    {
	a = 3;
	b = 4;
	int p = power ();
	System.out.println ("3^4 = " + p);
	// System.out.println (b);
    }

    static int power ()
    {
	int p;

	if (b == 0) {
	    p = 1;
	}
	else {
	    b = b - 1;
	    p = a * power ();
	}

	System.out.println ("Intermediate result: " + a + "^" + b + "=" + p);

	return p;
    }
}
