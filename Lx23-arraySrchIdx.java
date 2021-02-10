import java.util.Scanner;

//练习 7-23

class arraySrchIdx {
    static int[] arySrchIdx(int[] a, int x) {

    int j = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] == x) 
            j++;
    }

    int[] asr = new int[j];

    int idx = 0; //变量的位置很重要，前几次实现错误，就是因为将变量写在了循环内
    for (int i = 0; i < a.length; i++) {
        if (a[i] == x) {
            asr[idx++] = i;
        }
    }
    return asr;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入数组长度：");
        int[] a = new int[sc.nextInt()];

        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = : ");
            a[i] = sc.nextInt();
        }

        System.out.print("需要查找的数值是：");
        int x = sc.nextInt();

        int[] asr = arySrchIdx(a, x);

        for (int i = 0; i < asr.length; i++)
            System.out.println("asr[" + i + "] = " + asr[i]);

        sc.close();
    }
} 

    
