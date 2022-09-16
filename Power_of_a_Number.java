import java.util.Scanner;
class Mixed
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        double a=Math.pow(x,y);
        int b=(int)(a)%z;
        System.out.println(b);
        sc.close();
    }
}