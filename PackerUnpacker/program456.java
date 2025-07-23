import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class program456
{
    public static void main(String[] args) 
    {
        try
        {
           String str = "Marvellous Infosystems Pune";

           System.out.println("Original Length :"+ str.length());

           str = str.trim();

           System.out.println("Updated Length :"+ str.length());

        }
        catch(Exception eobj)
        {}
    }
}
