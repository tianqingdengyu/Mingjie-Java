//代码清单 7-4
import java.util.Scanner;

class max2Mehtod {
    //返回a, b中的较大值
    static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("第一个整数："); int a = sc.nextInt();
        System.out.print("第二个整数："); int b = sc.nextInt();

        System.out.println("较大的一个整数是： " + max(a, b) + "。");

        sc.close();
    }
}
