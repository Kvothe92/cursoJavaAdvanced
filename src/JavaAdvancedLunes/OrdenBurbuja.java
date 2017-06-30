package JavaAdvancedLunes;

public class OrdenBurbuja {
    int n = arr.length;
    int temp = 0;
    int i;
    
    //recorre el arreglo
    for (i=0; i<n; i++){
    for (int j=1;j<arr[n-i];j++){
        if (arr[j-1] >arr[j]){
            temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
        }
    }
}
}
public static void main(String[] args) {
int arr[] ={18,9,33,4,84};

System.out.println("Arreglo antes de ordenar");
for (int i=0; i<arr.length; i++){
System.out.println(arr[i]+"");
}
System.out.println("");

OrdenBurbuja(arr);

System.out.println("Arreglo ordenado");
for(int i=0; i<arr.length; i++){
System.out.println(arr[i]+"");
}
}
