import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        for(int i=x+1; i<y; ++i)
           {
              int c=0;
               for(int j=2; j<=i/2; ++j)
                  {
                     if(i%j==0)
                        {
                           c=1;
                           break;
                        }
                    }
                    if(c==0)
      {
          System.out.println(i);
    }
}
sc.close();
}
}