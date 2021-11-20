package com.myproject.family;

/**
 * @author chenying
 * @date 2021/11/14
 *
 * 初始化过程；
 * 1. 类初始化： 父类静态变量初始化，父类静态代码块初始化， 子类静态变量初始化（仅一次）
 * 2. 实例初始化：
 *    先实例化父类：父类变量初始化，父类非静态代码块初始化，父类构造函数；（注意方法有继承时，多态）
 *    再实例化子类：子类变量初始化，子类非静态代码块初始化，子类构造函数
 **/
public class Son extends  Father {


    static {
        System.out.println(" -- 6 --");

    }
    Son(){
        //super();
        System.out.println(" -- 7 --");
    }
    {
        System.out.println(" -- 8 --");
    }
    private int i = test();
    private static  int j = method();
    public int test(){
        System.out.println(" -- 9 --");
        return 1;
    }
    public  static  int method(){
        System.out.println(" -- 10 --");
        return 1;
    }

    public static void main(String[] args){

        Son s1 = new Son();
        System.out.println(" ----");
        Son s2 = new Son();
    }
}
