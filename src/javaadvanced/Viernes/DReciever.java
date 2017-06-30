
package javaadvanced.Viernes;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class DReciever {
    public static void main(String[] args) throws Exception{
        System.out.println("Ventana-Servidor");
        DatagramSocket ds = new DatagramSocket(3000);
        byte[]b = new byte[1024];//1KB
        DatagramPacket dp = new DatagramPacket(b, 1024);
        
        ds.receive(dp);
        String str = new String(dp.getData(),0,dp.getLength());
        System.out.println(str);
        ds.close();
    }
}
