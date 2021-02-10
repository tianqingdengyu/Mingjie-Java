import java.util.Scanner;

//清单 7-15

class maxOfHW {
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("人数：");
        int people = sc.nextInt();

        int[] height = new int[people]; //根据人数创建身高数组
        int[] weight = new int[people]; //根据人数创建体重数组

        System.out.println("请输入" + people + "人的身高以及体重");

        for (int i = 0; i < people; i++) {
            System.out.print((i + 1) + "号的身高：");
            height[i] = sc.nextInt();

            System.out.print((i + 1) + "号的体重：");
            weight[i] = sc.nextInt();
        }

        System.out.println("最高为：" + maxOf(height) + "cm");
        System.out.println("最重为：" + maxOf(weight) + "kg");

        sc.close();
    }
}