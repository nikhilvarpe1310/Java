class program40 
{
    public static void main(String[] args)
 {
        int a = 10, b = 25, c = 15, d = 30;
        String res = (a > b) ? 
                        ((a > c) ? ((a > d) ? "a is bigger" : "d is bigger") 
                                 : ((c > d) ? "c is bigger" : "d is bigger")) 
                        : 
                        ((b > c) ? ((b > d) ? "b is bigger" : "d is bigger") 
                                 : ((c > d) ? "c is bigger" : "d is bigger"));

        System.out.println(res);
    }
}
