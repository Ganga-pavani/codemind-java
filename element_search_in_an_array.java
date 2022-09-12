import java.util.Scanner;
class Avg
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    int c=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]==k)
        {
            c++;
        }
    }
    if(c>0)
    {
        System.out.println("True");
    }
    else
    {
        System.out.println("False");
    }
    sc.close();
}
}