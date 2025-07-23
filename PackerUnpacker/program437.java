import java.util.*;
import java.io.*;

public class program437
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
              FileOutputStream foobj = new FileOutputStream(fobj);
              String str = "Jay Ganesh...";

              byte Arr[] = str.getBytes(str);

              foobj.write(Arr);
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
