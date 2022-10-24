package dz_proval;

import java.util.Scanner;
import java.util.logging.Logger;
public class ex4 {
        public static float calc(Float num1, Float num2, char operation){
            float result;
            switch (operation){
                case '+':
                    result = num1+num2;
                    break;
                case '-':
                    result = num1-num2;
                    break;
                case '*':
                    result = num1*num2;
                    break;
                case '/':
                    result = num1/num2;
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
                    result = calc(num1, num2, operation);//рекурсия
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Введите первое целое чисдо (num1): ");
            float num1 = iScanner.nextFloat();
            System.out.printf("Введите второе целое число (num2): ");
            float num2 = iScanner.nextFloat();
            System.out.printf("Введите операцию, которую хотите произвести (operation = +, -, *, /): ");
            Scanner op = new Scanner(System.in);
            char operation = op.next().charAt(0);
            Logger logger = Logger.getAnonymousLogger();
            logger.info(String.valueOf(calc(num1, num2, operation)));
        }
    }

