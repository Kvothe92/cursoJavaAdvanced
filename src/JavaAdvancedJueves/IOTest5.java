
package JavaAdvancedJueves;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
La clase Java BufferedOutputStream se utiliza para almacenar enun bufer un 
stream de salida.
Internamente utiliza un bufer para almacenar datos directamente en un stream.
Añade mas eficiencia que escribir datos de manera directa en un flujo.
Por lo tanto logra un mejor rendimiento.
Tiene 2 constructores:
    BufferedOutputStream(OutputStream os):
        Crea un nuevo flujo de salica almacenado en bufer. 
        Que se utiliza para escribir los datos en el stream especfificado
    BufferedOutputStream(OuputStream os, int size)
        Crea un nuevo flujo de salida que sera almacenado en un bufer el cual
        se utiliza para escribir los datos en el stream especificando el 
        tamaño del bufer.
Metodos:
    void write(int b): Escribe el byte especificando en el stream de salida 
    almacenado en bufer.
    void write(byte[] b, int off, int len):
    Escribe los bytes de la secuencia de stream de bytes especificada en un 
    arreglo de bytes.
    Comienza con el desplazamiento dado.

void flush(): Borra el flujo de salida almacenado en bufer.
Vacia los datos de una secuancia y la envia a otra. Se necesita si te a 
conectado una secuancia con otra.
*/

public class IOTest5 {
    public static void main(String[] args) {
        try{
        FileOutputStream fos = new FileOutputStream("C:\\Magia.txt");
        
            BufferedOutputStream bout = new BufferedOutputStream(fos);
        String s = "Hola\n a todos";
        byte[]b = s.getBytes();
        
        bout.write(b);
        bout.flush();
        
        bout.close();
        fos.close();
            
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}
