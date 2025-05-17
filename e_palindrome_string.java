import java.util.Scanner;
public class e_palindrome_string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String st=sc.nextLine();

        // Method-01
        // StringBuilder sb=new StringBuilder(st);
        // String rev=sb.reverse().toString();

        // if(st.equals(rev)){
        //     System.out.println("This is a Palindrome String.");
        // } else{
        //     System.out.println("This is not a Palindrome String.");
        // }

        // Method-02
        String org_st=st;

        String rev="";
        int len=st.length();
        for(int i=len-1; i>=0; i--){
            rev=rev+st.charAt(i);
        }

        if(org_st.equals(rev)){
            System.out.print("This is a Palindrome String.");
        } else{
            System.out.println("This is not a Palindrome String.");
        }

        System.out.println("The reversed String is: "+rev);
    }
}
