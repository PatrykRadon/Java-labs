package Armia;
import java.util.ArrayList;

public class CentrumDowodzenia
{
    private ArrayList<Czolg> m_listaCzolgow;
    
    public CentrumDowodzenia()
    {
        m_listaCzolgow = new ArrayList<Czolg>(); 
    }

    public void zarejestrujCzolg(Czolg nowy_czolg)
    {
        m_listaCzolgow.add(nowy_czolg);
    }
    public void wydajRozkaz(String tankID, Rozkaz n_rozkaz)
    {
        m_listaCzolgow.get(Integer.parseInt(tankID)-1).dodajRozkaz(n_rozkaz);
    }
    public String toString()
    {   
        String ret = new String("Do tej pory centrum dowodzenia wyslalo nastepujace rozkazy:\n");
        for(int i  = 0; i  < m_listaCzolgow.size() ; i ++ )
        {
            ret += "Czolg nr " + (i+1) +  " otrzymal rozkazy:\n";
            ret += m_listaCzolgow.get(i).wypiszWszystkieRozkazy();
            ret += "\n";
        }

    return ret;
        
    }
}

