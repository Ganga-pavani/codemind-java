import java.util.Scanner;
class Mixed
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=0;
        int o=0;
        while(n>0)
        {
            int r=n%10;
            if(r%2==0)
            {
                e++;
            }
            else
            {
                o++;
            }
            n=n/10;
        }
        if(e>0 && o<1)
        {
            System.out.println("Even");
        }
        else if(e<1 && o>0)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Mixed");
        }
        sc.close();
    }
}