import java.util.Scanner;
public class Task_12 {
    public static void main (String [] arg) {

        String a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите какое-нибудь словосочетание с пробелами: ");
        a = scan.nextLine();
        String b = a.replaceAll(" ", ""); //Метод заменяет введенные пробелы
        System.out.println("Ваше слово без пробелов: " + b);
    }
}
