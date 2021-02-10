import java.util.Scanner;

//练习 7-19

class aryRemoveN {
    static void aryRmvN(int[] a, int idx, int n) {
        while (idx < a.length - n){ //注意 while 的花括号，执行两句时就要使用花括号。
            a[idx] = a[idx + n];
            idx++;
        }
    }
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入元素个数：");
        int num = sc.nextInt();

        //创建数组
        int[] a = new int[num];

        //填充数组
        for (int i = 0; i < num; i++)
            a[i] = sc.nextInt();

        System.out.print("请输入元素位数：");
        int idx = sc.nextInt();
        System.out.print("请输入移除的位数：");
        int n = sc.nextInt();
        aryRmvN(a, idx, n);

        for (int i = 0; i < num; i++)
            System.out.println("a[" + i + "] = :" + a[i] + "。");

        sc.close();
    }
}