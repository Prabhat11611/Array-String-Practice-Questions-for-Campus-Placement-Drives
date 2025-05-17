// In order to find missing number from an Array it should follow the following criteria:
// 1. Array should not have any duplicates.
// 2. Array do not need to be in sorted order.
// 3. There should be any particular range of the Values (Starting and Ending Values).

import java.util.Scanner;
public class t_find_missing_number_in_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.print("Enter the values of Array: ");
        for(int i=0; i<num; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("The values of the array are: ");
        for(int i=0; i<num; i++){
            System.out.print(arr[i]);
        }


        // Logic: [1,2,3,5]
        // 1+2+3+5=11 -> sum1
        // 1+2+3+4+5=15 -> sum2     complete addition of the range values.
        // sum=sum2-sum1 => missing value from the range.

        // finding sum1
        int sum1=0;
        for(int i=0; i<num; i++){
            sum1=sum1+arr[i];
        }
        System.out.println("Sum of elements of an Array: "+sum1);

        // finding sum2 (sum of range)
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i<num; i++){
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }
        int sum2=0; 
        for(int i=min; i<=max; i++){
            sum2=sum2+i;
        }
        System.out.println("Sum of elements within the range is: "+sum2);

        // finding the sum (missing value)
        int sum=sum2-sum1;
        System.out.println("Missing value of the Array is: "+sum);
    }
}

// Method-02
// Sum of numbers from 1 to the largest number
int n = arr.length + 1;  // One element is missing, so n should be one more than the array length
int expectedSum = n * (arr[0] + arr[arr.length - 1]) / 2;
// Sum of Airthematic Sequence is:      Sum= n*(First_Term + Last_Term)/2;

// For example
        // int arr[]={2,5,3,1,8,9,4,6};
        // Arrays.sort(arr);
        
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // int sum=0;
        // for(int i=0; i<arr.length; i++){
        //     sum=sum+arr[i];
        // }
        // System.out.println(sum);

        // // Expected Sum
        // // Sum of numbers from 1 to the largest number
        // int n = arr.length + 1;  // One element is missing, so n should be one more than the array length
        // int expectedSum = n * (arr[0] + arr[arr.length - 1]) / 2;
        
        // int result=expectedSum-sum;
        // System.out.println("Missing Value: "+result);

