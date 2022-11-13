public class LAB_5_Q3 {
    private double balance;
    public void deposit(double x) {balance=balance+x;}
    public void withdraw(double x)
    {
        if (balance>=x) balance-=x;
        else System.out.println("not enough balance.");
    }
    public double getBalance() {return balance;}
}
