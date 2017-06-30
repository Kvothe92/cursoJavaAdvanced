
package JavaAdvancedMartes;
/*
La asignatura es el encabezado del metodo
Firma o asignatura de un metodo es lo que permite distinguir sin ambiguedad
a los metodos tanto en la declaracion como en la invocacion (Emision de 
mensajes) y contiene 3 elementos:

El mvalor de retorno (tipo) : double
nombre del metodo : pow
numero, tipo y orden de los parametros : Math,pow(x,2)  Math.pow(2,x)

En la herencia ademas de producir una clase nueva basada en una antigua
añadiendo caracteristicas adicionales (especializacion); puedes extender
el comportamiento existente de la superclase.

Si un metodo se define en la subclase de modo que el nombre, el tipo y su lista 
de parametros coninciden exactamente con algun metodo de la clase ancestro, 
entonces ese nuevo metodo decimos que REDEFINE el comportamiento del antiguo.

Los metodos con el mismo nombre, pero diferente lista de parametros dentro 
de la misma clase se consideran simplemente sobrecargados. Esto provoca
que el compilador utilice los argumentos proporcionados en un mensaje para 
determinar cual metodo ha de llamar.

To overload ◄- Sobrecargar
To override ◄- Redefinir (Sobremontar)
/To overweite ◄- Sobreescribir

Override: Metodo con la misma signatura en distintas clases (de una jerarquia
de herencia).

Overload: Metodo con el mismo nombre que la clase y distinta asignatura.

Reglas para definir metodos
1.- El tipo de retorno del metodo redefinido debe ser identico al metodo que
redefine.
2.- Un metodo redefinido no puede ser menos accesible que un metodo al que se
define.
Superclase es publica, el redefinido no puede ser protected.
3.- Un metodo redefinido no puede lanzar exepciones diferente al metodo que 
redefine.

Diferencia entre sobrecarga y reddefinicion.
1.- La sobrecarga (overload) puede codificarse en una sola clase y la 
redefinicion (override) requiere 2 o mas clases.
2.- Los metodos sobrecargados tienen distinta asignatura.
3.- Los metodos redefinidos tienen la misma signatura.
*/
//SOBRECARGA
public class Adder {
    //Cambiando el numero de argumento
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    
    //2.- Cambiando el tipo de dato
    static int suma(int c, int d){
        return c+d;
    }
    
    static double suma(double c, double d){
        return c+d;
    }
    
    public static void main(String[] args) {
        System.out.println(Adder.add(111, 222));
        System.out.println(Adder.add(111, 222, 333));
        System.out.println(Adder.suma(11, 22));
        System.out.println(Adder.suma(11.11, 22.22));
    }
}
