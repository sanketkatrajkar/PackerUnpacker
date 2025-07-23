import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class program459
{
    public static void main(String[] args) 
    {
        try
        {
           String str = "     Marvellous Infosystems Pune By Piyush Manohar Khairnar     ";

           System.out.println("Original Length :"+ str.length());

           str = str.trim();

           System.out.println("Updated Length :"+ str.length());

           String Arr[] = str.split(" ");

           System.out.println("Number of token "+ Arr.length);

           int i = 0;

           for(i = 0; i < Arr.length; i++)
           {
              System.out.println(Arr[i]);
           }
        }
        catch(Exception eobj)
        {}
    }
}
