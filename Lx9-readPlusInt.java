import java.util.Scanner;

//练习 7-9

class readPlus {
    static Scanner sc = new Scanner(System.in);
    static int readPlusInt(int a) {
        
        while (true) {
            if (a <= 0) {
                System.out.println("请再次输入：");
                a = sc.nextInt();
            } else {
                break;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("请输入一个正整数");
        int a = sc.nextInt();

        System.out.println(readPlusInt(a));
        sc.close();
    }
}