import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.util.ArrayList;


public class dictHandler{
    private String _outputFile = "out.txt";
    private String _keyword = "";
    
    public dictHandler(String keyword)
    {
        _keyword = keyword;
    }
    public String keyword()
    {
        return _keyword;
    }
    public void add(String first, String second) throws Exception
    {   
        BufferedWriter out = new BufferedWriter(new FileWriter(_outputFile,true));
        out.write("\n");
        out.write(first + "@" + second );
        out.close();
    }
    public void del(String first) throws Exception
    {   
        Scanner inputScanner = new Scanner(new File(_outputFile));
        ArrayList<String> dict = new ArrayList<String>();
        while(inputScanner.hasNext())
            {   
                String current = inputScanner.next();
                String[] arr = current.split("@");
                if( !arr[0].equals(first) & !arr[1].equals(first))
                    dict.add(current);
            }
        inputScanner.close();

        Writer out = new FileWriter(_outputFile);
        for(int i = 0; i < dict.size(); i++)
        {   
            out.write("\n");
            out.write(dict.get(i));
        }
        
        out.close();
    }
    public boolean translate() throws Exception
    {
        Scanner _inputScanner = new Scanner(new File(_outputFile));
        while(_inputScanner.hasNext())
            {
                String current = _inputScanner.next();
                String[] arr = current.split("@");
                if( arr[0].equals(_keyword))
                    {
                        System.out.println(arr[1]);
                        return true;
                    }
                else if(arr[1].equals(_keyword))
                    {
                        System.out.println(arr[0]);
                        return true;
                    }
            }
        System.out.println("Nie udalo sie odnalezc slowa");
        return false;
    }
}
