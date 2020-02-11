import java.util.Scanner;

public class lab02
{

    
    static int x = 0;
    static int y = 0;
    static String first = "";
    static String second = "";
    
 static int shortestMatchingSubstring(String first,String second)
 {  
//    shared_zeros = countZeros(first, second, x , y) );
   first = orderString(first, x);
   x = first.length();
   second = orderString(second, y);
   y = second.length();
   
    System.out.println(first + "+" + second + " " + x + " " + y);
   
    equalizeZeros(first, second, x, y);
   
   
   return -1;/*biggerOf( shorterOrderedString(first, second).length(), shared_zeros);*/
 }
 
 static String orderString(String bits, int length)
 {  
    
    String ordered = "";
    boolean zeros = true;
    for(int i = 0; i<length; i++)
    {
       if(zeros)
       {
        if( bits.charAt(i) != '0')
        {
            zeros = false;
            ordered += bits.charAt(i);
        }
        else
        {
            ordered += bits.charAt(i);
        }
       }
       else if( bits.charAt(i) != '0' )
       {
            ordered += bits.charAt(i);
       }
    }
    
    return ordered;
 }
 
 static void equalizeZeros(String first, String second, int length_f, int length_s)
 {  
    int f_z = 0;
    int s_z = 0;
    
    int f_o = 0;
    int s_o = 0;
    
    int shorter;
    boolean zeros = true;
    boolean alg = true;
    String temp_first= "";
    String temp_second = "";
    for(int i = 0; i < length_f; i++)
    {
        if(first.charAt(i) == '0') f_z++;
        else f_o++;
    }
    
    for(int i = 0; i < length_s; i++)
    {
        if(second.charAt(i) == '0') s_z++;
        else s_o++;
    }
    
    if(s_z > f_z) shorter = f_z;
    else shorter = s_z;
    
    for(int i = 0; i < shorter; i++)
    {
        temp_first += '0';
        temp_second += '0';
    }
    
    for(int i = 0; i < f_o; i++)
    {
        temp_first += '1';
    }
    
    for(int i = 0; i < s_o; i++)
    {
        temp_second += '1';
    }
    
      System.out.println(temp_first + "+" + temp_second + " " + x + " " + y);

    
    first = temp_first;
    second = temp_second;
    length_f = shorter + f_o;
    length_s = shorter + s_o;
    
 }

 
 
 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
  x = in.nextInt();
  y = in.nextInt();
  for(int i = 0; i < x; i++)
  {
    first += Integer.toString(in.nextInt());
  }
  for(int i = 0; i < y; i++)
  {
    second += Integer.toString(in.nextInt());
  }
  System.out.println(shortestMatchingSubstring(first, second));
 }
}
