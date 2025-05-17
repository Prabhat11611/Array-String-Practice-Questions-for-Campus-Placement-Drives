import java.util.Scanner;
public class m_count_prime_numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();

        int count=0;

        if(num>1){
            for(int i=1; i<=num; i++){
                if(num % i == 0)
                    count++;
            }
            // Now checking if the number of counts are only 2 or not.
            if(count==2){
                System.out.print("This is a Prime Number.");
            } else{
                System.out.print("This is not a Prime Number.");
            }
        }
        else{
            System.out.print("Not a Prime Number.");
        }
    }
}
