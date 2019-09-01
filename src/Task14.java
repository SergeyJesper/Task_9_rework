import java.util.Scanner;
public class Task14 {
    public static void main (String [] arg) {
        Scanner scan = new Scanner(System.in);
        String S; //Переменная строкового типа
        S = scan.nextLine(); //Ввод числа в строковом типе
        int X = Integer.parseInt(S); //Конвертация строки в интовый тип
        double Y = X; //Конвертация int в double
        System.out.println(Y);
    }
}
