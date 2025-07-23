package MarvellousPackerUnpacker;

import java.util.*;
import java.io.*;

public class MarvellousUnpacker
{
    private String PackName;
    
    public MarvellousUnpacker(String a)
    {
        this.PackName = a;
    }

    public void UnpackingActivity()
    {
        try
        {
           System.out.println("---------------------------------------------------------------");
           System.out.println("--------------Marvellous Packer Unpacker-----------------------");
           System.out.println("---------------------------------------------------------------");
           System.out.println("----------------------Unpacking Activity-----------------------");
           System.out.println("---------------------------------------------------------------");

           String Header = null;
           File fobj = null;
           int fileSize = 0, iRet = 0, iCountfile = 0;

           fobj = new File(PackName);

           //If packed file is not present 
           if(!fobj.exists())
           {
              System.out.println("Unable to Access packed file:");
              return;
           }

           System.out.println("Packed file get successfully opend");

           FileInputStream fiobj = new FileInputStream(fobj);

           //buffer to read the header
           byte HeaderBuffer[] = new byte[100];

           //Scanned Packed file to extract the file form it
           while((iRet = fiobj.read(HeaderBuffer, 0 , 100)) != -1)
           {
              // convert byte array to String 
              Header = new String(HeaderBuffer);
   
              /// Tokenize the header into two parts
              String Tokens[] = Header.split(" ");
   
              File fobjnew = new File(Tokens[0]);
   
              //Create new file to extract 
              fobjnew.createNewFile();
   
              fileSize = Integer.parseInt(Tokens[1]);
   
              //Create new buffer to file data 
              byte Buffer[] = new byte[fileSize];
   
              FileOutputStream foobj = new FileOutputStream(fobjnew);
   
              // REad the data form pack file 
              fiobj.read(Buffer, 0, fileSize);
              
              //write the data into extracted file
              foobj.write(Buffer, 0 , fileSize);

              System.out.println("File Unpack with name "+Tokens[0]+" Having size"+fileSize);
              iCountfile++;
              foobj.close();
                 
           } // End of while loop 

               System.out.println("---------------------------------------------------------------");
               System.out.println("----------------Statistical Report-----------------------------");
               System.out.println("---------------------------------------------------------------");
           
               System.out.println("total number of files unpacked "+ iCountfile);
          

               System.out.println("---------------------------------------------------------------");
               System.out.println("-------------Thank you for using our application---------------");
               System.out.println("---------------------------------------------------------------");

                fiobj.close();
        }
        catch(Exception eobj)
        {}
    }
}