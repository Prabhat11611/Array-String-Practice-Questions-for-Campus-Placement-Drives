
import java.util.HashSet;
import java.util.Scanner;

public class v_duplicate_in_array {

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the size of an Array: ");
        // int num=sc.nextInt();
        // String arr[]=new String[num];
        // System.out.print("Enter the elements of an Array: ");
        // for(int i=0; i<num; i++){
        //     arr[i]=sc.nextLine();
        // }
        // System.out.println();
        // System.out.print("Elements of an Array are: ");
        // for(int i=0; i<num; i++){
        //     System.out.print(arr[i]+" ");
        // }

        // Method=01
        // System.out.println();
        // boolean flag=false;
        // for(int i=0; i<arr.length; i++){                // i is pointing to 1st element of an Array.
        //     for(int j=i+1; j<arr.length; j++){          // j is pointing to the 2nd element of an Array. 
        //         if(arr[i].equals(arr[j])){
        //             System.out.println("Duplicate Element Found: "+arr[i]);
        //             flag=true;
        //         }
        //     }
        // }
        // if(flag==false){
        //     System.out.println();
        //     System.out.println("Duplicate Elements not found.");
        // }
        // Method-02 (Using HashSet)
        HashSet<String> langs = new HashSet();        // HashSet do not allow to add duplicate values. It contains only the unique values.
        // System.out.println(langs.add("Java"));      // True
        // System.out.println(langs.add("Python"));    // True
        // System.out.println(langs.add("Java"));      // False

        String arr[] = {"java", "C", "C++", "Python", "java2"};
        boolean flag = false;
        for (String l : arr) {      // Adding array values to the 'l' variable.
            //langs.add(l);       // langs is HashSet type variable, adding 'l' to 'langs' variable.
            //System.out.println(langs.add(l));   // langs is a HashSet variable which should not allow duplicates in it. So, if duplicates are tried to add in it then it will return 'false' as an output.
            if (langs.add(l) == false) {
                System.out.println("Duplicate Element found: " + l);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Not found Duplicates.");
        }
    }
}
