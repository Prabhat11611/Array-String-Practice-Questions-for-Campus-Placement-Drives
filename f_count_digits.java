import java.util.Scanner;
public class f_count_digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();

        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.print("Total numbers present are: "+count);
    }
}
