import java.util.Scanner;
public class j_sum_of_digits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();

        int sum=0;
        while(num>0){
            sum=sum + num%10; //1234%10=4
            num=num/10;
        }

        System.out.print("The sum of the number is: "+sum);
    }
}
