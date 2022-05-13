package testinner;

public class outer {
    private int age=10;
    int height;
    int weight;
    class inner{
        int grade;
        int emotion;
        int ability;
        void fun(){
            System.out.println(age);
        }
    }
    inner constuct(){
        return new inner();
    }
    void test(Tmp a){
        a.fun();
    }
    void test1(){
        class tmp{
            String str="wo shi da ming xing!";
        }
        tmp p= new tmp();
        System.out.println(p.str);
    }
    public static void main(String[] args) {
        outer out=new outer();
        inner in=out.new inner();
        System.out.println(in.ability);
        in.fun();
        out.test(new Tmp() {//这是匿名内部类
            @Override
            public void fun() {
                System.out.println("success needs work!");
            }
        });

    }
}
class test{
    public static void main(String[] args) {
        outer.inner p=new outer().new inner();
    }
}
interface Tmp{
    void fun();
}
class outer2{
    int a;
    static int b;
    static class inner2{
        static int c;
        int d=b;
    }

    public static void main(String[] args) {
        inner2 p=new inner2();
    }
}
class test3{
    public static void main(String[] args) {
        int a=outer2.inner2.c;

    }
}