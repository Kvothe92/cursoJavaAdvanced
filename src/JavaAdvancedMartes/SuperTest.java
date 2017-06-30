
package JavaAdvancedMartes;
/*
Super es una palabra reservada en java como una variable referencia la cuan es 
usada para servir de intermediario entre la clase padre y la subclase.

Usos de super
    1.-Se puede utilizar para referir la variable de instancia de la clase
    padre inmediata.
    2.-Se puede utilizar para invocar el metodo de la clase padre inmediato.
    3.- Se puede utilizar para invocar al constructor de la clase padre
    inmediata.
*/

class Animal{
    //Caso #3
    public Animal() {
        System.out.println("Se ha creado el animal");
    }
    
    String color = "Blanco";
    //Caso #2
    void eat(){
        System.out.println("Comiendo...");
    }
    //Caso #1
}

class Perro extends Animal{
    //Caso #3
    Perro(){
        super();
        System.out.println("Se ha creado el perro");
    }
    //Caso #2
    @Override
    void eat(){
        System.out.println("Comiendo croquetas");
    }
    void Dormir(){
        System.out.println("El perro se durmio");
    }
    void Llamar (){
        super.eat();
        Dormir();
    }
    //Caso #1
    String color = "Cafe";
    void printColor(){
        //Imprime el color de la clase animal
        System.out.println(super.color);
    }
}

public class SuperTest {
    public static void main(String[] args) {
        //Caso #3
        
        //Caso #2
        new Perro().Llamar();
        
        //Caso #1
        new Perro().printColor();
    }
}
