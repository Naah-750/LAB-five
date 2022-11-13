public class LAB_5_Q1_test {
    public static void main(String[] args) {
        LAB_5_Q1 x=new LAB_5_Q1();
        x.prest();
        x.prest();
        System.out.println(x.show());
        x.undo();
        System.out.println(x.show());
        x.reset();
        System.out.println(x.show());
        x.undo();
        x.undo();
        System.out.println(x.show());
    }
}
