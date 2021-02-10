import java.util.Scanner;

//练习 7-18

class aryRemove {
    static void aryRmv(int[] a, int idx) {
        while (idx < a.length - 1){
            a[idx] = a[idx + 1];
            idx++;
        }
        a[a.length - 1] = a[a.length - 2];
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

        System.out.print("请输入要移除的元素位数：");
        int n = sc.nextInt();
        aryRmv(a, n);

        for (int i = 0; i < num; i++)
            System.out.println("a[" + i + "] = :" + a[i] + "。");

        sc.close();
    }
}