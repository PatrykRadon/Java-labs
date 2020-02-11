public class lab01
{
	public static void main(String Args[])
	{
		
		draw_line(28,65,28,84);
		draw_line(28,84,34,83);
		draw_line(34,83,38,79);
		draw_line(38,79,37,76);
		draw_line(37,76,34,73);
		draw_line(28,72,37,76);
		draw_line(58,25,53,23);
		draw_line(53,23,47,23);
		draw_line(47,23,44,25);
		draw_line(74,65,63,65);
		draw_line(63,65,73,74);
		draw_line(73,74,73,79);
		draw_line(73,79,70,82);
		draw_line(70,82,66,82);
		draw_line(66,82,63,80);
		draw_circle(50,74,9);
		draw_circle(50,29,14);
		draw_circle(55,34,2);
		draw_circle(46,34,2);
	
	}

	public static void draw_line(float x0, float y0, float x1, float y1)
	{
		int steps = 500;
		
		float x = x0;
		float y = y0;
		float x_step = (x1 - x0)/steps;
		float y_step = (y1 - y0)/steps;
		int i = 0;
		while ( i <= steps )
		{	
			
			System.out.println(x + " " + y);
			x = x + x_step;
			y = y + y_step;
			i++;
		}
		
	}
	
	public static void draw_circle(double x0, double y0, double r)
	{
		int steps = 500;
		double alpha_step = (2.0*Math.PI)/steps;
		double alpha = 0;
		double x, y;
		int i = 0;
		while ( i <= steps )
		{	
			alpha = i * alpha_step;
			x = x0 + r*Math.sin(alpha);
			y = y0 + r*Math.cos(alpha);
			System.out.println(x + " " + y);
			i++;
		}
		
	}
}
