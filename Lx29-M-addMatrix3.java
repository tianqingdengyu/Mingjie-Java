//练习 7-29

class addMatrix3 {
    static int[][] aryClone(int[][] a) {
        //------同样地，有些勉强
        int[][] b = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                b[i][j] = a[i][j];
        }
        return b;
    }

    public static void main(String[] args) {
        int[][] a = { {1, 2, 3}, {4, 5, 6} };

        int[][] b = aryClone(a);

        for (int i = 0;i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) 
                System.out.print(b[i][j] + "   ");
            System.out.println();
        }
    }
}