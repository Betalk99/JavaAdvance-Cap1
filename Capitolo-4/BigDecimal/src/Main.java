import java.math.BigDecimal;

public class Main {
    public enum Operatore{
        Addizione,
        Sottrazione,
        Moltiplicazione,
        Divisione,
        Min,
        Max
    }

    public static void main(String[] args) {

        BigDecimal num1 = BigDecimal.valueOf(5);
        BigDecimal num2 = BigDecimal.valueOf(1);
        Operatore op = Operatore.Divisione;

        BigDecimal result = performOperation(num1, num2, op);

        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
        System.out.println("Operazione: " + op);
        System.out.println("Risultato: " + result);
    }
    public static BigDecimal performOperation(BigDecimal num1, BigDecimal num2, Operatore op) {
        BigDecimal result = BigDecimal.ZERO;

        switch (op) {
            case Addizione:
                result = num1.add(num2);
                break;
            case Sottrazione:
                result = num1.subtract(num2);
                break;
            case Moltiplicazione:
                result = num1.multiply(num2);
                break;
            case Divisione:
                if (num2.compareTo(BigDecimal.ZERO) != 0) {
                    result = num1.divide(num2, 2, BigDecimal.ROUND_HALF_UP);
                } else {
                    System.out.println("Errore: divisione per zero.");
                }
                break;
            case Min:
                result = num1.min(num2);
                break;
            case Max:
                result = num1.max(num2);
                break;
        }

        return result;
    }

}