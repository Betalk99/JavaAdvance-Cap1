// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        char a = '8';
        StringBuilder isTrue = new StringBuilder();
        isTrue.append("Il Caratattere è un numero : ").append(isNum(a));
        System.out.print(isTrue);
    }

    public static boolean isNum(char a){
        int num = Character.valueOf(a);
        System.out.println(num);
        boolean isaNum = false;

        if(num >= 48 && num <= 57){
            isaNum = true;
        } else {
            isaNum = false;
            throw new ArithmeticException("Carattere non valido");
        }
        return isaNum;
    }

}