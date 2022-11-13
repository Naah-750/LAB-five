public class LAB_5_Q3_test {
    public static void main(String[] args) {
        LAB_5_Q3 x=new LAB_5_Q3();
        x.deposit(3000);
        x.withdraw(2500);
        x.withdraw(400);
        System.out.println("expected: 100.0");
        System.out.println("output:    "+x.getBalance());
}
