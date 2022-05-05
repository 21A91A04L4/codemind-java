import java.util.Scanner;
class division
{
    public static void main(String args[])
    {
        int x,y,div;
        Scanner sc=new Scanner (System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        div=x/y;
        System.out.println(+div);
        sc.close();
    }
}