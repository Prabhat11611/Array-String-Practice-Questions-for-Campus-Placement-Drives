import java.util.Random;
public class n_random_numbers_and_strings {
    public static void main(String[] args){
        // Method 1
        Random rand=new Random();
        int num=rand.nextInt(100);
        System.out.println(num);

        //  For Decimal
        double num1 = rand.nextInt();     // default range 0.0 to less than 1.0;
        System.out.println(num1);



        // Method-02
        System.out.println(Math.random());  // It will generate random decimal numbers.


        // Important
        // Method-03---Apache commons-lang API
        // Using this method Random Numbers and Random Strings both can be generated.
        // For this method we first need to download one file from "commons.apache.org/proper/commons-lang/download_lang.cgi".
        
        // String num=RandomStringUtils.randomNumeric(10); // It will generate (10) digit random number.
        // System.out.println(num);

        // String str=RandomStringUtils.randomAlphabetic(5);
        // System.out.println(str);
        
    }
}
