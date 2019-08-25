import java.util.Scanner;
public class Table {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Введите число для перемножения ");
            int num = in.nextInt();

            int all = num;
            System.out.println(num + " * 1 = " + all);
            all = num * 2;
            System.out.println(num + " * 2 = " + all);
            all = num * 3;
            System.out.println(num + " * 3 = " + all);
            all = num * 4;
            System.out.println(num + " * 4 = " + all);
            all = num * 5;
            System.out.println(num + " * 5 = " + all);
            all = num * 6;
            System.out.println(num + " * 6 = " + all);
            all = num * 7;
            System.out.println(num + " * 7 = " + all);
            all = num * 8;
            System.out.println(num + " * 8 = " + all);
            all = num * 9;
            System.out.println(num + " * 9 = " + all);
            all = num * 10;
            System.out.println(num + " * 10 = " + all);
        }
}
