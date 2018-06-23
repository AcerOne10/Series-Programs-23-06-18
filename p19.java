
/**
 * Write a description of class p19 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class p19
{
    public static void main(int n)
    {
        int a,p=1,mt=0,flag=0,d=1;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        float sum=0;
        for(int i = 1;i<=n;i++)
        {
            if(i%2!=0)
            {
                sum=sum+(((float)(Math.pow(a,p)))/((float)(d+mt)));
                if(flag==0)
                {
                    d=3;
                    flag++;
                }            
                mt = i*2;
            }
            else
            {
                sum=sum-(((float)(Math.pow(a,p)))/((float)(d+mt)));
                if(flag==0)
                {
                    d=3;
                    flag++;
                }            
                mt = i*2;
            }
            d=d+mt;
        }
        System.out.println(sum);
    }
}
