import java.util.Scanner;
class Pretty
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=1.0/i;
        }
        System.out.format("%.2f",sum);
        sc.close();
    }
}