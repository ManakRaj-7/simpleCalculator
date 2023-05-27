

import java.util.Scanner;

public class SimpleCalculator {
    public static void main (String[] args){
        System.out.println("_____Simple Calculator_____");

        System.out.println("Enter your first number");
        Scanner Sc = new Scanner(System.in);
        float num1 = Sc.nextFloat();
        System.out.println(num1);

        System.out.println("Enter your second number");
        float num2 = Sc.nextFloat();
        System.out.println(num2);


        System.out.println("FOR ADDITION,SUBTRACTION,MULTIPLICATION,DIVISION TYPE 0,1,2,3 RESPECTIVELY");
        float operation = Sc.nextFloat();


        float result;

        if (operation==0){
            System.out.println("The addition of two numbers is : ");
            System.out.println(num1+num2);
        }

        else if (operation==1){
            System.out.println("the subtraction of two numbers is : ");
            System.out.println(num1-num2);
        }

        else if (operation==2){
            System.out.println("the multiplication of two numbers is : ");
            System.out.println(num1*num2);
        }
        else if (operation==3){
            System.out.println("the multiplication of two numbers is : ");
            System.out.println(num1/num2);
        }

        else {
            System.out.println("invalid operation choose among0,1,2,3");

        }







    }
}
