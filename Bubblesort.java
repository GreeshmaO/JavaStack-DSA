import java.util.Arrays;

public class Bubblesort {
    static void Bubblesort(int array[]){
        int size=array.length;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
public static void main(String[] args) {
    int[] array={87,4,6,3,4,8};
    System.out.println("original Array:"+Arrays.toString(array));
    Bubblesort(array);
    System.out.println("Sorted array:"+Arrays.toString(array));
}    
}

