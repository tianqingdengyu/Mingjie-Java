import java.util.Scanner;

//代码清单 7-16

class linearSearch {
    static int lSearch(int[]a, int key) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == key)
                return i; //成功
            return -1;       //失败
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("元素个数：");
        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < x.length; i++) {
            System.out.print("x[" + i + "] = : ");
            x[i] = sc.nextInt();
        }

        System.out.print("需要查找的值是：");
        int ky = sc.nextInt();

        int idx = lSearch(x, ky);

        if(idx == -1)
            System.out.println("查无此值。");
        else
            System.out.println("该值是 x[" + idx + "]。");

        sc.close();
    }
}

//     对于 “传递给其他方法进行处理后就不再需要” 的使用完后被舍弃的数组，无需特意分配数组变量来引用改数组。
  
//     int k = 3;
//     int i = linearSearch(new int[]{1, k, k + 1, 3475}, 3);

//     m1(new String[] {"卢克","天行者"});