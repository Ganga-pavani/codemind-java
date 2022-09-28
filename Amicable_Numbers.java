import java.util.Scanner;
class Root
{
    public static void main(String args[])
    {
        int num1,num2,i,j,sum1=0,sum2=0;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
    for (i=1;i<num1;i++)
    {
        if (num1%i==0)
        {
            sum1=sum1+i;
        }
    }
    for (j=1;j<num2;j++)
    {
        if (num2%j==0)
        {
            sum2=sum2+j;
        }
    }
    if (sum1==num2&&sum2==num1)
    {
        System.out.println("Amicable");
    }
    else
         System.out.println("Not Amicable");

    }
}