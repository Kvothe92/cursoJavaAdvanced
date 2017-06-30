
package JavaAdvancedJueves;


public class ThreadP extends Thread{
    public void run(){
        System.out.println("Hilo ejecutando: "+
                Thread.currentThread().getName());
                System.out.println("Hilo ejecutando: "+
                Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        ThreadP t1 = new ThreadP(), t2 = new ThreadP(), t3 = new ThreadP();
        
        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(NORM_PRIORITY);
        t3.setPriority(MAX_PRIORITY);
        
        t1.start();
        t2.start();
        t3.start();
        
        t1.setName("Hilo A");
        t2.setName("Hilo B");
        t3.setName("Hilo C");
        
        System.out.println("El nombre del hilo ahora es: "+t1.getName());
        System.out.println("El nombre del hilo ahora es: "+t2.getName());
        System.out.println("El nombre del hilo ahora es: "+t3.getName());
    }
}
