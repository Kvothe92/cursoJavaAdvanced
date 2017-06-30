
package JavaAdvancedMartes;
/*
    Restricciones de Static
    No puede utilizar mienbros no estaticos para referencia y no puede ser
    usadas en un contexto
*/

public class Contador {
    static int i=0;

    public Contador() {
        i++;
        System.out.println(i);
    }
    public static void main(String[] args) {
        Contador i1 = new Contador();
        Contador i2 = new Contador();
        Contador i3 = new Contador();
    }
    
    
}
