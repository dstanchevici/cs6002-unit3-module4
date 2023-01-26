
public class MethodExample2 {

    public static void main (String[] argv)
    {
	methodA (3, 4);
    }

    static void methodA (int i, int j)
    {
	int k = 1;
	k = methodB (k+i+j);
	k = k + 1;
	i = i + 2;
	k = methodB (k+i+j);
    }

    static int methodB (int n)
    {
	int m = n + 1;
	return m;
    }

}
