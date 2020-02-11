public class Point extends Shape
{   
    protected double m_x = 0.0;
    protected double m_y = 0.0;

    public Point(double x, double y)
    {
        this.m_x = x;
        this.m_y = y;
    }
    public String getName()
    {
         return "Shape";
    }
    public String toString()
    {
        return "["+ m_x + ", " + m_y + "]";
    }

}
