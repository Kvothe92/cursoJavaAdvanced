package JavaAdvancedMartes;
/*Constructor de una clase
    Es un conjunto de instrucciones diseñados para inicializar una instancia
    de una clase. En su declaracion o encabezado puede aceptar parametros.

Bike b = new Bike();
Bike() <--Hace referencia al constructor por omision.

Antes de su ejecucion, b es null; al final de la llamada "b" es un apuntador
a un objeto(referencia) con espacio reservado en RAM para contener sus valores
de atributos y sus apuntadores a metodos.

¿Porque el constructor no es un metodo?
No puedo llamar al constructor usando el metodo de indireccion.

Carece de un valor de retorno distinto a un apuntador.
No puede ser REDEFINIDO ()
No puede ser declarado como un type

*/
public class Bike {
    //Propiedades del objeto
    int velocidad;
    String color, marca;
    
    //Declaro el constructor implicito
    public Bike(){
        
    }
    //Inmutable cuando su valor no cambia durante la ejecucion del programa
    public Bike(String color,String marca, int velocidad){
        this.velocidad = velocidad;
        this.color = color;
        this.marca = marca;
    }
    
    public int getVelocidad() { return velocidad; }
    public String getColor() { return color; }
    public String getMarca(){ return marca; }
}
