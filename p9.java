
/**
 * Write a description of class p9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p9
{
    public static void main(int n)
    {
        int a=1,nu=0,de=0;
        float s=0;
        for(int i = 1;i<=n;i++)
        {
            nu=nu+i;
            de=de*i;
            s=s+(((float)(nu))/((float)(de)));
        }
        System.out.println(s);
    }
}
