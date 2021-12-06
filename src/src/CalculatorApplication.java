
import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Меню" + "\n" + "1.Сложение  2.Вычитание  3.Умножение 4.Деление" + "\n"
                    + "Введите 'End' для выхода");
            String EndFlag = scan.next();
            if (EndFlag.equals("End")) {
                break;
            }
            int MenuNumber = Integer.parseInt(EndFlag);
            if (MenuNumber > 4 || MenuNumber < 0) {
                continue;
            }
            System.out.println("Введите число");
            double a = scan.nextDouble();
            System.out.println("Введите число");
            double b = scan.nextDouble();

            if (MenuNumber == 1) {
                System.out.println("Результат: " + calculator.add(a, b));
            } else if (MenuNumber == 2) {
                System.out.println("Результат: " + calculator.subtract(a, b));
            } else if (MenuNumber == 3) {
                System.out.println("Результат: " + calculator.multiply(a, b));
            } else if (MenuNumber == 4) {
                try {
                    System.out.println("Результат: " + calculator.divide(a, b));
                } catch (DivisionByZeroException divisionByZeroException) {
                    System.out.println(DivisionByZeroException.Exception());
                }

            }

        }
    }
}
