package test;

public class Child extends Parent {
    public void f1() {
        System.out.println("Child f1");
        super.f1();
    }

    @Override
    public void f2() {
        System.out.println("Child f2");
    }
}

