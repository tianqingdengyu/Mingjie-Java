//代码清单 7-9
import java.util.Scanner;

class square {
    //连续显示 n 个字符
    static void putChars(char c, int n) {
        while (n-- > 0)
            System.out.print(c);
    }

    static void putSquare(int n) {
        //正方形
        for (int i = 1; i <= n; i++) {
            putChars('+', n);
        System.out.println();
        }
    }

    static void putRec(int h, int w) {
        //矩形
        for(int i = 1; i <= h; i++) {
            putChars('*', w);
        System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("显示正方形。");
        System.out.println("边长："); int n = sc.nextInt();
        putSquare(n);

        System.out.println("显示矩形。"); 
        System.out.println("宽："); int h = sc.nextInt();
        System.out.println("长："); int w = sc.nextInt();
        putRec(h, w);
        
        sc.close();
    }
}
