import java.util.Scanner;

//练习 7-22

class arrayClone {
    static int[] aryClone(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++)
            b[i] = a[i];
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入数组长度：");
        int num = sc.nextInt();

        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i +"] = : ");
            a[i] = sc.nextInt();
        }

        int[] b = aryClone(a);

        // if (a == b) 
        //     System.out.println("正确"); //a == b 是判断 a 和 b 是否引用了相同的数组主体。

        for (int i = 0; i < b.length; i++)
            System.out.println("b[" + i + "] = : " + b[i]);

        sc.close();
    }
}