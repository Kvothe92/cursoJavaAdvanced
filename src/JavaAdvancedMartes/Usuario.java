
package JavaAdvancedMartes;

//Relacion entre clase: Agregacion HAS-A
public class Usuario {
     int id;
        String nombre;
        Direccion direccion;
        
        Usuario(int id, String nombre, Direccion direccion){
        this.id=id;
        this.nombre=nombre;
        this.direccion=direccion;
    }  

    void show(){
        System.out.println(id+" "+nombre);
        System.out.println(direccion.ciudad+" \n"+direccion.estado+" \n"+
                direccion.pais);
    }
    public static void main(String[] args) {
        Direccion dir = new Direccion("Culiacan", "Sinaloa", "Mexico");
        Direccion dir2 = new Direccion("Leon", "Guanajuato", "Mexico");

        Usuario u = new Usuario(111, "Brunon", dir);
        Usuario u2 = new Usuario(123, "Kat", dir2);

        u.show();
        u2.show();
    }
}
class Direccion{
    String ciudad;
    String estado;
    String pais;
    
    Direccion() {    
    }
    public Direccion(String ciudad, String estado, String pais) {
        this.ciudad = ciudad;
        this.estado = estado;
        this.pais = pais;
    }   
}
