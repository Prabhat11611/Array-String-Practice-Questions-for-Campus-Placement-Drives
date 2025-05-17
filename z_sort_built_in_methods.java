
import java.util.Arrays;
import java.util.Collections;

public class z_sort_built_in_methods {
    public static void main(String[] args){
        int a[]={30,50,20,10,60};
        System.out.println("Array element before sorting: "+Arrays.toString(a));    // It will print all the array elements in the form of String.

        /* 
        // 1. Using parallelSort Method
        Arrays.parallelSort(a);
        System.out.println("Array elements after sorting: "+Arrays.toString(a));
        */

        /*
        // 2. Using sort method
        Arrays.sort(a);
        System.out.println("Array elements after sorting: "+Arrays.toString(a));
         */

        // 3. Reverse Descending Order
        Integer b[]={20,50,10,90,30};
        System.out.println("Array elements before sorting: "+Arrays.toString(b));
        Arrays.sort(b,Collections.reverseOrder());      // for collection.reverseOrder  Primitive datatypes are not supported, so for this we need use Derived type. i.e Integer.
        System.out.println("Array elements after sorting: "+Arrays.toString(b));
    }
}
