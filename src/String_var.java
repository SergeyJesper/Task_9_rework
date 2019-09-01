import java.util.Scanner;
public class String_var {
    public static void main (String [] arg) {

        String var;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите какое-нибудь слово: ");
        var = in.nextLine();
        System.out.print("Ваше слово: " + var);
    }
}
