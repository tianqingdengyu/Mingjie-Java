//代码清单 7-5
import java.util.Scanner;

class power {
    //返回 x 的 n 次幂
    static double power1(double x, int n) {
        double tmp = 1.0;

        for (int i = 0; i < n; i++) //原写法：for(int i = 1; i <= n; i++)
            tmp *= x; //将 tmp 乘以 x
        return tmp;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("计算 a 的 b 次幂。");
        System.out.println("实数 a: "); double a = sc.nextDouble();
        System.out.println("实数 b: "); int b = sc.nextInt();

        System.out.println(a + "的" + b + "次幂为：" + power1(a, b) + "。");

        sc.close();
    }
}
