
/**
 * Write a description of class p1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p1
{
    public static void main(int n)
    {
        int sum=0,a=9,b=99;
        for(int i = 1;i<=n;i++)
        {
            if(i%2!=0)
            {
                sum+=a;
                a--;
            }
            else
            {
                sum+=b;
                b-=10;
            }
        }
        System.out.println(sum);
    }
}

