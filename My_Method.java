
public class My_Method {

    public static int[] tatan(int[] a)
    {
        Massiv r = new Massiv();
        int m=r.n;
        int k = m,
                c=0;
        for(int i = 0; i<m/2+1; i++)
        {
            for(int j = i; j<k; j++)
            {
                if(a[i] >= a[j])
                {
                    c=a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
                if(a[m-i-1] <= a[m-j-1])
                {
                    c = a[m-i-1];
                    a[m-i-1] =a[m-j-1];
                    a[m-j-1] = c;
                }
            }

        }
        return a;
    }
}
