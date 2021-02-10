//练习 7-27

class addMatrix1 {
    static boolean addM(int[][] x, int[][] y, int[][] z) {
        //------分别求出各个数组的总长度
        int sum1 = 0;
        for (int i = 0; i < x.length; i++)
            sum1 += x[i].length;
        int sum2 = 0;
        for (int i = 0; i < y.length; i++)
            sum2 += y[i].length;
        int sum3 = 0;
        for (int i = 0; i < z.length; i++)
            sum3 += z[i].length;

        //------x.length 是二维数组的行数，很好获取，可是列数怎么获取呢
        //------总数和行数都相等的话，列数 = 总数 / 行数 应该也是相等的
        //------这样是不准确的，{ {1， 2， 3}， {4， 5， 6} } 和 { {1， 2}，{3， 4， 5， 6} } 总数和行数也都相等，但是好像不能对应相加吧
        if ((x.length == y.length && y.length == z.length) && (sum1 == sum2 && sum2 == sum3)) {
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < x[i].length; j++) 
                    z[i][j] = x[i][j] + y[i][j]; 
            }
            return true;
        } else {
            return false;
        }
    }  
 
    public static void main(String[] args) {
        int[][] x = { {1, 2, 3}, {4, 5, 6} };
        int[][] y = { {6, 3, 4}, {5, 1, 2} };
        int[][] z = new int[2][3];

        addM(x, y, z);

        for (int i = 0;i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) 
                System.out.print(z[i][j] + "   ");
            System.out.println();
        }
    }
}