import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class program455
{
    public static void main(String[] args) 
    {
        try
        {
           String Header = "PPA.txt 30";

           System.out.println("Header size is :"+Header.length());

           int i = 0;
           for(i = Header.length(); i < 100 ; i++)
           {
               Header = Header + " ";
           }

           System.out.println("Header size after is :"+ Header.length());

           System.out.println("Updateted us header is "+ Header);

           Header = Header.trim();

           System.out.println("Header size after trime is :"+ Header.length());

           System.out.println("Updateted us header is "+ Header);
        }
        catch(Exception eobj)
        {}
    }
}
