
import java.util.Scanner;

public class q_college_sum_of_element_in_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.print("Enter the elements of an Array: ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }

        // Finding Duplicates
        System.out.println();
        boolean flag=false;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("Dupliate Element found: "+arr[i]);
                    flag=true;
                }
            }
        }
        System.out.println();
        if(flag==false){
            System.out.print("Duplicate Elements not found.");
        }
    }
}
