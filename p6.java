
/**
 * Write a description of class p6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p6
{
    public static void main(int n)
    {
        long s=0;
        int f=0;
        for(int i=1;i<=n;i++)
        {
            f=1;
            for(int j=1;j<=i;j++)
            {
                f*=j;
            }
            s+=f;
        }
        System.out.println(s);
    }
}
