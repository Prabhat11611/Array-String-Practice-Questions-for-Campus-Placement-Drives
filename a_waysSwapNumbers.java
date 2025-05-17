public class a_waysSwapNumbers {
    public static void main(String[] args){
        int a=15;
        int b=20;

        // Method 1
        // int temp=a;
        // a=b;
        // b=temp;

        // Method 2
        // a=a+b;
        // b=a-b;
        // a=a-b;

        // Method 3
        // a=a*b;
        // b=a/b;
        // a=a/b;

        // Method 4
        // Bitwise XOR (^) Operator
        // a=a^b;
        // b=a^b;
        // a=a^b;

        // Method 5
        b=a+b-(a=b);
        System.out.println("The vlaue of A: " +a+ " and the value of B: " +b);
    }
}
