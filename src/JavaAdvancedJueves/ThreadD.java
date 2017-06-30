/*
Un hilo demonio en Java es un hilo proveedor de servicios que proporciona 
servicios activos de usuario.
Su vida depende de los demas hilos, es decir, si todos los demas hilos se mueren
laJVM lo determina automaticamente.

Hay muchos hilos demonios en java que se ejecutan automaticamente. Garbage,
Finalizer, etc.

JConsole en el simbolo del sistema, proporciona la informacion sobre las clases
cargadas, uso de memoria, ejecucion de hilos, etc.

Puntos importantes.

Un hilo en java proporciona servicios a los hilos para brindar soporte a 
tareas en un segundo plano.

Su vida depende de los hilos de usuario
Es un hilo de baja prioridad.
Java.lang.Thread provee los metodos de un demonio

1.- public setDaemon(boolean status) es usado para marcar el hilo actual,
como un hilo demonio.

2.- public boolean is demon() revisa si el hilo actual es un demonio
 */
package JavaAdvancedJueves;


public class ThreadD extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Tenemos un demonio aqui");
        }else{
            System.out.println("Ah no es un hilo de usuario");
        }
    }
    public static void main(String[] args) {
        ThreadD t1 = new ThreadD(), t2 = new ThreadD(), t3 = new ThreadD();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
