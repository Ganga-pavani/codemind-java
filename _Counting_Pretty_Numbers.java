import java.util.Scanner;
class Pretty
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=0;
            for(int i=a;i<=b;i++)
            {
                int r=i%10;
                if(r==2||r==3||r==9)
                {
                    c+=1;
                }
            }
            System.out.println(c);
            t--;
        }
        sc.close();
    }
}