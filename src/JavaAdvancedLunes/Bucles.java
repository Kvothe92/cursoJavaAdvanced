/*
Un lazo, es usado para iterar una parte del programa muchas veces.

Hay 3 tipos de lazos en java
Simple For
For-each
Label
*/
package JavaAdvancedLunes;

public class Bucles {
    //Simple for
    /*
    for(inicialization; condition; incr/decr){
    whatever}
    */
    public static void main(String[] args) {
        
        for(int i=1; i<=10; i++){
            System.out.println("Iterando el elemento " +i);
        }
        
        //for each
        /*
        La estructura for each para recorrer un arreglo o una coleccion en java.
        
        for(Type var: array)
        Whatever
        */
        int arreglo[]={10, 20, 30, 40, 50};
        for(int a: arreglo){
            System.out.println(a);
        }
        
        //for Labeled
        for(int i = 1;i<=3;i++){
            for(int j = 1;j<=3;j++){
                if(i==2 && j==2){
                    break;
                }
                System.out.println(i+ " " +j);
                
            }
        }
        /*
        
        */
        
    }
    
    
}
