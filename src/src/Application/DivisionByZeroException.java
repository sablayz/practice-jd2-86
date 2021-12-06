package Application;

public class DivisionByZeroException extends Exception {
   public static String Exception(){
       throw new ArithmeticException("DivisionByZero");
   }
}
