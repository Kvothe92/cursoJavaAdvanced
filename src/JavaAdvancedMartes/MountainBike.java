package JavaAdvancedMartes;


public class MountainBike {
    
    
    public static void main(String[] args) {
        show();
        showBici();
        
    }
    public static void show(){
        //Bike b = new Bike("Azul", 6);
        //System.out.println(b.getColor());
        //System.out.println(b.getVelocidad());  
    }
    public static void showBici(){
        Bike b2 = new Bike("Negra", "Magistroni", 8);
        System.out.println(b2.getColor());
        System.out.println(b2.getMarca());
    }
    
}
