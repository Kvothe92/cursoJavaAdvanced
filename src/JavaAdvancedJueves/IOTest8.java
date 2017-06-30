package JavaAdvancedJueves;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class IOTest8 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C\\Magia.txt");
        FileInputStream fis2 = new FileInputStream("C\\ROUND.txt");
        
        FileOutputStream fos = new FileOutputStream("C\\Magic.txt");
        
        SequenceInputStream sis = new SequenceInputStream(fis, fis2);
        
        int i;
        while ((i=sis.read())!=-1) {
            fos.write(i);
            System.out.println((char)i);
        }
    }
    
    private static void close(FileInputStream fis, FileInputStream fis2,
            FileOutputStream fos, SequenceInputStream sis) throws IOException{
        fis.close();
        fis2.close();
        fos.close();
        sis.close();
    }
}