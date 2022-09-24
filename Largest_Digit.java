import java.util.Scanner;
class Abn
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,sum=0,large=0;
        int n=sc.nextInt();
        while(n>0)
    {
        r=n%10;
        if(large<r)
        {
            large=r;
        }
        n=n/10;
    }
    System.out.println(large);
    }
}