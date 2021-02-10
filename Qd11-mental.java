//代码清单 7-11
import java.util.Random;
import java.util.Scanner;

class mental{
    static Scanner sc = new Scanner(System.in);

    //确认是否继续
    static boolean confirmRetry() {
        int cont;

        do {
           System.out.println("再来一次？ <Yes ... 1 / No ... 0>: "); 
           cont = sc.nextInt();
        } while (cont != 0 & cont != 1);

        return cont == 1;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("心算能力测试：");

        do {
            int x = rand.nextInt(900) + 100; //三位数
            int y = rand.nextInt(900) + 100;
            int z = rand.nextInt(900) + 100;

            while (true) {
            System.out.print(x + " + " + y + " + " + z  + " = ");
            int asr = sc.nextInt(); //输入答案
            if (asr == x + y + z)   //是否正确
                break;
            System.out.println("回答错误。");
            }

        } while (confirmRetry());
    
    }
}