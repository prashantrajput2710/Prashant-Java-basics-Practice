
import java.util.Scanner;

public class conditonal_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Simple Calculator====");
        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Choose operation (1:Addition(+), 2:Subtraction(-), 3:Multiplication(*), 4:Division(/))");

        char operator = sc.next().charAt(0);
        double result;

        // If and Else conditonal_statement

        // if(age > 18){
        //     System.out.println("Person is Adult");
        // }
        // else{
        //     System.out.println("Person is teenager");
        // }


        // if(x % 2 == 0){
        //     System.out.println("Number is even");
        // }
        // else{
        //     System.out.println("Number is odd");
        // }


        // if(a == b){
        //     System.out.println("a is equal");
        // }else if(a > b){
        //         System.out.println("a is Greater");
        //     }
        //     else{
        //         System.out.println("a is lesser");
        //     }

        // if(Button == ){
        //     System.out.println("Bonjour");
        // }
        // else if(Button == 2){
        //     System.out.println("Namaste");
        // }
        // else if (Button == 3){
        //     System.out.println("Hello");
        // }
        // else{
        //     System.out.println("Namaste Karle bsdk");
        // }

        // Switch and Break conditonal_statement

        // switch(Button){
        //     case  : System.out.println("Namaste");
        //     break;
        //     case 2 : System.out.println("Bonjour");
        //     break;
        //     case 3 : System.out.println("Hello");
        //     break;
        //     default : System.out.println("Nameste Karle bsdk ");
        //     break;

           switch(operator){
            case '+' : 
                result = a + b;
                System.out.println("Addition is: " + result);
                break;
            case '-' : 
                result = a - b;
                System.out.println("Subtraction is: " + result);
                break;
            case '*' : 
                result = a * b;
                System.out.println("Multiplication is: " + result);
                break;
            case '/' : 
                if(b != 0){
                    result = a / b;
                    System.out.println("Division is: " + result);
                }
                else{
                    System.out.println("Error! Division by zero");
                }
                break;
            default : 
                System.out.println("Invalid operation selected");
                break;
                 
            


        }
    }
}
