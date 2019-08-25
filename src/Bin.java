import java.util.Scanner;
public class Bin {
    static int bite, out_dec = 0;
    public static void main(String[] args) {
        int main_bin_Input;
        System.out.print("Введите число в двоичном формате: ");
        Scanner scan = new Scanner(System.in);
        main_bin_Input = scan.nextInt();
        System.out.println("Число в десятичном формате: " + function(main_bin_Input, 0));
    }
    public static int function(int bin_in, int inp_sum) {
        if (bin_in > 0) {
            bite = bin_in&1;
            bin_in = bin_in / 10;
            out_dec = out_dec + (bite << inp_sum);

            return function(bin_in, ++inp_sum);
        }
        return out_dec;
    }
}
