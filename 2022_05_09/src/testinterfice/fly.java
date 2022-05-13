package testinterfice;

public interface fly {
    boolean Hasfling();
    int val=100;
    boolean Ctwind();
}
class bird implements fly{

    @Override
    public boolean Hasfling() {
        return false;
    }

    @Override
    public boolean Ctwind() {
        return false;
    }

    public static void main(String[] args) {
        bird p=new bird();
        System.out.println(p.Ctwind());
        System.out.println(p.Hasfling());
    }

}
