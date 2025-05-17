import java.util.Scanner;
import java.util.Arrays;
public class s_check_eqality_of_arrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        // Entering and Printing the Values of 1st Array
        System.out.print("Enter the size of 1 Array: ");
        int num1=sc.nextInt();
        int arr[]=new int[num1];
        System.out.print("Enter the elements of 1st Array: ");
        for(int i=0; i<num1; i++){
            arr[i]=sc.nextInt();
        }
        // Printing
        System.out.print("Elements of 1st Array are: ");
        for(int i=0; i<num1; i++){
            System.out.print(arr[i]+" ");
        }

        // Entering and Printing the Values of 2nd Array
        System.out.println();
        System.out.print("Enter the size of 2nd Array: ");
        int num2=sc.nextInt();
        int arr2[]=new int[num2];
        System.out.print("Enter the elements of 2nd Array: ");
        for(int i=0; i<num2; i++){
            arr2[i]=sc.nextInt();
        }
        //Printing
        System.out.print("Elements of 2nd Array is/are: ");
        for(int i=0; i<num2; i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();




        // Comparing both of the Arrays

        // Method-01
        // // Arrays.equals(arr,arr2);     // This returns the value as a True of False.
        // boolean status=Arrays.equals(arr,arr2);
        // if(status==true){
        //     System.out.print("Both of the arrays are Equal.");
        // } else{
        //     System.out.print("Both of the Arrays are not Equal.");
        // }

        //Method-02
        boolean status=true;
        if(arr.length == arr2.length){
            // Compare rest of the Elements.
            for(int i=0; i<arr.length; i++){        // We can take the length of any array as both the array are of same length that's why they are in this loop.
                if(arr[i]!=arr2[i]){
                    status=false;
                }
            }
        } else{
            status=false;
        }

        //  if status is ture or false
        if(status==true){
            System.out.print("Both of the arrays are Equal.");
        } else{
            System.out.print("Both of the Arrays are not Equal.");
        }
    }
}
