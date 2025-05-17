import java.util.Scanner;
public class i_count_Vowels_Cosone {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        str=str.toLowerCase();

        int len=str.length();

        int vo_count=0;
        int cons_count=0;

        for(int i=0; i<len; i++){
            char ch = str.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vo_count++;
            } else if(ch>='a' && ch<='z'){
                cons_count++;
            }
        }
        System.out.println("Total Vowels: "+vo_count);
        System.out.print("Total Consonents: "+cons_count);
    }
}