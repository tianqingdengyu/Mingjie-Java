import java.util.Scanner;

//清单 7-21

class Max {
    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int max(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x 的值是："); int x = sc.nextInt();
        System.out.print("y 的值是："); int y = sc.nextInt();
        System.out.print("z 的值是："); int z = sc.nextInt();

        System.out.println("x, y 中的最大值是：" + max(x, y) + "。");
        System.out.println("x, y，z 中的最大值是：" + max(x, y, z) + "。");

        sc.close();
    }
}

//签名: 方法名和形参的个数、类型的组合
//相同签名的方法不可以重载
//对同一个类中签名不同的方法，可以执行重载，赋予相同的名称