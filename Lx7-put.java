//练习 7-7
import java.util.Scanner;

class put {
    static void putChar(char c, int n) {
        while(n-- > 0)
            System.out.print(c); //连续显示 n 个字符
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入层数：");
        int n = sc.nextInt();

        //显示三角形
        for (int i = 1; i <= n; i++) {
            putChar('*', i);
            System.out.println();
        }

        sc.close();
    }
}
