import java.util.Scanner;
public class Calculator
{public static void main(String[]args){
    char operator;
    double first_num, second_num, result;
    //this program takes user inputs and performs basic calculator operations

    //user inputs first digit
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your first number");
     first_num = input.nextDouble();

    //user inputs operator
    System.out.println("Enter an operator: +, - ,*, /,%");
    operator= input.next ().charAt(0);
    //inputs second number
    System.out. println("Enter the second number");
    second_num = input.nextDouble();

    switch(operator){
        case'+':
            result = first_num + second_num;
            System.out.println(first_num + "+" +second_num+ "=" +result);
            break;

        case'-':
            result = first_num - second_num;
            System.out.println(first_num + "-" +second_num + "=" +result);
            break;

        case'/':
            result = first_num / second_num;
            System.out.println(first_num + "/" +second_num+ "=" +result);
            break;
        case'*':
            result = first_num * second_num;
            System.out.println(first_num + "*" +second_num+ "=" +result);
            break;
        case'%':
            result = first_num % second_num;
            System.out.println(first_num + "%" +second_num+ "=" +result);
            break;
        default:
            System.out.println("invalid operator"
            );


    }







}
}
