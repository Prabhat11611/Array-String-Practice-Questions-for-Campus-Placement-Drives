import java.util.*;
public class b_ReverseNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to be reversed: ");
        int num=sc.nextInt();

        // Method 1
        // int rev=0;
        // while(num!=0){
        //     rev=rev*10 + num%10;        // 0+4=4        40+3=43     430+2=432   4320+1=4321
        //     num=num/10;                 // 1234/10=123  123/10=12   12/10=1     1/10=0
        // }


        // Method 2
        // Using StringBuffer Class
        // StringBuffer rev;   // This "rev" variable is StringBuffer Type
        // StringBuffer sb=new StringBuffer(String.valueOf(num));  // String.valueOf(num) ----> This will convert the Number Variable into String.
        // rev=sb.reverse();   // We have already defined the variable above and also we can directly define the value
        //         // So here we have 3 steps------> 1. Define Variable
        //         //                                2. Create Object and convert number into String
        //         //                                3. Call reverse function.


        // Method 3
        // Using StringBuilder Class
        StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        StringBuilder rev=sbl.reverse();

        System.out.println("Reverse Number is: "+rev);
    }
}



// Added this when I went to college from Home.
// for(; num!=0; ){
//     rev=rev*10 + num%10;
//     num=num/10;
// }