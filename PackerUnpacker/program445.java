import java.util.*;
import java.io.*;

public class program445
{
    public static void main(String A[]) throws Exception
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of Source file :");
            String Source = sobj.nextLine();

            System.out.println("Enter the name of Destination file :");
            String Destination = sobj.nextLine();

            File fSource = new File(Source);
            if(fSource.exists() == false)
            {
                System.out.println("source file is not present.");
                return;
            }

            File fDestination = new File(Destination);
            if(fDestination.exists() == true)
            {
                System.out.println("Destination file is present.");
                return;
            }

            fDestination.createNewFile();

            FileInputStream fiobj = new FileInputStream(fSource);
            FileOutputStream foobj = new FileOutputStream(fDestination);

            byte Buffer[] = new byte[1024];
            int iRet = 0;

            while((fiobj.read(Buffer)) != -1) 
            {
                foobj.write(Buffer);
            }

            System.out.println("File copy done.");
        }
        catch(Exception eobj)
        {}
    }  
}
