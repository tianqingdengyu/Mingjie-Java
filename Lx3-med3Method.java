//练习 7-3
import java.util.Scanner;

class med3Method {
    //返回a, b, c中的中间值
    static int med(int a, int b, int c) {
        if (a >= b) {
            //a >= b
            if (c >= a)
                return a;      //a >= b & c >= a ------ c >= a >= b
            else if (b >= c)    
                return b;      //a >= b & c < a & b >= c ------ a >= b >= c
            else
                return c;      //a >= b & c < a & b < c ------ a > c > b
        } else {
            //a < b
            if (a >= c)
                return a;      //a < b & a >= c ------ b > a >= c
            else if (b >= c)    
                return c;      //a < b & a < c & b >= c ------ b >= c > a
            else
                return b;      //a < b & a < c & b < c ------ c > b > a
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("整数a: "); int a = sc.nextInt();
        System.out.print("整数b: "); int b = sc.nextInt();
        System.out.print("整数c: "); int c = sc.nextInt();

        System.out.print("中间值是" + med(a, b, c) + "。");

        sc.close();
    }
}
