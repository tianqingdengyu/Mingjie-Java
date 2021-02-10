//代码清单 7-1
import java.util.Scanner;

class maxHwaMethod {
    //返回a, b, c中的最大值
    static int max(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] height = new int[3]; //身高
        int[] weight = new int[3]; //体重
        int[] age    = new int[3]; //年龄

        for (int i = 0;i < 3;i++) { //读入
            System.out.print("[" + (i + 1) + "]");
            System.out.print("身高："); height[i] = sc.nextInt();
            System.out.print("体重："); weight[i] = sc.nextInt();
            System.out.print("年龄："); age[i]    = sc.nextInt();
        }
         
        int maxHeight = max(height[0], height[1], height[2]);
        int maxWeight = max(weight[0], weight[1], weight[2]);
        int maxAge    = max(age[0], age[1], age[2]);

        System.out.println("最大身高为：" + maxHeight + "。");
        System.out.println("最大体重为：" + maxWeight + "。");
        System.out.println("最大年龄为：" + maxAge + "。");

        sc.close();
    }
}
