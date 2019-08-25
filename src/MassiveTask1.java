import java.util.Scanner;
public class MassiveTask1 {
    public static void main (String [] arg){
        int con;
        int start = 0;
        int pr;
        boolean bul = true;
        while (bul) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите желаемый размер массива: ");
                start = in.nextInt();
                bul = !bul;
            }
            catch (java.util.InputMismatchException e) {
                System.out.println("Ошибка");
            }
        }
        int [] massive = new int[start];
        for (con = 0; con < start; con++) {
            bul = true;
            while (bul) {
                try {
                    Scanner in = new Scanner(System.in);
                    pr = con +1;
                    System.out.print("Введите " + pr + " элемент массива: ");
                    massive[con] = in.nextInt();
                    bul = !bul;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Ошибка");
                }
            }
        }
        System.out.println("Массив умножить на 2:");
        for (con = 0; con < start; con++) {
            System.out.print(" "+ massive [con] * 2 + " ");
        }
    }
}
