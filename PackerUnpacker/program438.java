import java.util.*;
import java.io.*;

public class program438
{
    public static void main(String A[]) throws Exception
    {
        try
        {
            Scanner sobj = new Scanner(System.in);
            System.out.println("Enter the name of the file that you want to open:");

            String Fname = sobj.nextLine();
        
            File fobj = new File(Fname);

            if(fobj.exists())
            {
              FileInputStream fiobj = new FileInputStream(fobj);

              byte Arr[] = new byte[10];

              fiobj.read(Arr);
              String str = new String(Arr);

              System.out.println("Data from file is "+ str);

            }
            else
            {
              System.out.println("file not present to current directory...");
              return;
            }  
        }
        catch(IOException iboj)
        {}
        catch(Exception eobj)
        {}

    }  
}
