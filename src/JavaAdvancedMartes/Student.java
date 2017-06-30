
package JavaAdvancedMartes;
/*
    ---->THIS<---
    Es una variable de autoreferencia.
    This tiene 6 usos en java
        1-This se usa para referir la variable de la instancia de la clase actual.
        2-This para invocar el metodo de una clase actual.
        3-This() para invocar al constructor de una clase (actual)
        4-This puede ser pasado como argumento en la llamada a un metodo.
        5-This puede ser pasado como argumento en la llamada al constructor.
        6-This se puede utilizar para devolver la instancia de la clase actual
        del metodo.
*/

public class Student {
    int matricula;
    String nombre;
    String Universidad;

    //Caso #6
    public Student(){
        
    }
    Student getStudent (){
        return this;
    }
    
    void msg (){
        System.out.println("Soy un mensaje");
    }
    //Caso #5
    PruebaEstudiante obj;
    
    public Student(PruebaEstudiante obj){
        this.obj = obj;
    }
    
    void s (){
        System.out.println(obj.dato);
    }
    
    //public Student(){
    //    System.out.println("Soy el constructor por default");
    //}
    //THIS caso #3
    public Student(int matricula, String nombre, String Universidad, 
             int a){
        //this();
        this(matricula, nombre, Universidad);
        System.out.println(matricula + nombre + Universidad + a);
    }
    
    public Student(int matricula, String nombre, String Universidad) {
        //THIS caso #1
        this.matricula = matricula;
        this.nombre = nombre;
        this.Universidad = Universidad;
    }
    void display(){
        String msg = "La matricula es: "+matricula;
        msg+="\n El nombre es: "+ nombre;
        msg+="\n La unnivercidad es: "+Universidad;
        System.out.println(msg);
    }
    //Caso #2
    void mensaje(){
        System.out.println("Soy un mensaje alternativo");
        this.display();
    }
}

