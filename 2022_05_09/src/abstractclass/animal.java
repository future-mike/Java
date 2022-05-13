package abstractclass;

public abstract class animal {
    public abstract void run();
    public abstract void rest();
    public void shout(){
        System.out.println("发生中");
    }
    public static void main(String[] args){
        animal p=new animal() {
            @Override
            public void run() {
                System.out.println("疯狂的跑");
            }


            @Override
            public void rest() {
                System.out.println("疯狂的休息");

            }


        };
        p.rest();
        p.run();
    }
}
