// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    int x = 6;

    range(x);
    }
    public static void range(int x){

        if(!(x < 10 && x >5)){
            throw new ArithmeticException("not in range");
        }else {
            System.out.print(true);
        }




    }

}