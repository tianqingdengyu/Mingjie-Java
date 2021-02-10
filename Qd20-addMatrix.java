//清单 7-20

class addMatrix { 
    //------将 x 和 y 的和赋给 z
    static void addM(int[][] x, int[][] y, int[][] z) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++)
                z[i][j] = x[i][j] + y[i][j];
        }
    }
    //------显示矩阵 m 中的全部元素
    static void printM(int[][] m) {
        for (int i = 0;i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) 
                System.out.print(m[i][j] + "   ");
            System.out.println();
        }
    }
        public static void main(String[] args) {
            int[][] a = { {1, 2, 3}, {4, 5, 6} };
            int[][] b = { {6, 3, 4}, {5, 1, 2} };
            int[][] c = new int[2][3];

            addM(a, b, c);

            System.out.println("矩阵 a"); printM(a);
            System.out.println("矩阵 b"); printM(b);
            System.out.println("矩阵 c"); printM(c);

    }    
}    
