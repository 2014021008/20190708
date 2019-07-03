package com.lll.other;

/**
 * @ClassName MyTestStatic
 * @Description TODO
 * @Author Liulele
 * @Date 2019/5/1512:53
 **/
public class MyTestStatic extends MyParent {
    private int b;

    public MyTestStatic() {
        super(2);
        System.out.println("子类构造器");
    }

    static {
        System.out.println("子类的静态代码块");
    }

    {
        System.out.println("子类的代码块");
    }

    public static void test3() {
        System.out.println("子类的静态方法");
    }

    public void test4() {
        System.out.println("子类的普通方法");
    }

    public static void main(String[] args) {
        MyTestStatic myTestStatic = new MyTestStatic();
        myTestStatic.test4();
    }
}
