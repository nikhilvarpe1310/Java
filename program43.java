/*
1
2
1
4
5
2
7
8
3
10
*/
class program43
 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) 
                System.out.println(1);
            else if (i == 6) 
                System.out.println(2);
            else if (i == 9) 
                System.out.println(3);
            else 
                System.out.println(i);
        }
    }
}