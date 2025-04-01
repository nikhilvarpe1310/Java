/*
54321
5432
543
54
5
54
543
5432
54321
*/
class program63
{
    public static void main(String args[])
    {
        int n=5;
        for (int i=1;i<=(n*2)-1;i++)
        {
            if (i<=n)
            {
                for (int j=n;j>=i;j--)
                {
                    System.out.print(j);
                }
            }
            else
            {
                for (int j=n;j>=n*2-i;j--)
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
