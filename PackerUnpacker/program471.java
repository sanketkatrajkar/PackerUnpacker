import java.util.*;
import java.io.*;

public class program471
{
    public static void main(String[] args) 
    {
        try
        {
           Scanner sobj = new Scanner(System.in);

           System.out.println("Enter the name of file which contains packed data :");
           String PackName = sobj.nextLine();

           File fobj = new File(PackName);

           if(!fobj.exists())
           {
              System.out.println("Unable to Access packed file:");
              return;
           }

           System.out.println("Packed file get successfully opend");

           FileInputStream fiobj = new FileInputStream(fobj);

           String Tokens[] = Header.split(" ");
           System.out.println("file name is :"+Tokens[0]);
           System.out.println("file name is :"+Tokens[1]);


        }
        catch(Exception eobj)
        {}
    } //End of main 
} // end of program467 class 
