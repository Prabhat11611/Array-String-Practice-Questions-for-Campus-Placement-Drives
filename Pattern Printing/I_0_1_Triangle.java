//  1
//  0 1
//  1 0 1
//  0 1 0 1
//  1 0 1 0 1

public class I_0_1_Triangle {
    public static void main(String[] args){
        int n=5;
        int number=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
            // This pattern is not printing the expected values.
                // System.out.print(number);
                // if(number==0){
                //     number=1;
                // } else if(number==1){
                //     number=0;
                // }

                if((i+j)%2==0){     // sum of i+j is even
                    System.out.print("1 ");
                } else{             // sum of i+j is odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
