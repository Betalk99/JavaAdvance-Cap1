// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Valore: " + i);
            System.out.println(checkValue(i));
        }
    }

    public static String checkValue(int value) {
//        String result = "";
//
//        if (value % 5 == 0) {
//            result = "FizzBuzz";
//        } else  {
//            result = "Buzz";
//        }

        final String result = value % 5 == 0 ? "FizzBuzz" : "Buzz";

        return result;
    }

}