//练习 7-15

class sum {
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return sum;
    }

    public static void main(String[] args) {
        int i = sumOf(new int[] {1, 2, 3, 4, 5, 6}); //这里数组只要进行数值的计算，使用后就可以废弃了，所以这样写。
        System.out.print(i);
    }
}