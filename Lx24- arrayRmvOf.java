import java.util.Scanner;

//练习 7-24

class arrayRmvOf {
    static int[] aryRmvOf(int[] a, int idx) {
        int[] t = new int[a.length - 1];

        //新数组前半段
        for (int i = 0; i < idx; i++)
            t[i] = a[i];

        //数组后半段
        for (int i = a.length - 2; i >= idx; i--) //这里如果使用 a.length 就要减去 2，因为数组 t 的长度是 a.length - 1
            t[i] = a[i + 1];

        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入数组的长度：");
        int[] a = new int[sc.nextInt()];

        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = : ");
            a[i] = sc.nextInt();
        }
        
        System.out.print("请输入要删去的元素位：");
        int idx = sc.nextInt();

        int[] t = aryRmvOf(a, idx);

        for (int i = 0; i < t.length; i++)
            System.out.println("t[" + i + "] = : " + t[i]);

        sc.close();
    }
}