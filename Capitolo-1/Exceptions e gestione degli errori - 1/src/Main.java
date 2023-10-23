// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    int x = 6;
    int max = 10;
    int min = 5;

    System.out.print(range(x, max, min));
    }
    public static boolean range(int x, int max, int min){
        if(!(x < max && x > min)){
            throw new ArithmeticException("not in range");
        }else {
            return true;
        }

    }

}