import java.util.Scanner;

//练习 7-14

class posN {
    static int setN(int x, int pos, int n) {
        int t = 0;
        while (pos - n >= 0) {
            t = 1 << pos;
            x = x | t;
            pos--;
        }
        return x;
    }

    static int resetN(int x, int pos, int n) {
        int t = 0;
        while (pos - n >= 0) {
            t = 1 << pos;
            t = ~t;
            x = x & t;
            pos--;
        }
        return x;
    }

    static int inverseN(int x, int pos, int n) {
        if (setN(x, pos, n) != x) 
            return setN(x, pos, n);
        else
            return resetN(x, pos, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x = : ");   int x = sc.nextInt();
        System.out.print("pos = : "); int pos = sc.nextInt();
        System.out.print("n = : ");   int n = sc.nextInt();
        

        int a = setN(x, pos, n);     System.out.println(a);
        int b = resetN(x, pos, n);   System.out.println(b);
        int c = inverseN(x, pos, n); System.out.println(c);

        sc.close();
    }
}
