public class L_fibonacci_series {
    public static void main(String[] args){

        // 0 1    1 2 3 5 8 13 21 34 (fibonacci series till 10)

        int n1=0, n2=1, sum=0;          // directly initalized first 2 numbers i.e 0 and 1 to n1 and n2 respectively.
        System.out.print(n1+" "+n2);

        for(int i=2; i<10; i++){        // i value is starting from 2 because we have already printed first 2 numbers.
            sum=n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }



        // int n=10, n1=0, n2=1, sum=0;
        // for(int i=0; i<n; i++){
        //     System.out.print(n1+" ");
        //     sum=n1+n2;
        //     n1=n2;
        //     n2=sum;
        // }
    }
}
