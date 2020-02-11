public class lab09
{
 public static void main(String[] args) throws Exception
 {  
    try{
    Volonoya vol = new Volonoya(args);
    Volonoya.loadPoints();
    Volonoya.createBorders();
    Volonoya.saveBorders();
    }catch(java.io.IOException err)
    {
        System.out.println("Nie udało sie otworzyc pliku wejsciowego");
    }
 }

{
