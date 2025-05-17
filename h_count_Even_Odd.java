import java.util.Scanner;
public class h_count_Even_Odd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();

        int even_count=0;
        int odd_count=0;
        while(num>0){
            int last=num%10;
            if(last%2==0){
                even_count++;
            } else{
                odd_count++;
            }

            num=num/10;
        }
        System.out.println("Total even numbers are: "+even_count);
        System.out.print("Total odd numbers are: "+odd_count);
    }
}
