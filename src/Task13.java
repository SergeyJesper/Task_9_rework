import java.util.Scanner;
public class Task13 {
    public static void main (String [] arg) {

        Scanner xerox = new Scanner(System.in);
        String a;
        String b;
        System.out.println("Введите первое слово: ");
        a = xerox.nextLine(); //Ввод первого слова
        System.out.println("Введите второе слово: ");
        b = xerox.nextLine(); //Ввод второго слова
        int length = a.length(); //Считаем, сколько символов в первом введенном слове
        int len = b.length(); //Считаем, сколько символов во втором введенном слове
          if (length==len){ //Если значение длины первого слова равно значению длины второго
              System.out.println("Длины равны");
          }
          if (len>length){ //Если длина второго слова больше первого
              System.out.println(b);
          }
          if (length>len){ //Если длина первого слова больше второго
              System.out.println(a);
          }

    }
}
