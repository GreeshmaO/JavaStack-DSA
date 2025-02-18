import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.Arrays;
public class Example {
    public static void main(String[] args) {
        int[] l1={3,5,1};
        int []l2={1,2,3};
        
        int[] sum = new int[l1.length];
        for(int i=0;i<l1.length;i++){
        sum[i]=l1[i]+l2[i];
        }       
        System.out.println(Arrays.toString(sum));
        
     
     

        
}