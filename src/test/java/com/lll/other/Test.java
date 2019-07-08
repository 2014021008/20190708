package com.lll.other;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Liulele
 * @Date 2019/7/818:50
 **/
public class Test {
    static boolean foo(char c){
        System.out.println(c);
        return true;
    }

    public static void main(String[] args) {
        int i=0;
        for (foo('A');foo('B')&&(i<2);foo('C')){
            i++;
            foo('D');

        }
    }
}
