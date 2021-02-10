//练习 7-4
import java.util.Scanner;

class power2 {
    static int sumUp(int n) {
        //int tmp = 0;
        // for(int i = 1; i <= n; i++)
        //     tmp = tmp + i; //从 1加到本身 n
        // return tmp;

        // int tmp =0;
        // int i = 1;
        // while(i <= n){
        //     tmp = tmp + i;
        //     i++;
        // }
        // return tmp;


        // int  tmp = 0;
        // while(n > 0){
        //     tmp = tmp + n;
        //     n--;
        // }
        // return tmp;    
        
        //上述三个是正确的。

        //这是我最开始的错误写法，进入循环内已经自减，即没有加上 n 这个数
        int tmp = 0; 
        while (n-- > 0) {
            tmp = tmp + n;
        }       
        return tmp;
}            


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入 n 的值：");
        int n = sc.nextInt();
        System.out.println("计算结果是：" + sumUp(n) + "。");

        sc.close();
    }
}
