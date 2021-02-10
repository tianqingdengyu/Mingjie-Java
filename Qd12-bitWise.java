import java.util.Scanner;

//代码清单 7-12

class bitWise {
    static void printBits(int x) {
        for (int i = 31; i >= 0; i--)
            System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入两个整数: ");
        System.out.print("a: "); int a = sc.nextInt();
        System.out.print("b: "); int b = sc.nextInt();

        System.out.print("a = ");       printBits(a);
        System.out.print("\nb = ");     printBits(b);
        System.out.print("\na & b = "); printBits(a & b);
        System.out.print("\na | b = "); printBits(a | b);
        System.out.print("\na ^ b = "); printBits(a ^ b);
        System.out.print("\n~a = ");    printBits(~a);
        System.out.print("\n~b  = ");   printBits(~b);

        sc.close();
    }
}

// 移位运算符
// x << y, 将 x 左移 y 位，空出的位用 0 填充。
// x >> y, 将 x 右移 y 位，空出的位用移动前的符号填充。
// x >>> y, 将 x 右移 y 位，空出的位用 0 填充。