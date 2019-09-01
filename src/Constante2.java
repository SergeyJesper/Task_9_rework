import java.util.Scanner;
public class Constante2 {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int number = 0;
            int X = 10;
            int Y = 30;
            int Z = 60;
            System.out.print("Введите число в переменную number: ");
                number = in.nextInt();
            if (number == X)
                System.out.println("Данное значение имеется в константе X = " + X);
            if (number == Y)
                System.out.println("Данное значение имеется в константе Y = " + Y);
            if (number == Z)
                System.out.println("Данное значение имеется в константе Z = " + Z);
            else
                System.out.println("Такой константы нет!");
        }
    }
