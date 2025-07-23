import java.util.*;
import java.io.*;

public class program441
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

              int iRet = 0;
              String str = null;

              System.out.println("data from file is :");

              while((iRet = fiobj.read(Arr)) != -1)
              {
                  str = new String(Arr);
                  System.out.print(iRet);
              }
              System.out.print("value of iret at the end "+iRet);
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
