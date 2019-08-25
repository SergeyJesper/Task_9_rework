import java.util.Scanner;
public class Constante {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double x = 0;
        double y = 10;
        double z = 30;
        double u = 55.5;

        try {
            System.out.print("Введите число для сравнения: ");
            x = in.nextDouble();
        }
        catch (java.util.InputMismatchException e){

            System.out.println("Ошибка");
        }
        //Data processing

        if (x == y)
            System.out.println("Данное значение имеется в константе X = " + y);
        else if (x == z)
            System.out.println("Данное значение имеется в константе Y = " + z);
        else if (x == u)
            System.out.println("Данное значение имеется в константе Z = " + u);
        else
            System.out.println("Такой константы нет!");
    }
}
