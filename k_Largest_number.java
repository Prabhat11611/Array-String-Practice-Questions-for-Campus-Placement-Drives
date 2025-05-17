import java.util.Scanner;
public class k_Largest_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first Number: ");
        int a=sc.nextInt();
        System.out.println("Enter your Second Number: ");
        int b=sc.nextInt();
        System.out.println("Enter your Third Number: ");
        int c=sc.nextInt();
        
        // Method-01
        // if (a>b && a>c){
        //     System.out.print("First Number is greater.");
        // } else if (b>a && b>c){
        //     System.out.print("Second Number is greater.");
        // }else{
        //     System.out.print("Third Number is greater.");
        // }

        
        // Method-2a (Using Ternary Operator)
        // int largest1=a>b?a:b;
        // int largest2=c>largest1?c:largest1;
        
        // Method-2b
        int largest2=c>(a>b?a:b) ? c:(a>b?a:b);
        System.out.println("The largest Number is: "+largest2);
    }
}
