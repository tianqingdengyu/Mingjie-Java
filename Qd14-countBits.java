import java.util.Scanner;

//代码清单 7-14

class countBits {
    //显示 x 的位置构成
    static void printBits(int x) {
        for (int i = 31; i >= 0; i--)
            System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
    }

    //计算 int 型整数 x 中值为 1 的位数
    static int contBits(int x) {
        int bits = 0;
        while (x != 0) {
            if ((x & 1) == 1) bits++;
            x >>>= 1;
        }
        return bits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("整数：");
        int x = sc.nextInt();

        System.out.print("位构成 = ");
        printBits(x);
        System.out.println("\n值为 1 的位数 = " + contBits(x));

        sc.close();
    }
}
