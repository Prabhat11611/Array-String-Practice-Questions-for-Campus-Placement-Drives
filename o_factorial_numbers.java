import java.util.Scanner;
public class o_factorial_numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();                               // 5!=5*4*3*2*1
                                                            //     OR
                                                            // 5!=1*2*3*4*5
        long factorial=1; // because sometimes the factorial can be a big number. So it might be possible that noramal int will not work with big integer value.



        
        // // Method-01 (for loop)
        // for(int i=1; i<=num; i++){
        //     factorial=factorial*i;      // factorial*i===> (1*1=1) (1*2=2) (2*3=6) (6*4=24)
        // }
        // //for(int i=num; i>=1; i--) // For multiplying in descending order. (1*5)(5*4)(20*3)(60*2)(120*1);
        // System.out.print("Factorial of "+num+" is "+factorial);


        // Method-02 (while loop)
        while(num!=0){
            factorial *= num;   // factorail=factorail*num;
            num--;
        }
        System.out.print("Factorial: "+factorial);
    }
}
