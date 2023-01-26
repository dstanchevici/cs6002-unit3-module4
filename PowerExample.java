// Unit 3, Module 4

public class PowerExample {

    public static void main (String[] argv)
    {
	int p = power (3, 2);
	System.out.println ("3^2 = " + p);

	p = power (3, 4);
	System.out.println ("3^4 = " + p);

	p = power (2, 8);
	System.out.println ("2^8 = " + p);
    }

    static int power (int a, int b)
    {
	int p;

	if (b == 0) {
	    p = 1;
	}
	else {
	    p = a * power (a, b-1);
	}

	return p;
    }

}
