public class zc_count_occurrences_of_a_Character_in_String {
    public static void main(String[] args){
        String s="Java Programming Java OPPS";
        int total=s.length(); // Counting total length of the String.
        int removed_total=s.replace("a","").length();      // Replacing all the "a" characters from the String.
        int count=total-removed_total;
        System.out.println("Number of occurrences of a: "+count);
    }
}
