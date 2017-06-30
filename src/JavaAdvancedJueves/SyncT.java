package JavaAdvancedJueves;
/*
La sincronizacion en java es la capacidad de controlar el acceso de multiples
hilos en cualquier recurso compartido.
La sincronizacion es la mejor opcion cuando queremos permitir que solo un hilo
pueda acceder a recursos compartidos.
La sincronizacion es principalmete usada para:
    1.- Prevenir la interferencia de hilos
    2.- Prevenir problemas de inconsistencia
Tipos de sincronizacion 
    1.- Procesos
    2.- Hilos: Mutualmente Excluyentes
        1.- Metodo Sincronado
        2.- Bloqueo Sincronado
        3.- Sincronizacion Estatica

Cooperacion: Comunicacion entre hilos.
Exclucion Mutua: Ayuda a prevenir que los hilos interfieran entre si mientras
comparten informacion.

Bloqueo: La sincronizacion se basa en una entidad interna conocida como lock
o monito. Cada objeto tiene un bloqueo asociado a el.

Por convencion un hilo necesita un acceso consistente a los campos de un objeto,
tiene que adqurir el bloqueo del objeto antes de acceder a ellos y a 
continuacion liberar el bloqueo cuando se hace con ellos.

Desde java 5, el paquete java.util.concurrent.locks contiene varias 
implementaciones de bloqueo.
*/

class Tabla{
    void imprimir(int n){
        for (int i = 1; i <= 5; i++) {
            System.out.println(n*1);
            try{
                Thread.sleep(400);
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}

class Hilo1 extends Thread{
    Tabla t;
    Hilo1(Tabla t){
        this.t = t;
    }
        public void run(){
            t.imprimir(100);
        }
}
class Hilo2 extends Thread{
    Tabla t;
    Hilo2(Tabla t){
        this.t = t;
    }
        public void run(){
            t.imprimir(100);
        }
}
public class SyncT {
    
    public static void main(String[] args) {
        Tabla ob = new Tabla();
        Hilo1 t1 = new Hilo1(ob);
        Hilo2 t2 = new Hilo2(ob);
        
        t1.start();
        t2.start();
    }
    
    
}
