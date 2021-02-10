import java.util.Scanner;

//练习 7-17

class linearSearch1 {
    static int lSearch1(int[]a, int key) {
    //将原数组倒序。
    int[] a1 = new int[a.length];
    for (int i = 0; i < a.length; i++)
        a1[i] = a[a.length - i - 1];

    //查找方法
    for (int i = 0; i < a.length; i++)
        if (a1[i] == key)
            return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("元素个数：");
        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < x.length; i++) {
            System.out.print("x[" + i + "] = : ");
            x[i] = sc.nextInt();
        }

        System.out.print("需要查找的值是：");
        int ky = sc.nextInt();

        int idx = lSearch1(x, ky);

        if (idx == -1)
            System.out.println("查无此值。");
        else
            System.out.println("该值是 a[" + Math.abs(idx - num + 1) + "]。"); //在结果处进行还原。

        sc.close();
    }
}