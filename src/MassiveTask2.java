import java.util.Arrays;
import java.util.Scanner;
public class MassiveTask2 {
    public static void main(String[] args) {
        int MAXVALUE = 70;
        int sum = 0;
        int count = 0;
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        a = in.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        b = in.nextInt();
        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
                if (arr[i][j] > MAXVALUE) {
                    sum += arr[i][j];
                    count++;
                }
            }

        }
        System.out.println("Массив умножить на 3:");
        for (int x = 0; x < b; x++) {
            for (int y = 0; y < a; y++)
             System.out.print(" " + arr [x][y]* 3 + " ");
        }
    }
}