//代码清单 7-10，确认标识符作用域

class Scope {
    static int a = 2; //字段,在整个类中通用。在多个方法中共享的变量一定要在方法外部进行生明，并加上 static 修饰符。

    static void printA() {
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {
        System.out.println("a = " + a); //2

        int a = 3000;                   //局部变量，从声明位置开始，到包含该声明的程序块最后的大括号为止都通用。

        System.out.println("a = " + a); //3000，局部变量可见，字段被隐藏。

        System.out.println("Scope.a = " + Scope.a); //2， 类名 + 字段名可以访问被隐藏的字段。

        printA();                       //2，调用了 printA 方法，这里的 a 值为 Scope 类中的通用字段。
    }
}
