import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
import java.io.Writer;
import java.io.FileWriter;

public class Volonoya
{
    private static String _path;
    private static String[] _args;
    private static int _width;
    private static int _height;
    private static int n_points;
    private static int[][] _points;
    private Scanner _outputScanner;
    private String _outputFile;
    private static int[][] _borders;

    public Volonoya(String[] args) throws Exception
    {   
        _args = args;
        _width = Integer.parseInt(_args[0]);
        _height = Integer.parseInt(_args[1]);
        _borders = new int[_width][_height];
        _path = _args[2];

        n_points = Integer.parseInt(_args[3]);
        _points = new int[n_points][2];
    }
    
    public static void loadPoints()
    {   
        int arg_c = 4;
        for(int i = 0 ; i < n_points ; i++)
        {
            String[] arr = _args[arg_c].split(",");
            _points[i][0] = Integer.parseInt(arr[0]);
            _points[i][1] = Integer.parseInt(arr[1]);
            _borders[_points[i][0]][_points[i][1]] = 15;
            arg_c = arg_c + 2;
        }
    }
    public static void createBorders()
    {
        for(int i = 0 ; i < _width; i++)
            {
                for(int j = 0; j < _height; j++)
                {
                    if( equalDist(i,j) )_borders[i][j] = 12;
                }
            }
    }

    private static boolean equalDist(int x, int y)
    {
        double[] distances = new double[n_points];
        for(int i = 0; i < n_points; i++)
        {   
            
            distances[i] = Math.pow(Math.pow(_points[i][0],2) + Math.pow(_points[i][1],2),2);
        }
        Arrays.sort(distances);
        if( (distances[0] - distances[1])  < 2 ) return true;
        else return false;
    }
    public static void save() throws Exception
    {
        Writer outWriter = new FileWriter(_path);
        outWriter.write("P3\n");
        outWriter.write("#Patryk Radon");
        outWriter.close();
    }
}
