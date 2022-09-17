import java.util.Scanner;
class Perfect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,pro=1;
        while(n>0)
        {
            int r=n%10;
            sum=sum+r;
            pro=pro*r;
            n=n/10;
        }
        if(sum==pro)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
        sc.close();
    }
}