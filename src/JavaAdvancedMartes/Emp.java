
package JavaAdvancedMartes;

class Persona{
    int id;
    String nombre;
    public Persona(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    
    public class Emp {
        double salario;
        
        public Emp (int id, String nombre, double salario) {
            super(id, nombre);
            this.salario = salario;
        }
        void display(){
            System.out.println(id+" "+nombre+" "+salario);
        }
    }
}
class TestSuper{
    public static void main(String[] args) {
        Emp e = new Emp(1,"Bruno", 45,000.00);
        e.display();
    }
}