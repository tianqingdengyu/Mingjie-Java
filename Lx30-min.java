import java.util.Scanner;

//练习 7-30

class min1 {
    static int min(int a, int b) {
        return a < b ? a : b;
    }

    static int min(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    static int min(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) 
            if (a[i] < a[0])
                min = a[i];
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x 的值是："); int x = sc.nextInt();
        System.out.print("y 的值是："); int y = sc.nextInt();
        System.out.print("z 的值是："); int z = sc.nextInt();

        int[] a = new int[]{x, y, z}; 

        System.out.println("x, y 中的最小值是：" + min(x, y) + "。");
        System.out.println("x, y，z 中的最小值是：" + min(x, y, z) + "。");
        System.out.println("数组 a 中的最小值是:" + min(a));

        sc.close();
    }
}