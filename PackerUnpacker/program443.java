import java.util.*;
import java.io.*;

public class program443
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

              System.out.println("data from file is :");

              while((iRet = fiobj.read(Arr)) != -1)
              {
                  String str = new String(Arr,0,iRet);
                  System.out.println(str);
              }
              System.out.println("value of iret at the end "+iRet);
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
