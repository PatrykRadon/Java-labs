public class Square extends Point
{   
    protected double m_size;


    public Square( double size, double x, double y)
    {
        super(x,y);
        this.m_size = size;
    }
    public String getName()
    {
         return "Square";
    }
    public String toString()
    {
        return "Corner = " + super.toString() + "; side = " + m_size;
    }

    public double area()
    {
        return m_size * m_size;
    }

}
