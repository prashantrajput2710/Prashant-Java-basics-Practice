import java.util.Scanner;

public class adv_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int m = sc.nextInt();

        // Pattern 1: Butterfly Pattern;

    //     first part

    //    for(int i=1; i<=n; i++){
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }

    //      for spaces

    //         int space = 2*(n-i);
    //         for(int j=1; j<=space;j++){
    //             System.out.print(" ");
    //         }
            
    //         for(int j=1; j<=n-i; j++){
    //                 System.out.print(" ");
    //            }

    //     2nd inner loop

    //         for(int j=1; j<=i; j++){
    //                 System.out.print("*");
    //             }
    //         System.out.println();
    //    }

    //     second part

    //    for(int i=n; i>=1; i--){
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }

    //     for spaces

    //         for(int j=1; j<=2*(n-i);j++){
    //             System.out.print(" ");
    //         }
            
    //         for(int j=1; j<=n-i; j++){
    //                 System.out.print(" ");
    //            }

    //         2nd inner loop

    //             for(int j=1; j<=i; j++){
    //                 System.out.print("*");
    //             }
    //         System.out.println();
    //    }

    // Pattern 2 (solid Rhombus);

    //    for (int i=1; i<=n; i++){
    //     for(int j=1; j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=n; j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //    } 

    //  Pattern 3(number triangle);
    
    //  for (int i=1; i<=n; i++){
    //     for(int j=1; j<=n-i;j++){
    //          System.out.print(" ");
    //     }
    //      for(int j=1; j<=i; j++){
    //          System.out.print(i+ " ");
    //      }
    //      System.out.println();
    //     }

    // Pattern 4( Palindromic Pattern);

        // for (int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i;j++){
        //         System.out.print(" ");
            // }
            // for(int j=1; j<=i; j++){
            //      System.out.print(j);
            //  }
        //     for(int j=i; j>=1; j--){
        //         System.out.print(j +" ");
        //     }
        //     for(int j=2; j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //  System.out.println();
        // }

        // if(i==1 || j==1 || i==n || j==m)

    // Pattern 5(Diamond);

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

        //  for spaces

            int space = 2*(n-i);
            for(int j=1; j<=space;j++){
                System.out.print(" ");
            }
            
            for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
               }

        // 2nd inner loop

            for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
            System.out.println();
       }

        // second part

       for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

        // for spaces

            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            
            for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
               }

            // 2nd inner loop

                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
            System.out.println();
       }


    }
}
