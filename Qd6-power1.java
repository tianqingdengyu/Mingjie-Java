//代码清单 7-6
import java.util.Scanner;

class power1 {
    static double power(double x, int n) {
        double tmp = 1.0;

        while (n-- > 0) //循环 n 次
            tmp *= x; //将 tmp 乘以 x
        return tmp;
    }   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("计算 a 的 b 次幂。");
        System.out.println("实数 a: "); double a = sc.nextDouble();
        System.out.println("实数 b: "); int b = sc.nextInt();

        System.out.println(a + "的" + b + "次幂为：" + power(a, b) + "。");

        sc.close();
    }
}
