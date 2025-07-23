import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class program460
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

               int i = 0;

               FileOutputStream foobj = new FileOutputStream(Packobj);

               byte Buffer[] = new byte[1024];
               int iRet = 0;

               for(i = 0; i < Arr.length; i++)
               {
                  System.out.println("file name is : "+Arr[i].getName() +"  file size is : "+Arr[i].length());

                  FileInputStream fiobj = new FileInputStream(Arr[i]);
                  
                  while((iRet = fiobj.read(Buffer)) != -1)
                  {
                     foobj.write(Buffer,0 , iRet);
                  }

                  fiobj.close();
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
