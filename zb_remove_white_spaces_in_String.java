public class zb_remove_white_spaces_in_String {
    public static void main(String[] args){
        String str="Java       programming  selenium    automation";
        // Here, Regular Expression for this will be: "\\s".
        str=str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
