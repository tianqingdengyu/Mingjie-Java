//练习 7-1
import java.util.Scanner;

class signOf {
    //根据 a 值返回对应值
    static int sign(int a) {
        if (a < 0) 
            return -1;    
        else if (a == 0) 
            return a;    
        else
            return 1;      
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个整数：");
        int a = sc.nextInt();

        System.out.println(sign(a));

        sc.close();
    }
}
