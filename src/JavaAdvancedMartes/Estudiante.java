
package JavaAdvancedMartes;
/*
    La palabra reservada estatica se utiliza para la administracion de memoria
principalmente. Es aplicada a variables, metodos, bloques y clases anidadas.
La palabra static pertenece a la clase que la instancia.

Para variables: Se puede utilizar para referir una propiedad común
en todos los objetos.
La variable estatica obtiene memoria solo una vez en el area de la clase en el
momento que se crea.

Promueve la eficiencia en el rendimiento del programa.
*/
public class Estudiante {
    int matricula;
    String nombre;
    static String Univercidad = "UAS";

    public Estudiante(int m, String n) {
        matricula = m;
        nombre = n;
    }
    void show(){
        System.out.println(matricula+" "+nombre+" "+Univercidad);
    }
    public static void main(String[] args) {
        Estudiante s1 = new Estudiante(111,"Bruno");
        Estudiante s2 = new Estudiante(112,"Katia");
        
        s1.show();
        s2.show();
    }
    
}
