// Unit 3, Module 4

public class PowerExample4 {

    static int a;

    public static void main (String[] argv)
    {
	a = 3;
	int p = power (4);
	System.out.println ("3^4 = " + p);
    }

    static int power (int b)
    {
	int p;

	if (b == 0) {
	    p = 1;
	}
	else {
	    p = a * power (b-1);
	}

	System.out.println ("Intermediate result: " + a + "^" + b + "=" + p);

	return p;
    }
}
