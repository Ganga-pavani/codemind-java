import java.util.Scanner;
class Perfect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int c=0,temp,r;
        for(int i=x;i<=y;i++)
        {
           temp=i;
           c=0;
           while(temp>0)
           {
               r=temp%10;
               if(r==0||i%r!=0)
               {
                   c=1;
                   break;
               }
               temp=temp/10;
           }
           if(c==0)
           {
               System.out.print(i+" ");
           }
        }
        sc.close();
    }
}