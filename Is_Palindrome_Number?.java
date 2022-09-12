import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n!=0)
        {
            int r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("2");
        }
        else
        {
            System.out.println("1");
        }
        sc.close();
    }
}