/*
Clase: conjunto de objetos con caracteristicas similares que se identifican por nombre, atributos y una serie de funciones
o metodos aplicables a todo el conjunto.
Es una plantilla para caracterizar o definir objetos.

Abstraccion: Es la facultad intuitiva que permite conocer la escencia de las cosas.

Modularidad:Es un proceso mental que permite distinguir los componentes de los objetos que estan siendo estudiados.

Encapsulamiento: Permite ocultar las caracteristicas no relevantes de una clase, destacar las relevantes y modelar
su comportamiento. Dando como resultado la abstraccion de datos.

Herencia: Relacion entre clases cuya existencia depende de un ancestro, clase delega sus atributos y metodos a las
clases derivadas.

Poimorfismo: Es el conjunto de operaciones aplicables a un objeto por medio de los mensajes que invocan a algunos
de los metodos definidos en la clase a la que pertenece el objeto de acuerdo al dominio de la aplicacion(contexto).

Objeto: Es una identidad real o imaginaria que tienen identidad, estado y un comportamiento, conforme al conjunto
de objetos (clase) a la que pertenece. Es una instancia de una clase

Un objeto mujer es una estancia de una mujer con clase.
Mujer mujer = new mujer();

Una clase en java contiene lo siguiente:
    campos
    metodos 
    constructores
    bloques
    clases anidadas e interfaces

class <class_name>{
    field;
    method;
}
variables de instancia
Mujer mujer = new mujer();
*/
package JavaAdvancedLunes.Poo;

public class Bike {
    public static void main(String[] args) {
        MountainBike bici = new MountainBike();
        bici.setColor("Azul");
        bici.setVelocidad(6);
        show();
    }
     public static void show(){
        MountainBike bici = new MountainBike();
        bici.setColor("Azul");
        bici.setVelocidad(6);
        String msg="Soy una bici de montaña";
        msg += " mi color es "+bici.getColor();
        msg += " y tengo "+bici.getVelocidad();
        msg += " velocidades.";
        System.out.println(msg);   
    }   
}

class MountainBike {
    
    int velocidad;
    String color;
    
    public int getVelocidad(){ return velocidad; }
    
    protected boolean setVelocidad(int velocidad) {
        if(velocidad > 0){
            this.velocidad = velocidad;
            return true;
        } else {
            return false;
        }
    }
    
    public String getColor(){ return color; }
    
    public void setColor(String color){ this.color = color; }
}
