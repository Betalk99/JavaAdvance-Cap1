// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    int x = 6;

    System.out.print(range(x));
    }
    public static boolean range(int x){
        if(!(x < 10 && x >5)){
            throw new ArithmeticException("not in range");
        }else {
            return true;
        }

    }

}