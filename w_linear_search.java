import java.util.Scanner;
public class w_linear_search {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the values of Array: ");
        for(int i=0; i<num; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.print("The Elements of an Array are: ");
        for(int i=0; i<num; i++){
            System.out.print(arr[i]+" ");
        }

        // Implementing Linear Search
        System.out.println();
        System.out.print("Enter the value to be searched from an Array: ");
        int search_ele=sc.nextInt();

        boolean flag=false;
        // for(int i=0; i<arr.length; i++){}       // Or
        for(int i=0; i<num; i++){
            // System.out.println(arr[i]);
            if(search_ele==arr[i]){
                System.out.print("Element is found at index "+i);
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Element not found.");
        }
    }
}
