import java.util.Scanner;
public class r_print_even_and_odd_from_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the elements of an Array: ");
        for(int i=0; i<num; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements present in an Array are: ");
        for(int i=0; i<num; i++){
            System.out.print(" "+arr[i]+" ");
        }

        // Print Even and Odd numbers in an array
        System.out.println();
        System.out.print("Even number present in this array is/are: ");
        // for(int i=0; i<num; i++){
        //     if(arr[i]%2==0){
        //         System.out.print(" "+arr[i]+" ");
        //     }
        // }

        // Enhanced Loop
        for(int v:arr){         //  for(any_varaible_name: array_name){ condition/statement };    // Generally variable_name = 'value' is preferred.
            if(v%2==0){
                System.out.print(v+" ");
            }
        }



        System.out.println();
        System.out.print("Odd numbers present in this array is/are: ");
        // for(int i=0; i<num; i++){
        //     if(arr[i]%2!=0){
        //         System.out.print(" "+arr[i]+" ");
        //     }
        // }

        // Enhanced Loop
        for(int a:arr){
            if(a%2!=0){
                System.out.print(a+" ");
            }
        }
    }
}
