import java.util.Scanner;
class pat
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=n;i>=1;i--)
       {
           for(int j=n;j>=1;j--)
           {
               if(i==j||j==(n-i+1))
               {
                  System.out.print(i+" ");
               }
               else
               {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
}