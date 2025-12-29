import java.util.Scanner; 

//     public static int calculate_average(int a,int b,int c) {
//         int  Average= (a+b+c)/3.0;
//         return Average;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number for average : ");
//         int a = sc.nextInt();
//         System.out.println("Enter the second number for average : ");
//         int b = sc.nextInt();
//         System.out.println("Enter the second number for average : ");
//         int c = sc.nextInt();

//         int Average = calculate_average(a,b,c);
//         System.out.print("The average of a and b is : " + Average );
        
//     }

// }

// Q2 : Write a function to print the sum of all odd numbers from 1 to n.

// public class function_method2 {
//     public static int calculate_odd(int n){
//         if(n % 2 == 0){
//             System.out.print("Invalid number");
//             return 0;
//         }else{
//             int sum = 0;
//             for(int i=1; i<=n; i +=2){
//                 sum+=i;
//             }
//             return sum;            
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n = sc.nextInt();
//         int result = calculate_odd(n);
//         System.out.println("Sum of odd number is : "+ result);
//         }
// }

// Q3: Write a function which takes in 2 numbers and returns the greater of those two.

// public class function_method2 {
//     public static int greatest_number(int a, int b){
//             if(a>b){
//                 System.out.print("Number " + a + " is greatest");
//                 return a;
//             }
//                 else if(a == b){
//                     System.out.println("Both number are equal");
//                     return a;
//                 }
//                 else{ 
//                 System.out.println("Number "+b+" is greatest");               
//                 return b;
//             }            
//         }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter the second number : ");
//         int b = sc.nextInt();
//         int result = greatest_number(a , b);
//         System.out.println("The greatest number is : "+ result);
//         }
// }

// Q4 : Write a function that takes in the radius as input and return the    circumference of a circle.

// public class function_method2 {

//     public static double calculate_circumference(double r) {
//         double Circumference = 2 * 3.14 * r;
//         return Circumference;
//     }
//     public static double calculate_Area(double a) {
//         double Area = 3.14 * a*a;
//         return Area;
        
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the radius: ");
//         double r = sc.nextDouble();
        
//         double result = calculate_circumference(r);
//         System.out.println("The circumference of circle is: " +result); 

//         System.out.print("Enter the radius: ");
//         double a = sc.nextDouble();    
//         double result2 = calculate_Area(a);
//         System.out.println("The area of circle is: " + result2);
//     }
// }

// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

// public class function_method2{
//     public static void enter_name(String a){
//         return;
//     }
//     public static boolean  check_eligibility(int age){
//         return age>=18;
//         // if(age>=18){
//         //     System.out.print("You are Eligible for vote.");
            
//         // }else{System.out.print("Sorry! you are not eligible for vote .");
//         // }
//     }
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String a = sc.nextLine();
//         enter_name(a);
//         System.out.print("Enter your age : ");
//         int age = sc.nextInt();
//         if(check_eligibility(age)){
//             System.out.print("Yes "+a+" You are Eligible for vote.");
            
        // }else{System.out.print("Sorry! "+a+ " you are not eligible for   vote .");
//         }

//         check_eligibility(age);       
//     }
// }

// Write an infinite loop using do while condition.

// public class function_method2{
//     public static int do_while(int a){
//         int i = a;
//         do { 
//          System.out.println(i + " Hello there! ");
//          i++;   
//         } while(i >11);
//         return a; 
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a : ");
//         int a = sc.nextInt();
//         do_while(a);
//         System.out.print(a);
//     }
// }

// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

