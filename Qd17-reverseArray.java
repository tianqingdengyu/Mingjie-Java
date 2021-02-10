import java.util.Scanner;

//代码清单 7-17

class reverseArray {
    // //交换数组中的元素
    // static void swap(int[] a, int idx1, int idx2){
    //     int t = a[idx1];
    //     a[idx1] = a[idx2];
    //     a[idx2] = t;
    // }

    // //对数组 a 中元素进行倒序排列
    // static void reverse(int[] a){
    //      for (int i = 0; i < a.length / 2; i++)
    //         swap(a, i, a.length - i - 1);
    //}

    static int[] reverse1 (int[] a) { //将方法类型设为数组，返回数组。
    int[] a1 = new int[a.length];

    for (int i = 0; i < a.length; i++)
        a1[i] = a[a.length - i -1];

    return a1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("元素个数：");
        int num = sc.nextInt();

        //创建元素个数数组
        int[] a = new int[num];

        //数组填充
        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "] = : ");
            a[i] = sc.nextInt();
        }

        //reverse(a);
        a = reverse1(a); //接收数组

        System.out.println("倒序排列完毕。");
        for (int i = 0; i < num; i++)
            System.out.println("a[" + i + "] = : " + a[i]); //打印数组

        sc.close();
    }
}