import java.io.IOException;

public class lab8
{
 public static void main(String[] argv) throws Exception 
 {
    try
    {
        if(argv.length != 2) throw new WrongImputException();
        meanFromFileCounter NewCounter = new meanFromFileCounter(argv[0],argv[1]);
        NewCounter.countAverage();
        NewCounter.saveToOutput();
        
    }
    catch(WrongImputException err)
    {
        System.out.println("Incorrect input arguments");
    }
    catch(NoArgumentsInputException err)
    {
        System.out.println("No data found in the input file");
    }
    catch(DivideByZeroException err)
    {
        System.out.println("Sum of elements in input file equal to 0.0");
    }
    catch(InputFileException err)
    {
        System.out.println("Couldn't open input file");
    }
    catch(OutputFileException err)
    {
        System.out.println("Couldn't open output file");
    }
 }
}

