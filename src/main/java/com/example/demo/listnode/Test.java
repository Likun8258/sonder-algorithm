package com.example.demo.listnode;

import java.util.List;
import com.google.common.collect.Lists;

/**
 * @Author likun
 * @Date
 **/
public class Test {

    /**
     * 将 [1,2,3,4,5] 转换成 [5,4,3,2,1]
     */
    public static void main(String[] args) {

        List<Integer> list = Lists.newArrayList(1,2,3,4,5);

        System.out.println(list);
        Integer a;
        for (int i = 0; i < list.size() / 2; i++) {
            a = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, a);
        }
        System.out.println(list);
    }

}
