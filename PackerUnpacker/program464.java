import java.util.*;
import java.io.*;

public class program464
{
    public static void main(String[] args) 
    {
        try
        {
           Scanner sobj = new Scanner(System.in);

           System.out.println("Enter the name of Directory that you want to pack: ");
           String DirName = sobj.nextLine();

           System.out.println("Enter the name file that you want to create to packing : ");
           String PackName = sobj.nextLine();

           File Packobj = new File(PackName);
           boolean bRet =  Packobj.createNewFile();

           if(bRet == false)
           {
              System.out.println("unable to create pack file");
              return;
           }

           File fobj = new File(DirName);

           if(fobj.exists() && fobj.isDirectory())
           {
               System.out.println("Dirctory is present "); 
               
               File Arr[] = fobj.listFiles();
               System.out.println("Number of file in dirctory are "+Arr.length);

               int i = 0, j = 0, iRet = 0;

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
               }
               
               System.out.println("Packing Activity Done.");
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
