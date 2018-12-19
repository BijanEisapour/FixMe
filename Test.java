import java.awt.*;

public class Test
{
	static final String startStr = "\n****start of the program****";
	final String endStr = "\n****end of the program****";
	
	// Error
	public static void main ( String[] arg )
	{
		printMessage ( startStr );
		
		Square s = new Square ( 100 );
		
		System.out.println ( s.computePerimeter () );
		System.out.println ( s.computeSurface () );
		
		Point p1 = new Point ( 10 , 10 );
		
		// Error
		//Point p2 = new Point ( 10.1 , 10.2 );
		
		ColorPoint cp1 = new ColorPoint ( 1 , 1 );
		
		// Error
		//ColorPoint cp2 = new ColorPoint ( 1 , 1 , new Color ( 12 , 34 , 56 ) );
		
		// Error
		//cp1 = p1;
		p1 = cp1;
		
		Test myA = new Test ();
		
		// Error
		//myA.printMessage ( endStr );
		
		myA.printMessage ( myA.endStr );
	}//main Method
	
	// Error
	private static void printMessage ( String str )
	{
		System.out.println ( str );
	}
	
	////////////////////////////////
	
	// Error
	static class Square
	{
		public Square ( int init_x )
		{
			x = init_x;
		}
		
		public int computeSurface ()
		{
			return x * x;
		}
		
		public int computePerimeter ()
		{
			return 4 * x;
		}
		
		private int x;
	}//square
}//myApplication

class Point
{
	public Point ( int init_x , int init_y )
	{
		x = init_x;
		y = init_y;
	}
	
	public void move ( int init_x , int init_y )
	{
		x += init_x;
		y += init_y;
	}
	
	protected int x, y;
}//point

class ColorPoint extends Point
{
	public ColorPoint ( int init_x , int init_y )
	{
		super ( init_x , init_y );
		color = Color.blue;
	}
	
	Color color;
}//ColorPoint
