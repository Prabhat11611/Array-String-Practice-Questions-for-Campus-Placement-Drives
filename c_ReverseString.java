public class c_ReverseString{
    public static void main(String[] args){
        String str="ABCD";
        String rev="";

        // Method 1 (Using + (String Concatenation) Operator)
        // int len=str.length();
        // for(int i=len-1; i>=0; i--){
        //     rev=rev+str.charAt(i);
        // }

        // Method 2 (Using Character Array)
        // char a[]=str.toCharArray();
        // int len=a.length;
        // for(int i=len-1; i>=0; i--){
        //     rev=rev+a[i];
        // }
        // System.out.println("Reversed string is: "+rev);


        // Method 3 (Using StringBuffer Class)
        StringBuffer sb=new StringBuffer(str);
        System.out.print(sb.reverse());
    }
}