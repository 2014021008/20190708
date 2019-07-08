package com.lll.other;

/**
 * @ClassName MyTestStatic
 * @Description TODO
 * @Author Liulele
 * @Date 2019/5/1512:53
 **/
public class MyTestStatic extends MyParent {

    public MyTestStatic() {
        System.out.println("b");
    }

    static {
        System.out.println("a");
    }
    public static void main(String[] args) {
        MyTestStatic myTestStatic = new MyTestStatic();
        myTestStatic = new MyTestStatic();
    }
}
