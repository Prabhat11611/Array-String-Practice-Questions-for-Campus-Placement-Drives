import java.util.Scanner;

public class d_palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int org_num = num;

        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        if (org_num == rev) {
            System.out.println("This is a Palindrome Number.");
        } else {
            System.out.println("This is not a Palindrome Number.");
        }
        System.out.print("The reversed number is: " + rev);
    }
}
