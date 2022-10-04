import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      for(int i=0;i<t;i++)
      {
          int x1=sc.nextInt();
          int y1=sc.nextInt();
          int x2=sc.nextInt();
          int y2=sc.nextInt();
          if((float)x1/y1<(float)x2/y2)
          {
              System.out.println(1);
          }
          else if((float)x1/y1==(float)x2/y2)
          {
              System.out.println(0);
          }
          else if((float)x1/y1>(float)x2/y2)
          {
              System.out.println(-1);
          }
          
      }
    }
}