import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        Double n1 = input.nextDouble();
        Double n2 = input.nextDouble();
        System.out.println("Choose an Operation : \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Power");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Addition of numbers = "+sum(n1,n2));
                break;
            case 2:
                System.out.println("Subtraction of numbers = "+sub(n1,n2));
                break;
            case 3:
                System.out.println("Multiplication of numbers = "+mul(n1,n2));
                break;
            case 4:
                System.out.println("Division of numbers = "+div(n1,n2));
                break;
            case 5:
                System.out.println("Power of number = "+ pow(n1,n2));
                break;
            default:
                System.out.println("Invalid Choice!");

        }


    }
    static Double sum(Double number1,Double number2){
        return number1 + number2;

    }
    static Double sub(Double number1,Double number2) {
        return number1 - number2;
    }
    static Double mul(Double number1,Double number2) {
        return number1 * number2;
    }
    static Double div(Double number1,Double number2) {
        return number1 / number2;
    }
    static Double pow(Double number1,Double number2) {
        return Math.pow(number1,number2);
    }

}
