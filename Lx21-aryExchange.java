import java.util.Scanner;

//练习 7-21

class aryExchange {
    static void aryEx(int[] a, int[] b) {
    //比较 a 和 b 的长度，使用较小者
    // 两个数相比较
    // 最大值：max(a, b) = (a + b + Math.abs(a - b)) / 2
    // 最小值：min(a, b) = (a + b - Math.abs(a - b)) / 2

    int c = (a.length + b.length - Math.abs(a.length - b.length)) / 2;
    int[] t = new int[c];

    if (a.length >= b.length) { 
        //a为较长数组
        for (int i = 0; i < c; i++) //复制较长数组前段
            t[i] = a[i];
        
        for (int i = 0; i < c; i++) //较长数组 b 通过遍历 a 数组赋值
            a[i] = b[i];
        
        //最开始的思路是通过引用，b = t, 来完成赋值，可是实现不了，原因还没有想明白
        for (int i = 0; i < c; i++)
            b[i] = t[i];

    } else {
        // //b为较长数组
        // for (int i = 0; i < c; i++) //复制较长数组前段
        //     t[i] = b[i];
           
        // for (int i = 0; i < c; i++) //较长数组 b 通过遍历 a 数组赋值
        //     b[i] = a[i];
         
        // //遍历复制 t 值到 a 中
        // for  (int i = 0; i < c; i++) 
        //     a[i] = t[i];

        //折腾了好久，终于实现了，发现循环条件相同，就试着合写在一起，正常实现了。
        //这样就不要判断数组长短了，直接使用一个 for 循环就实现了。
        //很简单的实现，却折腾了好久，属实是有点菜啊，哈哈哈，还需要努力。

        for (int i = 0; i < c; i++){
            t[i] = b[i];
            b[i] = a[i];
            a[i] = t[i];
        }
       
    }
}    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入数组 a 的长度：");
        int num1 = sc.nextInt();

        int[] a = new int[num1];

        for (int i = 0; i < num1; i++) {
            System.out.print("a[" + i + "] = ：");
             a[i] = sc.nextInt();
        }

        System.out.print("请输入数组 b 的长度：");
        int num2 = sc.nextInt();

        int[] b = new int[num2];

        for (int i = 0; i < num2; i++) {
            System.out.print("b[" + i + "] = ：");
             b[i] = sc.nextInt(); //复制粘贴的时候要注意，我复制时没有修改 a[i], 这个错误很久才查出来，浪费了不少时间。
        }

        System.out.println("----------------------");

        aryEx(a, b);

        for (int i = 0; i < num1; i++)
            System.out.println("a[" + i + "] = : " + a[i]);
        
        for (int i = 0; i < num2; i++)
            System.out.println("b[" + i + "] = : " + b[i]);

        sc.close();
    }
}