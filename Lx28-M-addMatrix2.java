//练习 7-28, 以 x , y接收同行数和列数的数组为前提

class addMatrix2 {
    static int[][] addM(int[][] x, int[][] y) {
        //------这样有点勉强，因为还存在 { {1，2}，{3，4，5，6} } 这种情况。
        int[][] z = new int[x.length][x[0].length];
       

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++)
                z[i][j] = x[i][j] + y[i][j];
        }
        return z;
    }

    public static void main(String[] args) {
        int[][] x = { {1, 2, 3}, {4, 5, 6} };
        int[][] y = { {6, 3, 4}, {5, 1, 2} };

        int[][] z = addM(x, y);

        for (int i = 0;i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) 
                System.out.print(z[i][j] + "   ");
            System.out.println();
        }
    }
}
    

