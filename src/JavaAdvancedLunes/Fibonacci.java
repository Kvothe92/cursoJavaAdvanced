package JavaAdvancedLunes;

public class Fibonacci {
    public static void main(String[] args) {
        int i = 0, j = 1, c=10,k, a ;
        
            System.out.println(i+""+j);
        for (a=2;a<c;a++){
            k=i+j;
            System.out.println(""+k);
            i=j;
            j=k;
        }
    }
    
}


