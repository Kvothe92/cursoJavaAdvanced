
package JavaAdvancedJueves;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class IOTest2 {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileOutputStream fos = new FileOutputStream
        ("C:\\Magia.txt");
            String s = "Magia!!!";
            byte b[] = s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Magia!!!");
                    
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
