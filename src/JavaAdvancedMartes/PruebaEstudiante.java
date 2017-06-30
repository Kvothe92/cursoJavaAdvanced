package JavaAdvancedMartes;

public class PruebaEstudiante {
    //caso #5
    int dato = 5;

    public PruebaEstudiante() {
        Student s5 = new Student(this);
        s5.s();
    }
    
    
    
    public static void main(String[] args) {
        Student s1 = new Student(111, "Rikimaru", "UAS");
        Student s2 = new Student(112, "Maria", "TEC");
        Student s3 = new Student(113, "Robert", "GOT");
        
        Student s4 = new Student(123, "Nilo", "UNAM", 10);
        
        s1.mensaje();
        s2.mensaje();
        s3.mensaje();
        s4.mensaje();
    
        //Caso #4
        PruebaEstudiante ps1 = new PruebaEstudiante();
        ps1.despliega();
    
        //Caso #5
        PruebaEstudiante ps2 = new PruebaEstudiante();
        
        //Caso #6
        new Student().getStudent().msg();
    }
    
    void muestra(PruebaEstudiante obj){
        System.out.println("Metodo es invocado");
    }
    //Caso #4
    void despliega(){
        muestra(this);
    }
    
}
