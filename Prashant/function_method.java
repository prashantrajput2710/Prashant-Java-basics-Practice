import java.util.Scanner;

public class function_method {
    // public static void print_my_name(String name){
    //     System.out.println(name);
    //     return;
    // public static int calculate_sum(int a, int b){
        // int  sum= a+b;
        // return sum;
    // public static int calculate_multiply(int a, int b){
        // int  Factorial= a*b;
        // return Factorial;
    public static void calculate_factorial(int a){
        if(a<0){
            System.out.println("Invalid number!");
            return;
        }
        int factorial = 1;
        for (int i=a; i>=1;i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is Your Number?");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print("Factorial of 2 number is : ");
        calculate_factorial(a);
    }
}
