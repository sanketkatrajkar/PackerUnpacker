import java.util.*;
import java.io.*;

public class program433
{
    public static void main(String A[]) throws Exception
    {
        try
        {
           File fobj = new File("PPA.txt");
           if(fobj.exists())
           {
             System.out.println("file is already exits.");
           }
           else
           {
             fobj.createNewFile();
             System.out.println("file succesfully created...");
           }  
        }
        catch(IOException iboj)
        {}
        catch(Exception eobj)
        {}

    }  
}
