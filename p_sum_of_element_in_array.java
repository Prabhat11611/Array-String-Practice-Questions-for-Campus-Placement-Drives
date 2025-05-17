import java.util.Scanner;
public class p_sum_of_element_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings you want to input: ");
        int num = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        
        // Create array to store strings
        String[] strings = new String[num];
        
        // Input strings
        for(int i = 0; i < num; i++) {
            System.out.print("Enter string " + (i+1) + ": ");
            strings[i] = sc.nextLine();
        }
        
        // Print all strings
        System.out.println("\nThe strings you entered are:");
        for(int i = 0; i < strings.length; i++) {
            System.out.println((i+1) + ". " + strings[i]);
        }
    }
}







import java.util.Scanner;
public class p_sum_of_element_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int num = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        // Create array to store strings
        String[] strings = new String[num];
        
        // Input phase - store all strings
        for(int i = 0; i < num; i++) {
            System.out.print("Enter String " + (i+1) + ": ");
            strings[i] = sc.nextLine();
        }
        
        // Operation phase - process each string
        System.out.println("\nProcessing each string:");
        for(int i = 0; i < num; i++) {
            System.out.println("\nString " + (i+1) + ": " + strings[i]);
            
            // Your operations on strings[i] will go here
            // For example:
            // 1. You can access each character using strings[i].charAt(j)
            // 2. You can get string length using strings[i].length()
            // 3. You can compare characters, count matches, etc.
            
            /* Example structure for character operations:
            for(int j = 0; j < strings[i].length()-1; j++) {
                char currentChar = strings[i].charAt(j);
                char nextChar = strings[i].charAt(j+1);
                // Your comparison/matching logic here
            }
            */
        }
        
        sc.close();
    }
}