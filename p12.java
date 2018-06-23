
/**
 * Write a description of class p12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class p12
{
    public static void main(int n)
    {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        float s=0;
        for(int i = 1;i<=n;i++)
        {
            if(i%2==0)
            {
                s=s+((float)(a)/(float)(Math.pow(3,i)));
            }
            else
            {
                s=s+((float)(a)/(float)(Math.pow(2,i)));
            }
        }
        System.out.println(s);
    }
}
