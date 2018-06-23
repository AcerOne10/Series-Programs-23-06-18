
/**
 * Write a description of class p20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p20
{
    public static void main(int n)
    {
        int a=1,s=0;
        for(int i=1;i<=n;i++)
        {
            a=a*i;
            s+=a;
        }
        System.out.println(s-1);
    }
}
