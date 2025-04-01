class program41 
{
    public static void main(String[] args)
 {
        int a = 10, b = 25, c = 15;

                String res = (a > b) ? 
                        ((a > c) ? "a is bigger" : "c is bigger") 
                        : 
                        ((b > c) ? "b is bigger" : "c is bigger");

        System.out.println(res);
    }
}
