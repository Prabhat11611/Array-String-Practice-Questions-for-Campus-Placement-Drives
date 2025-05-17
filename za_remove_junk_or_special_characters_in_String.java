public class za_remove_junk_or_special_characters_in_String {
    public static void main(String[] args){
        String s="â€™ââ²â¼â½â¾â¿ÂÃÊ^ latin string 01234567890";
        String s1="@#$% testing *@@#!$ Selenium @#$#@ &&&& Java";
        // Using Regular Expression
        s=s.replaceAll("[^a-zA-Z0-9]","");     // This means ^(char) will remove other than a-z , A-z and numbers from 0-9, by a space (replacement).
        System.out.println(s);
        s1=s1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s1);
    }
}
