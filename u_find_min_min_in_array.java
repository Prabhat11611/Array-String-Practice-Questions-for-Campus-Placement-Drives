import java.util.Scanner;
public class u_find_min_min_in_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.print("Enter the elements of an array: ");
        for(int i=0; i<num; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.print("Elements of an Array are: ");
        for(int i=0; i<num; i++){
            System.out.print(arr[i]+" ");
        }

        // Finding the maximum value.
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println();
        System.out.print("Maximum value is: "+max);


        // Finding the minimum value.
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println();
        System.out.print("Minimum Value is: "+min);
    }
}
