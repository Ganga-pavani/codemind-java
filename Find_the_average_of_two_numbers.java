import java.util.Scanner;
class Avg
{
    public static void main(String args[])
    {
        int a,b,c;
        float d;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        d=(float)(c)/2;
        System.out.format("%.4f",d);
        sc.close();
    }
}