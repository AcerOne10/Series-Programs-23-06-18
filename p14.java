
/**
 * Write a description of class p14 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class p14
{
    public static void main(String[] args)
    {
        double s=0;
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int f=0,c=2;
        for(int i=1;i<=19;i++)
        {
            f=1;
            for(int j=1;j<=c;j++)
            {
                f*=j;
            }
            if(i%2!=0)
            {
                s+=a/((double)(f));
            }
            else
            {
                s-=a/((double)(f));
            }
            c++;
        }
        System.out.println(s);
    }
}
