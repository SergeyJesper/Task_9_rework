import java.util.Scanner;

public class Arifm {
        public static void main(String[] args) {
            int x;
            int y;
            int z;
            System.out.print("Введите 3 числа: ");
            Scanner scan = new Scanner(System.in);
            x = scan.nextInt();
            y = scan.nextInt();
            z = scan.nextInt();
            int arifm_agr = (x + y + z)/3;
            int agrdel;
            System.out.println("Среднее арифметическое трёх чисел = " + arifm_agr);
            agrdel = (int) arifm_agr / 2;
            System.out.println("Деление среднего арифм = " + agrdel);
            if (agrdel > 3) {

                System.out.println("Программа выполнена корректно");
            }
        }
}
