package Armia;

public class Rozkaz
{
    private String m_rozkaz;

    public Rozkaz(String in_rozkaz)
    {
        m_rozkaz = new String(in_rozkaz);
    }
    public String getRozkaz()
    {
        return m_rozkaz;
    }
}
