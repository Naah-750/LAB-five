public class LAB_5_Q2 {
    private int  Limit , x;
    public void setLimit(int y)
    {
        Limit=y;
    }
    public void click()
    {
        if (x==Limit) x=Limit;
        else x++;
    }
    public void reset() {x=0;}
    public int show() {return x;}
}
