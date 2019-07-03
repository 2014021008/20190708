package com.lll.other;

/**
 * @ClassName MyParent
 * @Description TODO
 * @Author Liulele
 * @Date 2019/5/1512:54
 **/
public class MyParent {
    private int a;
    public MyParent(int a) {
        this.a = a;
        System.out.println("父类的有参构造");
    }

    static {
        System.out.println("父类的静态代码块");
    }

    {
        System.out.println("父类的代码块");
    }

    public static void test1() {
        System.out.println("父类的静态方法");
    }

    public void test2() {
        System.out.println("父类的普通方法");
    }
}
