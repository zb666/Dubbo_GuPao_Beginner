package com.gupaoedu.dubbo.server;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        List<String> listA = null;
        List<String> list = testA(listA);
        System.out.println(list.size());
    }

    private static List<String> testA(List<String> listA) {
        listA = new ArrayList<>();
        listA.add("abc");
        return listA;
    }


}