import java.util.Arrays;
public class y_bubble_sort {
    public static void main(String[] arg){
        int a[]={4,2,1,5,3};
        System.out.println("Array before sorting: "+ Arrays.toString(a));   // (Arrays.toString(array_name)) -> To get all the elements in the form of List.
        
        int n=a.length;
        for(int i=0; i<n-1; i++){       // n-> no.of passes which should be n-1 passes. // Outer loop for no. of Passes.
            for(int j=0; j<n-1; j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }               // For each iteration of outer loop, the inner loop will run n-1 times.
            }
        }
        System.out.println("Array after sorting: "+Arrays.toString(a));
    }
}
