import java.util.*;
import java.io.*;

public class program474
{
    public static void main(String[] args) 
    {
        try
        {
           String Header = null;
           File fobj = null;
           Scanner sobj = new Scanner(System.in);
           int fileSize = 0, iRet = 0;
           

           System.out.println("Enter the name of file which contains packed data :");
           String PackName = sobj.nextLine();

           fobj = new File(PackName);

           if(!fobj.exists())
           {
              System.out.println("Unable to Access packed file:");
              return;
           }

           System.out.println("Packed file get successfully opend");

           FileInputStream fiobj = new FileInputStream(fobj);

           //buffer to read the header
           byte HeaderBuffer[] = new byte[100];

           while((iRet = fiobj.read(HeaderBuffer, 0 , 100)) != -1)
           {
               // convert byte array to String 
              Header = new String(HeaderBuffer);
   
              String Tokens[] = Header.split(" ");
   
              File fobjnew = new File(Tokens[0]);
   
              fobjnew.createNewFile();
   
              fileSize = Integer.parseInt(Tokens[1]);
   
              byte Buffer[] = new byte[fileSize];
   
              FileOutputStream foobj = new FileOutputStream(fobjnew);
   
              fiobj.read(Buffer, 0, fileSize);
              foobj.write(Buffer, 0 , fileSize);

              foobj.close();
                 
           } // End of while loop 
           
           fiobj.close();
        }
        catch(Exception eobj)
        {}
    } //End of main 
} // end of program467 class 
