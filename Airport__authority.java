import java.util.Scanner;
class Air
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=x)
            {
                sum=sum+1;
            }
            else
            {
                sum=sum+2;
            }
        }
        System.out.println(sum);
        
    }
}