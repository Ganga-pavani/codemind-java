import java.util.Scanner;
class ele
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int y=0;
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int c=1;
            if(arr[i]==-1)
            {
                continue;
            }
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                    arr[j]=-1;
                }
            }
            if (c==arr[i])
            {
                System.out.print(arr[i]+" ");
                y=1;
            }
        }
        if(y==0)
        {
            System.out.print("-1");
        }
    }
}