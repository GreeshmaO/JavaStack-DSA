

public class DataStructure {
    public static void main(String[] args) {
       int[] Array={4,5,6,7,8};
      System.out.println(Array.length);
      System.out.println("Original Array:");
       for(int i=0;i<Array.length;i++){
        System.out.println(Array[i]);
       }
       Array[4]=10;
       System.out.println(Array[4]);
       System.out.println("Array after Modification:");
       for(int i=0;i<Array.length;i++){
        System.out.println(Array[i]);
       }
       //Deletion
       int n=Array[2];
       int[] newArray = new int[Array.length-1];
       for(int i=0,j=0;i<Array.length-1;i++){
        Array[i]=Array[i+1];

        }

        System.out.println("Array after Deletion:"+newArray);
    
        
       }
        }
    

