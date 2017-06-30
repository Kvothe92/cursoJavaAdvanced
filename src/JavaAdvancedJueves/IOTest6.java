
package JavaAdvancedJueves;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class IOTest6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C\\Magia.txt");
        
        BufferedInputStream bin = new BufferedInputStream(fis);
        
        int i;
        while((i=bin.read())!=-1){
            System.out.println((char)i);
        }
        
        bin.close();
        fis.close();
    }
}
