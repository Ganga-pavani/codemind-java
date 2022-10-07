import java.util.Scanner;
class ele
{
    public static boolean even(int i)
    {
        String str=String.valueOf(i);
        int r=str.length();
        if(r%2==0)
           return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(even(arr[i]))
            {
                c+=1;
            }
        }
        System.out.print(c);
    }
}