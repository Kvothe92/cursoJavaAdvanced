
package javaadvanced.Viernes;
/*
Direccion Ip: Numero dinamico asignado a un nodo de una red, compuesto por
octetos que van del 0 al 255. Es una direccion logica que puede ser cambiada.

Protocolo: Conjunto de reglas para establecer la comunicacion: Ej: FTP, TCP,
TELNET, SMTP, POP.

Puerto: Esta asociado a la direccion ip para la comunicacion entre aplicaciones.

MAC: (Media Acces)
Direccion fisica estatica.

Oriented Conection Protocol:
    Es un proceso de tipo TCP, TCP/IP, confiable pero lento. El acuse de 
recibido es enviado por el receptor.

Conection Less Protocol:
    El receptor no envia el acuse de recio. Es rapido pero no confiable, pueden
o no llegar los paquetes. ej: UDP.

Socket: Punto final de una conexion bidireccional.

La programacion de sockets se utiliza para la comunicacion entre aplicaciones
que se ejecutan en diferentes JREs. Java Runtime Enviroment.


La programacion de Java Socket y Service Socket se utilizan para la programacion
orientada a la coneccion.

Las clases DatagramSocket y DatagramPacket son usadas para la programacion
de socket sin conexion.

El cliente en la programacion necesita saber:
    IP adreee del server
    Port number
    Socket class
El socket es un punto final para las comunicaciones entre dispositivos.
    Socket class
    metoros
        Public InputStream getInputStream()
            regresa el is adjunto con el socket
        Public OutputStream getOutputStream()
            regresa el os adjunto al socket
        public Synchronized void close()
            cierra el socket

    ServerSocket    
    Metodos
        public Socket accept()
            establece la conexion entrante
        public Synchronized void close()
            cierra la conexion del servidor
*/

public class JavaAdvancedViernes {
    
}
