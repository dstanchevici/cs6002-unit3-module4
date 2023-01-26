// Unit 3, Module 4

public class PowerExample2 {

    public static void main (String[] argv)
    {
	int p = power (3, 2, 0);
	System.out.println ("3^2 = " + p);

	p = power (3, 4, 0);
	System.out.println ("3^4 = " + p);

	p = power (2, 8, 0);
	System.out.println ("2^8 = " + p);
    }

    static int power (int a, int b, int level)
    {
	System.out.println ( makeBlanks(level) + "Level " + level + ": b=" + b);

	int p;

	if (b == 0) {
	    p = 1;
	}
	else {
	    p = a * power (a, b-1, level+1);
	}

	System.out.println ( makeBlanks(level) + "Level " + level + ": p=" + p);

	return p;
    }

    static String makeBlanks (int n)
    {
	String str = "";
	for (int i=0; i < n; i++) {
	    str += "  ";
	}
	return str;
    }

}
