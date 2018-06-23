
/**
 * Write a description of class p3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p3
{
    public static void main(int n)
    {
        int sum=0,a=2,b=4;
        for(int i = 1;i<=n;i++)
        {
            if(i%2!=0)
            {
                sum+=a;
                a+=2;
            }
            else
            {
                sum-=b;
                b+=2;
            }
        }
        System.out.println(sum);
    }
}
