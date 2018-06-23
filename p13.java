
/**
 * Write a description of class p13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class p13
{
    public static void main(int n)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        float s=0;
        for(int i = 1;i<=n;i++)
        {
            if(i%2!=0)
            {
                s+=i;
            }
            else
            {
                s=s-((float)(((float)(a))/((float)(i))));
            }
        }
        System.out.println(s);
    }
}
