import java.util.Scanner;

//练习 7-26

class arrayInsOf {
    static int[] aryInsOf(int[] a, int idx, int x) {
        int[] t = new int[a.length + 1];

        //数组前半段
        for (int i = 0; i < idx; i++)
            t[i] = a[i];

        //数组后半段
        for (int i = a.length; i > idx; i--)
            t[i] = a[i - 1];

        t[idx] = x;

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

        System.out.print("插入位置是："); int idx = sc.nextInt();
        System.out.print("插入值是："); int x   = sc.nextInt();
        int[] t = aryInsOf(a, idx, x);

        for (int i = 0; i < t.length; i++) 
            System.out.println("t[" + i + "] = : " + t[i]);

        sc.close();
    }
}