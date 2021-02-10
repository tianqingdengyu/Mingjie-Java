//代码清单 7-2
import java.util.Scanner;

class maxHwa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] height = new int[3]; //身高
        int[] weight = new int[3]; //体重
        int[] age    = new int[3]; //年龄

        for(int i = 0;i < 3;i++){ //读入
            System.out.print("[" + (i + 1) + "]");
            System.out.print("身高："); height[i] = sc.nextInt();
            System.out.print("体重："); weight[i] = sc.nextInt();
            System.out.print("年龄："); age[i]    = sc.nextInt();
        }

        //计算最大身高
        int maxHeight = height[0];
        if(height[1] > maxHeight) maxHeight = height[1];
        if(height[2] > maxHeight) maxHeight = height[2];

        //计算最大体重
        int maxWeight = weight[0];
        if(weight[1] > maxWeight) maxWeight = weight[1];
        if(weight[2] > maxWeight) maxWeight = weight[2];

        //计算最大年龄
        int maxAge = age[0];
        if(age[1] > maxAge) maxAge = age[1];
        if(age[2] > maxAge) maxAge = age[2];

        System.out.println("最大身高为：" + maxHeight + "。");
        System.out.println("最大体重为：" + maxWeight + "。");
        System.out.println("最大年龄为：" + maxAge + "。");

        sc.close();
    }
}

