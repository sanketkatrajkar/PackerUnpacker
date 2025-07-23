import java.io.File;
import java.util.Scanner;

public class program447 
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
