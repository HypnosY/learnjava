/*
    实现类实例化对象个数的统计
 */
package com.leon.demo;

public class TestDemo3 {
    public static void main(String[] args) {
        new Book();        new Book();        new Book();
        new Book();        new Book();        new Book();


    }
}
class Book{
    private static int num = 0;      //保存统计个数
    public Book(){
        num++;
        System.out.println("这是第" + num + "个产生的对象！");
    }
}