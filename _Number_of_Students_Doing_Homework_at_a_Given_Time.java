import java.util.Scanner;
class ele
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
        int m=sc.nextInt();
        int [] b=new int[m];
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(k>=arr[i] && k<=b[i])
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}