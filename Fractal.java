
public class Fractal {

    public static void main (String[] argv)
    {
	DrawTool.display ();
	DrawTool.setXYRange (0,10, 0,10);
	
	// Draw the first four sides
	int depth = 5;
	drawHorizontalSide (3,3, 7,3, depth, false);
	drawVerticalSide (3,3, 3,7, depth, true);
	drawHorizontalSide (3,7, 7,7, depth, true);
	drawVerticalSide (7,3, 7,7, depth, false);
    }

    static void drawVerticalSide (double x1, double y1, double x2, double y2, int depth, boolean drawLeft)
    {
	// Order the y values because that's how we're writing the code.
	if (y1 > y2) {
	    double temp = y2;
	    y2 = y1;
	    y1 = temp;
	}

	// Bottom out case:
	if (depth == 1) {
	    DrawTool.drawLine (x1,y1, x1,y2);
	    return;
	}

	// The length of the middle.
	double d = Math.abs(y2-y1) / 3;
	DrawTool.drawLine (x1, y1, x2, y1+d);
	DrawTool.drawLine (x1, y1+2*d, x2, y2);

	// Recurse, drawing the middle 3 sides
	double x3 = x1-d;
	if (! drawLeft) {
	    x3 = x1+d;
	}

	drawHorizontalSide (x3, y1+d, x1, y1+d, depth-1, false);
	drawVerticalSide (x3, y1+d, x3, y1+2*d, depth-1, drawLeft);
	drawHorizontalSide (x1, y1+2*d, x3, y1+2*d, depth-1, true);
    }


    static void drawHorizontalSide (double x1, double y1, double x2, double y2, int depth, boolean drawAbove)
    {
	// Order the x values.
	if (x1 > x2) {
	    double temp = x2;
	    x2 = x1;
	    x1 = temp;
	}

	// Bottom out case:
	if (depth == 1) {
	    DrawTool.drawLine (x1,y1, x2,y2);
	    return;
	}

	double d = Math.abs(x2-x1) / 3;
	DrawTool.drawLine (x1, y1, x1+d, y2);
	DrawTool.drawLine (x1+2*d, y1,  x2, y1);

	// Recurse
	double y3 = y1+d;
	if (! drawAbove) {
	    y3 = y1-d;
	}

	drawVerticalSide (x1+d, y1, x1+d, y3, depth-1, true);
	drawHorizontalSide (x1+d, y3, x1+2*d, y3, depth-1, drawAbove);
	drawVerticalSide (x1+2*d, y3, x1+2*d, y1, depth-1, false);
    }

}
