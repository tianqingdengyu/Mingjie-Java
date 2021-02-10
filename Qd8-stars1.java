//代码清单 7-8
import java.util.Scanner;

class stars1 {
    static void putChars(char c, int n) {
        while (n-- > 0)
            System.out.print(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("显示直角在右下方的三角形。");
        System.out.println("层数：");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
           putChars(' ', n - i);
           putChars('*', i);
           System.out.println();
        }

        sc.close();
    }
}
