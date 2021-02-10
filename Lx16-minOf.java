//练习 7-16

class min {
    static int minOf(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++)
            if (a[i] < min)
                min = a[i];
        return min;
    }

    public static void main(String[] args) {
        int asr = minOf(new int[] {84, 203, 128});
        System.out.print("最小值是：" + asr + "。");
    }
}