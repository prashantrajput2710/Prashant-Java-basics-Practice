import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter the number of columns for the pattern : ");
       int n = sc.nextInt();
       System.out.println("Enter the number of rows for the pattern : ");
       int m = sc.nextInt();

       System.out.println("Here is your pattern : ");
         
    // Pattern 1;

    //    //outer loop
    //    for( int i = 1; i<=n; i++){
    //     // inner loop
    //     for(int j = 1; j<=m; j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //    }

    // Pattern 2 (Hollow Rectangle);

        // OUTER LOOP
        // for (int i = 1; i<=n; i++){
        //     // INNER LOOP
        //     for(int j = 1; j<=m; j++){
        //         // (||) = or
                // if(i==1 || j==1 || i==n || j==m){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Pattern 3;
        //     for(int i = 1; i <=n ; i++){
        //         for(int j = 1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }   

        // Pattern 4;

        // for (int i=n; i>=1; i--){
        //     for (int j=i; j>=1; j--){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }

        // Pattern 5;

            // // outer loop
            // for(int i=1; i<=n; i++){
            //     // inner loop
            //     for(int j=1; j<=n-i; j++){
            //         System.out.print(".");
            //     }

            //     // 2nd inner loop

            //     for(int j=1; j<=i; j++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }

            // Pattern 6(Printing number);

                // for(int i=1; i<=n; i++){
                //     for(int j=1; j<=i; j++){
                //         System.out.print(j + " ");
                //     }
                //     System.out.println();
                // }

            // Pattern 7(inverted printing number)

                // for(int i= 1; i<=n; i++){
                //     for(int j = 1; j<=n-i+1; j++){
                //         System.out.print(j+" ");
                //     }
                //     System.out.println();
                // }
            // Pattern 8(Floyd triangle)
                
                // for(int i=1; i<=n; i++){
                //     for(int j=1; j<=i; j++){
                //         System.out.print(" "+ m);
                //         m++;
                //     }
                //     System.out.println();
                // }
            
                // Pattern 9(0 and 1)

                // for(int i=1; i<=n; i++){
                //     for (int j=1; j<=i; j++){
                //         int sum = i+j;
                //         if (sum%2 ==0){
                //             System.out.print("1 ");
                //         }else{
                //             System.out.print("0 ");
                //         }
                //     }
                //     System.out.println();
                // }
    }
}