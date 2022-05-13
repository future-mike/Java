package practice;

public class outer {
    static int a=10;
    static class inner{
        void fun(){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        outer p=new outer();
        p.a=20;
        inner p2=new inner();
        p2.fun();
    }


}
