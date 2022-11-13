public class LAB_5_Q1 {
    private int x=0;
    public void prest() {x++;}
    public void reset() {x=0;}
    public int show() {return x;}
    public void undo() {
        if(x==0) x=0;
        else x--;
    }
}
