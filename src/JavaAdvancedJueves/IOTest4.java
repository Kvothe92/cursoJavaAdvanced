
package JavaAdvancedJueves;

import java.io.FileInputStream;
import java.io.IOException;

public class IOTest4 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("c:\\Magia.txt");
            
            int i = 0;
            
            while ((i=fis.read())!=-1) {
                System.out.print((char)i);
                
            }
        
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
