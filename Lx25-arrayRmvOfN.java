import java.util.Scanner;

//练习 7-25

class arrayRmovOfN {
    static int[] aryRmvOfN(int[] a, int idx, int n) {
        int[] t = new int[a.length - n];

        //数组前半段
        for (int i = 0; i < idx; i++)
            t[i] = a[i];

        //数组后半段
        for (int i = a.length - 1 - n; i >= idx; i--)
            t[i] = a[i + n];

        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入数组的长度：");
        int[] a = new int[sc.nextInt()];

        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = : ");
            a[i] = sc.nextInt();
        }

        System.out.print("删除位置是："); int idx = sc.nextInt();
        System.out.print("删除数量是："); int n   = sc.nextInt();
        int[] t = aryRmvOfN(a, idx, n);

        for (int i = 0; i < t.length; i++) 
            System.out.println("t[" + i + "] = : " + t[i]);

        sc.close();
    }
}