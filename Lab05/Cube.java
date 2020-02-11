public class Cube extends Square
{   
    protected double m_depth;


    public Cube(double size, double x, double y)
    {
        super(size, x,y);
        this.m_depth = size;
    }
    public String getName()
    {
         return "Cube";
    }
    public String toString()
    {
        return super.toString() + "; depth = " + m_depth;
    }

    public double area()
    {
        return super.area()*6;
    }
    public double volume()
    {
        return super.area()*m_depth;
    }

}
