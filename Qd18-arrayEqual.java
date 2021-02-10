import java.util.Scanner;

//代码清单 7-18

class arrayEqual {
    static boolean equals(int[] a, int[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
                return false;
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("数组 a 中的元素个数：");
        int na = sc.nextInt();

        int[] a = new int[na];

        for (int i = 0; i < na; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("数组 b 中的元素个数：");
        int nb = sc.nextInt();

        int[] b = new int[nb];

        for (int i = 0; i < nb; i++) {
            System.out.print("b[" + i + "] :");
            b[i] = sc.nextInt();
        }

        System.out.println("数组 a 和 b " + (equals(a, b) ? "相等。" : "不相等。"));

        sc.close();
    }
}