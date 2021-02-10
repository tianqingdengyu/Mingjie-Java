import java.util.Random;
import java.util.Scanner;

//练习 7-10

class metal1 {
    static Scanner sc = new Scanner(System.in);
    static boolean confirmRetry() {
        int cont;

        do {
            System.out.println("再来一次? 1 = yes / 0 = no:");
            cont = sc.nextInt();
        } while (cont != 0 & cont != 1);

        return cont == 1;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("心算能力计算: ");

        do {
            int x = rand.nextInt(4);

            int a = rand.nextInt(900) + 100;
            int b = rand.nextInt(900) + 100; 
            int c = rand.nextInt(900) + 100;
            
            switch (x) {
                case 0:
                while (true) {
                System.out.print(a + " + " + b + " + " + c + " = ");
                int asr = sc.nextInt();
                if (asr == a + b + c)
                    break;
                System.out.println("回答错误。");
                } 
                    break;

                case 1:
                while (true) {
                System.out.print(a + " + " + b + " - " + c + " = ");
                int asr = sc.nextInt();
                if (asr == a + b - c)
                    break;
                System.out.println("回答错误。");
                } 
                    break;

                case 2:
                while (true) {
                System.out.print(a + " - " + b + " + " + c + " = ");
                int asr = sc.nextInt();
                if (asr == a - b + c)
                    break;
                System.out.println("回答错误。");
                }
                    break;

                case 3:
                while (true) {
                System.out.print(a + " - " + b + " - " + c + " = ");
                int asr = sc.nextInt();
                if (asr == a - b - c)
                    break;
                System.out.println("回答错误。");
                } 
                    break;

                default:
                    break;
            }
        } while (confirmRetry()); //在复制粘贴各个 case 时，没有修改原代码块，导致多了很多的 confirmRetry(), 这个错误花了很长时间才发现，以后要注意。
    }
}
