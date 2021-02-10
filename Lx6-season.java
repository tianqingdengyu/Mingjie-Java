//练习 7-6
import java.util.Scanner;

class season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入月份：");
        int m = sc.nextInt();

        switch (m) {
            case 3, 4, 5 : System.out.print("春天");  break;
            case 6, 7, 8 : System.out.print("夏天");  break;
            case 9, 10, 11 : System.out.print("秋天");break;
            case 12, 1, 2 : System.out.print("冬天"); break;
            default : break; 
        }

        System.out.println();

        sc.close();
    }
}
