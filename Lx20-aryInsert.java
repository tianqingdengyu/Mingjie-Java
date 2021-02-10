import java.util.Scanner;

//练习 7-20

class aryInsert {
    //数组长度固定，插入以后原来的最后一个元素就被挤出去了。
    static void aryIns(int[]a, int idx, int x) {
        for (int i = a.length - 1; i > idx; i--)
            a[i] = a[i - 1];
            a[idx] = x;
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

        System.out.print("请输入要插入的位置："); int idx = sc.nextInt();
        System.out.print("请输入插入值：");       int x = sc.nextInt();
  
        aryIns(a, idx, x);

        for (int i = 0; i < num; i++)
            System.out.println("a[" + i + "] = :" + a[i] + "。");

        sc.close();
    }
}