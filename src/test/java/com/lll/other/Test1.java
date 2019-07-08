package com.lll.other;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author Liulele
 * @Date 2019/7/818:57
 **/
public class Test1 {
    public static void main(String[] args) {
        String s="|AA|BB";
        String[] split = s.split("|");
        for (String s1 : split) {
            System.out.println(s1);
        }
        int length = split.length;
        System.out.println(length);
    }
}
