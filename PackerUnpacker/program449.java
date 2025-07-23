import java.io.File;
import java.util.Scanner;

public class program449
{
    public static void main(String[] args) 
    {
        try
        {
           Scanner sobj = new Scanner(System.in);

           System.out.println("Enter the name of Directory: ");
           String DirName = sobj.nextLine();

           File fobj = new File(DirName);

           if(fobj.exists())
           {
               System.out.println("Dirctory is present "); 
               
               File Arr[] = fobj.listFiles();
               System.out.println("Number of file in dirctory are "+Arr.length);

               int i = 0;

               for(i = 0; i < Arr.length; i++)
               {
                  System.out.println("file name is : "+Arr[i].getName() +"  file size is : "+Arr[i].length());
               }
           }
           else
           {
              System.out.println("ther is no such dirctory");
           }
        }
        catch(Exception eobj)
        {

        }
    }
}
