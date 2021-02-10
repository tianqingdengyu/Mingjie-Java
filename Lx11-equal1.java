import java.util.Scanner;

//练习 7-11

class equal1 {
    static boolean equalBit(int x, int n) {

        //------使用了 Math.pow, 所以使用 double 类型
        double  x_bit   = x >> n;
        //------使用了 Math.floor，向下取整
        //------如果不向下取整，程序就会错误，具体原因并不清楚
        double  x_value = Math.floor(x / Math.pow(2, n));

        double  x_bit1   = x << n;
        double  x_value1 = x * Math.pow(2, n);
   
        if ((x_bit == x_value) && (x_bit1 == x_value1))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入整数：");    int x = sc.nextInt(); //基础整数
        System.out.print("请输入移位数：");  int n = sc.nextInt(); //幂

        if (equalBit(x, n))
            System.out.println("正确");
        else
            System.out.println("错误");

        sc.close();
    }
}