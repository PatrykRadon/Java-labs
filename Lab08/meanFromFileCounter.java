import java.io.File;
import java.util.Scanner;
import java.io.Writer;
import java.io.FileWriter;

public class meanFromFileCounter
{
    private String _inputFile;
    private String _outputFile;
    private Scanner _inputScanner;
    private float _inputSum = 0;
    private int _inputLength = 0;
    private double _inputMean;

    public meanFromFileCounter(String inputFile, String outputFile)
    throws Exception{
        _inputFile = inputFile;
        _outputFile = outputFile;
        try
        {
        _inputScanner = new Scanner(new File(_inputFile));
        }catch(java.io.IOException err)
        {
            throw new InputFileException();
        }
    }
    public void countAverage ()throws Exception
    {
        while(_inputScanner.hasNextFloat())
        {
            _inputSum += _inputScanner.nextFloat();
            _inputLength += 1;
        }
        if(_inputLength == 0) throw new NoArgumentsInputException();
        else if(_inputSum == 0) throw new DivideByZeroException();
    }
    public void saveToOutput ()throws Exception
    {   
        try{
        Writer outWriter = new FileWriter(_outputFile);
        float avg = _inputSum/_inputLength;
        outWriter.write(Float.toString(avg));
        outWriter.close();
        }catch(java.io.IOException err)
        {
            throw new OutputFileException();
        } 

        
    }

}
