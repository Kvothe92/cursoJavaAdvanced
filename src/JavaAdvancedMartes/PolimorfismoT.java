
package JavaAdvancedMartes;

class Animal2{
    void eat(){
            System.out.println("Comiendo...");
    }
}
class Dog extends Animal2{
    void eat(){
        System.out.println("Comiendo croquetas");
    }
}
class Cachorro extends Animal2{
    void eat(){
        System.out.println("Tomando leche");
    }
}

public class PolimorfismoT {
    public static void main(String[] args) {
        Animal2 a;
        a= new Animal2();
        a.eat();
        a= new Dog();
        a.eat();
        a= new Cachorro();
        a.eat();
    }
}
