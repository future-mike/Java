package test;

public class Parent {
    private static int a;


    public void f1() {
        System.out.println("Parent f1");
        f2();
    }

    public void f2() {
        System.out.println("Parent f2");
    }
}
