//练习 7-8 有待修改。
import java.util.Random;

class random {
    static Random rm = new Random();
    static int rand(int a, int b){
        int asr = 0;

        if (a >= b){ //当 a = b 时，没有值能满足条件，就会进入死循环。
            asr = a;
        }  
        else {
            while (true) {
                int c = rm.nextInt(10);
                System.out.println("c = " + c);

                if ((c >= a) && (b > c)) { //满足条件时，返回 c 的值，并停止循环。
                    asr = c;
                    break;
                }         
            }  
        }
    return asr;
}     
   
   public static void main(String[] args) {
        int a = rm.nextInt(10);
        int b = rm.nextInt(10);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    
        System.out.println(rand(a, b));
   }
}
