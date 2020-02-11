package Armia;
import java.util.ArrayList;

public class Czolg
{
    private ArrayList<Rozkaz> m_listaRozkazow;
    
    public Czolg()
    {
        m_listaRozkazow = new ArrayList<Rozkaz>(); 
    }
    public String ostatniRozkaz()
    {
        return "Ostatni rozkaz do mnie: " + m_listaRozkazow.get(m_listaRozkazow.size() - 1).getRozkaz();
    }
    public String wypiszWszystkieRozkazy()
    {
        String ret = new String("");
        
        for ( int i = 0; i < m_listaRozkazow.size() ; i++)
        {
            ret += m_listaRozkazow.get(i).getRozkaz() + "\n";
        }
        return ret;
    }
    public void dodajRozkaz(Rozkaz n_rozkaz)
    {
        m_listaRozkazow.add(n_rozkaz);
    }
    
}
