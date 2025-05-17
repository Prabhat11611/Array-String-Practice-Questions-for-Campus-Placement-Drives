import java.util.*;
public class x_binary_search {
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6,7,8,9,10};

        /*
        int key=7;
        
        boolean flag=false;     // Right now it is false, which means it is representing that the element is not found.
        int l=0;    // lower bound
        int h=a.length-1;   // higher bound
        while(l<=h){
            int m=(l+h)/2;
            if(a[m]==key){
                System.out.println("Element Found.");
                flag=true;
                break;
            }

            if(a[m]<key){
                l=m+1;
            }

            if(a[m]>key){
                h=m-1;
            }
        }
        if(flag==false){
            System.out.println("Element not found.");
        }

         */



        //Approach 2 -> Using Built-in functions (Arrays.binarySearch()).
        System.out.println(Arrays.binarySearch(a,8));   // If element is found then it will return index number or else it will return Negative value.

    }
}
