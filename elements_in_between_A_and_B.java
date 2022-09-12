import java.util.Scanner;
class Count
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
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]>=a && arr[i]<=b)
        {
            System.out.print(arr[i]+" ");
            sum++;
        }
    }
    if(sum==0)
    {
        System.out.println("-1");
    }
    sc.close();
}
}