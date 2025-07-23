import java.util.*;
import java.io.*;

public class program434
{
    public static void main(String A[]) throws Exception
    {
        try
        {
            Scanner sobj = new Scanner(System.in);
            System.out.println("Enter the name of the file that you want to create:");

            String Fname = sobj.nextLine();
        
            File fobj = new File(Fname);

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
