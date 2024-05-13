public class swap {
    public static void main(String[] args) {
        int a,b;
        a= 10;
        b=20;
        System.out.println("Values before swapping are"+ " "+a+" "+b);
        swapping(a,b);
    
    }
    static void swapping(int x,int y)
    {
       int c;
       c=x;
       x=y;
       y=c;
       System.out.println("Values after swapping are"+ " "+x+" "+y);
    
    }
}
