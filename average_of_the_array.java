import java.util.Scanner;
class Ascii
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        float sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        float x=sum/n;
        System.out.format("%.2f",x);
        sc.close();
    }
}