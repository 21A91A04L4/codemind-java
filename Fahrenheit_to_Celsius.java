import java.util.Scanner;
class spyder
{
    public static void main(String args[])
    {
        float c,f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextFloat();
        f=(c-32)*5/(9);
        System.out.printf("%.2f",f);
    }
}