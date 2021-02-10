//练习 7-33

class printArray1 {
    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + "          ");
    }

    static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
       
        int[] a = new int[] {12, 536, -8, 7};

        printArray(a);

        int[][] x = new int[][] { {32, -1, 32, 45, 67}, {535, 99999, 2}, {2, 5, -123, 9} };

        printArray(x);
    }
}