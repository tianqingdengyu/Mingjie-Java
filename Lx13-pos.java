import java.util.Scanner;

//练习 7-13

class position {
    //------将整数的第 x 位设为 1
    //设置媒介 1，1 => 0000 0000 0000 0000 0000 0000 0000 0001
    //将 1 移至 pos 位，如移到第 6 位，0000 0000 0010 0000 (省略了前面的 0)
    //通过逻辑或（有 1 则 1）运算赋值
    static int set(int x, int pos) {
        int t = 1 << pos;
        return x | t;
    }

    //------将整数的第 x 位设为 0
    //设置媒介 1，1 => 0000 0000 0000 0000 0000 0000 0000 0001
    //将 1 移至 pos 位，如移到第 6 位，0000 0000 0010 0000 (省略了前面的 0)
    //取反，t = 1111 1111 1101 1111 (省略了前面的 1)
    //通过逻辑与（全 1 为 1）运算赋值
    static int reset(int x, int pos) {
        int t = 1 << pos;
        t = ~t;
        return x & t;
    }

    //------将整数的第 x 位取反
    //------总之让 x 变值就是了
    static int inverse(int x, int pos) {
        if (set(x, pos) != x)
            return set(x, pos);
        else
            return reset(x, pos);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x = : ");
        int x = sc.nextInt();

        System.out.print("pos = : ");
        int pos = sc.nextInt();

        int a = set(x, pos);     System.out.println(a);
        int b = reset(x, pos);   System.out.println(b);
        int c = inverse(x, pos); System.out.println(c);

        sc.close();
    }
}