//代码清单 7-7
import java.util.Scanner;

class stars {
    //连续显示 n个 "*" 字符
    static void star(int n) {
        while (n-- > 0)
            System.out.print("*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("显示直角在左下方的三角形。");
        System.out.print("层数：");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            star(i);
            System.out.println();   
        }
        
    sc.close();
    }
}
