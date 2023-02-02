public class Fibonacci {

    static int count;

    public static void main (String[] argv) 
    {
	int n = 5;
	count = 0;
	int f = fibonacci (n, 0);
	System.out.println ("f(" + n + ") = " + f);
    }

    static int fibonacci (int n, int callNum)
    {
	System.out.println ("-----------");
	System.out.println ("CALL #" + callNum + " n=" + n);
	count ++;
	if (n == 1) {
	    System.out.println ("Base: n==1, return 0");
	    return 0;
	}
	else if (n == 2) {
	    System.out.println ("Base: n==2, return 1");
	    return 1;
	}
	System.out.println ("Enter fibonacci (n-1)");
	int f_n_minus_one = fibonacci (n-1, callNum+1);
	System.out.println ("Enter fibonacci (n-2)");
	int f_n_minus_two = fibonacci (n-2, callNum+1);

	System.out.println ("RETURN");
	return f_n_minus_one + f_n_minus_two;
    }
}
