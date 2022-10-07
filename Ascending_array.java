import java.util.Scanner;
class des
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int [] arr=new int[50];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<arr[i+1])
            {
                c+=1;
            }
        }
        if(c==n-1)
        {
            System.out.println("yes");
        }
        else
            System.out.println("no");
    }
}