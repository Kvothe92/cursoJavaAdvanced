
package JavaAdvancedMartes;
/*
Abstraccion: Accion de separar mentalmente la representacion de las 
caracteristicas escenciales de un objeto, sin incluir antecedentes o 
detalles irrelevantes.
Es el proceso natural en los seres humanos de poseer la facultad intuitiva
 de conocer la escencia de las cosas.
Existen 5 tipos de abstraccion.
    Funcional, Parametrica, de Datos, Contextual y Generica.

1.-Funcional: Sirve para modelar la interaccion logica, es decir, como se 
daran las instrucciones de: planteamiento, entrada, procesamiento, slida y
navegabilidad en el algoritmo.

2.-Datos: Permite delimitar los atributos y sus metodos que deben servir 
para modelar una clase de objetos tomando en cuenta sus alcances, sus tipos
de datos, sus parametros y sus valores de retorno.

3.-Contextual: Proceso mental que comienza con el analisis de un fenomeno,
amalgamando las abstracciones de datos y funcional para integrar una
solucion automatizada, que utilice de cierto, los acervos de conocimientos
previos y tome en cuenta las restricciones y los riesgos.

4.-Parametrica: Cuando se diseñan los metodos y la operaciones de las 
abstracciones de datos, funcionales y contextuales, puede haber redundancias 
que es posible evitar si se parametrizan apropiadamente y, con esto
se ahorra codigo y se tiene una mayor legibilidad, flexibilidad y 
mantenibilidad en los desarrollos de software.

5.-Generica: Es un tipo especial de abstraccion parametrica que se usa en 
las clases genericas pero en lugar de parametrizar variables se parametrizan
tipos de dato. Su objetivo es la reutilizacion de algoritmos.

EN JAVA
Una clase declara con la palabra reservada Abstrac se considera abstracta
de nombre.
Puede ser abstracta con metodos no abstractos.

La abstraccion es un proceso para ocultar los detalles de implementacion
y ostrar solo la funcionalidad al usuario.

Enviar sms solo escribe el texto y lo envia
No conocemos el proceso interno sobre la entrega de mensajes.

La abstraccion permite concentrarce en LO QUE HACE el objeto en lugar del
COMO LO HACE.

Formas de lograr la Abstraccion:
    1.- Clase Abstracta (0 a 100%)
    2.- Interface (100%)

Una clase declarada abstracta necesita ser extendida (extends) e implementar 
sus metodos. No se puede instanciar.

abstract class A{}

Un metodo que es declarado como abstracto no tiene implementaciones 
(COMO LO HACE)
abstract void print();
*/
abstract class Shape{
    //Declaracion↓↓↓
    abstract void draw();
}
class Circle extends Shape{
    void draw(){
        System.out.println("Dibujando un circulo");
    }
}
    
public class AbstraccionT extends Shape {
    public static void main(String[] args) {
        Shape s = new AbstraccionT();
       // shape s2 = new Circle();
        s.draw();
        //s2.draw();
    }
    //Como lo hace↓↓↓
    @Override
    void draw() {
        System.out.println("Dibujando");
    }
}
