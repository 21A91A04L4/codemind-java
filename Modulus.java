import java.util.Scanner;
class modulus
{
    public static void main(String args[])
    {
        int x,y,mod;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        mod=x%y;
        System.out.println(+mod);
    }
}