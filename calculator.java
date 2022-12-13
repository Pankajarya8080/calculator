import java.util.Scanner;

import javax.management.InvalidAttributeValueException;
public class calculator {

    public static void main(String[] args) {
        char operator;
        Double num1, num2, num3, num4, num5, result;
        Scanner s = new Scanner(System.in);
    System.out.println("choose operator: +.-,*./,%");
    operator = s.next().charAt(0);
    
        System.out.println("Enter First number");
        num1 = s.nextDouble();

        System.out.println("Enter scond number");
        num2 = s.nextDouble();
        switch (operator)
        {
        case '+' :
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result); 
        case '-' :
        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result); 
        break;
        case '*' :
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result); 
        break ;
        case '/' :
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result); 
        break ; 
        
        case '%' :
        result = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + result); 
        break ;
        default :
        System.out.println("Wrong input");  
        break;
    }
      s.close();
    }
}
