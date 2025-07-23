import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class program458
{
    public static void main(String[] args) 
    {
        try
        {
           String str = "     Marvellous Infosystems Pune     ";

           System.out.println("Original Length :"+ str.length());

           str = str.trim();

           System.out.println("Updated Length :"+ str.length());

           String Arr[] = str.split(" ");

           System.out.println("Number of token "+ Arr.length);
        }
        catch(Exception eobj)
        {}
    }
}
