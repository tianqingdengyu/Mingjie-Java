//练习 7-2
import java.util.Scanner;

class min3Method {
    //返回a, b, c中的最小值
    static int min(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("整数a: "); int a = sc.nextInt();
        System.out.print("整数b: "); int b = sc.nextInt();
        System.out.print("整数c: "); int c = sc.nextInt();

        System.out.print("最小值是" + min(a, b, c) + "。");

        sc.close();
    }
}
