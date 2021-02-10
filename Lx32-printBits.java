//练习 7-32

class printBits1 {
    static void printBits(byte x) {
        for (int i = 0; i >= 0; i--) 
            System.out.println(((x >>> i & 1) == 1) ? '1' : '0');
    }

    static void printBits(short x) {
        for (int i = 0; i >= 0; i--) 
            System.out.println(((x >>> i & 1) == 1) ? '1' : '0');
    }

    static void printBits(int x) {
        for (int i = 0; i >= 0; i--) 
            System.out.println(((x >>> i & 1) == 1) ? '1' : '0');
    }

    static void printBits(long x) {
        for (int i = 0; i >= 0; i--) 
            System.out.println(((x >>> i & 1) == 1) ? '1' : '0');
    }

    public static void main(String[] args) {
        
    }
}