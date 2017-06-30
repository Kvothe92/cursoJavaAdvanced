
package JavaAdvancedJueves;

//Muchos hilos una sola tarea
public class MultiTask extends Thread{
   
    @Override
    public void run(){
        System.out.println("Tarea uno");
    }
    
    public static void main(String[] args) {
        MultiTask t1 = new MultiTask(), t2 = new MultiTask(), 
                t3 = new MultiTask();
        
        t1.start();
        t2.start();
        t3.start();
    }
}

class M implements Runnable{
   
    public void run(){
        System.out.println("Tarea uno");
    }
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new M());
        Thread t2 = new Thread(new M());
        
        TrueM t1m = new TrueM(), t2m = new TrueM();
        
        t1.start();
        t2.start();
    }
}

class TrueM{
    public void run(){
        System.out.println("Tarea A");
    }
}

class TrueMT extends Thread{
    public void run(){
        System.out.println("Tarea B");
    }
}
