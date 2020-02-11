/**
*Klasa zawierająca narzędzia do operacji na obiektach klasy String
*/

public class lab3string
{   
    /**
    *@arg str obiekt klasy String
    *@return zwraca długość @arg str
    */
    public static int dlugosc(String str)
    {
       return str.length();
    }
    /**
    *@arg1 str obiekt klasy String
    *@arg zmienna char
    *@return zwraca ilosc wystapien @arg2 cr w @arg1 str
    */
    public static int ile_razy_literka_wystepuje(String str, char cr)
    {   
        int ch_occurence = 0;
        for(int i = 0; i < dlugosc(str); i++)
        {
            if(str.charAt(i) == cr) ch_occurence += 1;
        }
        
        return ch_occurence;
    }
    /**
    *@arg str1, str2 obiekty klasy String
    *@return zwraca true jesli str1 oraz str2 są takie same
    */
    public static boolean czy_takie_same(String str1, String str2)
    {
        return str1.equals(str2);
    }
    /**
    *@arg str obiekt klasy String
    *@return zwraca odwrocony napis zawarty w @arg
    */
    public static String wspak(String str)
    {   
        StringBuilder reverse = new StringBuilder("");
        for(int i = dlugosc(str) - 1; i >= 0 ; i--)
        {
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }
    /**
    *@arg str obiekt klasy String
    *@return zwraca true jesli str jest palindromem
    */
    public static boolean czy_plaindrom(String str)
    {
        return str.equals(wspak(str));
    }
    /**
    *@arg str1 obiekt klasy String
    *@return zwraca true jesli znaki w str są alfabetycznie uporządkowane
    */
    public static boolean czy_abecadlowe(String str)
    {   
        
        boolean ordered = true;
        char prev = str.charAt(0);
        for(int i = 1; i < dlugosc(str); i++)
        {   
            char current = Character.toLowerCase(str.charAt(i));
            if(current < prev) ordered = false;
               prev = current;

        }
        
        return ordered;
    }
    /**
    *@arg str1 obiekt klasy String
    *@return zwraca obiekt klasy String o znakach z str przesuniętych alfabetycznie o 13 miejsc
    *@!za zakresem znaków alfabetu kolejne miejsca traktujemy jako alfabet od początku ("z->a->b..)
    */
    public static String rot13(String str)
    {
        StringBuilder temp = new StringBuilder("");
    
        for(int i = 0; i < dlugosc(str); i++)
        {   
                char cr = str.charAt(i);
                if(Character.isLetter(cr))
                {
                    if(Character.isUpperCase(cr))
                    {
                        temp.append( (char)('A' + (cr - 'A' + 13)%26) );
                    }
                    else
                    {
                        temp.append( (char)('a' + (cr - 'a' + 13)%26) );
                    }
                }
                else temp.append(cr);
                
        }

        return temp.toString();
    }

}
