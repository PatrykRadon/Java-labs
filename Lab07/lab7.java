import java.util.Scanner;

public class lab7
{
 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
    int n = 0;
    int m = 0;
    n = in.nextInt();
    m = in.nextInt();

  if(n == 0 || m == 0 || n%2 == 1)System.out.print("podaj prawidłowe parametry wejściowe");

  int[][] Arr = new int[m][n];
  
  int[][] ParityMatrix = new int[n][n];
    //init
  for(int i = 0; i < n; i++)for(int j = 0; j < n; j++) ParityMatrix[i][j] =0;

    //intit
    for(int i = 0; i < m; i++)
    {
        for(int j = 0; j < n; j++)
        {
            Arr[i][j] = in.nextInt() - 1;
        }
    }

  //get parity
  for(int i = 0; i < m; i++)
    {
        for(int j = 0; j < n/2; j++)//uwzglednic n<2
        {   
            for(int j_prim = n/2; j_prim < n ; j_prim++)
            ParityMatrix[ Arr[i][j] ][ Arr[i][j_prim] ] += 1;
        }
    }
    

    boolean AllTested = true;
    //parity fold
    for(int i = 0; i < n - 1; i++)
       {
            for(int j = i+1; j < n; j++) 
            {
                if( ParityMatrix[ i ][ j ] + ParityMatrix[ j ][ i ]  == 0) AllTested = false;
            }
       }

    if(AllTested)System.out.println("TAK");
        else System.out.println("NIE");


 }
}
