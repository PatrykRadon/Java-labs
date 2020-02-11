import java.io.IOException;


public class lab10{

public static void main(String[] Args) throws Exception{
   try{
    dictHandler new_handler = new dictHandler(Args[0]);
 
    if(new_handler.keyword().equals("add"))
        { 
            new_handler.add(Args[1], Args[2]);
        }
    else if(new_handler.keyword().equals("del"))
        {   
            new_handler.del(Args[1]);
        }
    else
        {
           new_handler.translate();
        }
    }catch(java.io.IOException e)
        {
         System.out.println("error opening a file.");
        }
    }
}
