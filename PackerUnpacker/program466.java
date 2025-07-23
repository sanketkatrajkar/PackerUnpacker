import java.util.*;
import java.io.*;

public class program466
{
    public static void main(String[] args) 
    {
        try
        {
           System.out.println("---------------------------------------------------------------");
           System.out.println("--------------Marvellous Packer Unpacker-----------------------");
           System.out.println("---------------------------------------------------------------");
           System.out.println("----------------------Packing Activity-------------------------");
           System.out.println("---------------------------------------------------------------");

           int i = 0, j = 0, iRet = 0, iCountfiles = 0;
           Scanner sobj = new Scanner(System.in);

           System.out.println("Enter the name of Directory that you want to pack: ");
           String DirName = sobj.nextLine();

           System.out.println("Enter the name file that you want to create to packing : ");
           String PackName = sobj.nextLine();

           File fobj = new File(DirName);

           //Check the extistance of directory 
           if(fobj.exists() && fobj.isDirectory())
           {
               System.out.println(DirName +"is Succesfully opned."); 
    
               File Packobj = new File(PackName);
    
               //create a Pack file
               boolean bRet =  Packobj.createNewFile();
    
               if(bRet == false)
               {
                  System.out.println("unable to create pack file");
                  return;
               }

               System.out.println("Pack file succesfully created with name"+ PackName);

               //Retrive all file from dirctory 
               File Arr[] = fobj.listFiles();

               //Pack file object 
               FileOutputStream foobj = new FileOutputStream(Packobj);

               //Buffer for read and write activity
               byte Buffer[] = new byte[1024];
               
               String Header = null;

               //Directory Traversal
               for(i = 0; i < Arr.length; i++)
               {
                  Header = Arr[i].getName() + " " + Arr[i].length();

                  //loop to form 100 byte header
                  for(j = Header.length(); j < 100 ; j++)
                  {
                    Header = Header + " ";
                  }

                  //Write Header into pack file
                  foobj.write(Header.getBytes());

                  //Open file from directory for reading 
                  FileInputStream fiobj = new FileInputStream(Arr[i]);
                  
                  //Write contains of ile into packed file
                  while((iRet = fiobj.read(Buffer)) != -1)
                  {
                     foobj.write(Buffer,0 , iRet);

                     System.out.println("file name Scanned :"+ Arr[i].getName());
                     System.out.println("file size read is :" + iRet);
                  }

                  fiobj.close();
                  iCountfiles++;
               }
               
               System.out.println("Packing Activity Done.");

               System.out.println("---------------------------------------------------------------");
               System.out.println("----------------Statistical Report-----------------------------");
               System.out.println("---------------------------------------------------------------");

               // to be add

               System.out.println("Total file pack :"+iCountfiles);
               System.out.println("---------------------------------------------------------------");
               System.out.println("-------------Thank you for using our application---------------");
               System.out.println("---------------------------------------------------------------");
           }
           else
           {
              System.out.println("there is no such dirctory");
           }
        }
        catch(Exception eobj)
        {}
    }
}
