import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {
        int[] Array={5,7,3,4,1,6,8};
        System.out.println("Original Array:"+Arrays.toString(Array));
        int n=Array.length-1;
        
        for(int i=0;i<n-1;i++){
            int minindex=i;
        for(int j=i+1;j<n;j++){
            if(Array[j]<Array[minindex])
                minindex=j;
            
        
    
    
        int temp=minindex;
        minindex=Array[i];
        Array[i]=temp;
        }
    }
         

    System.out.println("Sorted Array:"+Arrays.toString(Array));
        
    }
}
      
        

