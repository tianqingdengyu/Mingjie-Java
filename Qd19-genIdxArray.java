import java.util.Scanner;

//清单 7-19

class genIdxArray{
    static int[] idxArray(int n) {
        int[] a = new int[n];

        for (int i= 0; i < n; i++)
            a[i] = i;
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("元素个数：");
        int n = sc.nextInt();
        int[] x = idxArray(n);

        for (int i = 0; i < n; i++)
            System.out.println("x[" + i + "] = " + x[i]);

        sc.close();
    }
}

//方法可以返回数组的引用