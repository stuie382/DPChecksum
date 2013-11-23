import java.util.Scanner;

public class Fletchers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] text = new String[N];

        for (int i = 0; i < N; i++) {
            text[i] = sc.nextLine();
        }

        for (int i = 0; i < N; i++)
            System.out.printf("%d %X\n", i + 1, fletcher16CheckSum(text[i]));
    }

    private static int fletcher16CheckSum(String str) {
        int sum1 = 0;
        int sum2 = 0;

        for (char ch : str.toCharArray()) {
            sum1 = (sum1 + ch) % 255;
            sum2 = (sum2 + sum1) % 255;
        }
        return sum1 + (sum2 * 256);
    }
}