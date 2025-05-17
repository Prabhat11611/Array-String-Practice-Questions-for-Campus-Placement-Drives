import java.util.Scanner;
public class zd_count_words_in_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();

        int count=1;
        for(int i=0; i<str.length()-1; i++){
            if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){     // It should find the space after the character and as soon as the space is found the next place should not be a space.
                count++;
            }
        }
        System.out.println("Number of words in a String is: "+count);
    }
}
