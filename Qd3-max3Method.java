//代码清单 7-3
import java.util.Scanner;

class max3Method {
    //返回a, b, c中的最大值
    static int max(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("整数a: "); int a = sc.nextInt();
        System.out.print("整数b: "); int b = sc.nextInt();
        System.out.print("整数c: "); int c = sc.nextInt();

        System.out.print("最大值是" + max(a, b, c) + "。");

        sc.close();
    }
}
