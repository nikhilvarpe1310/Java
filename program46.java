/*
10101
10101
10101
10101
10101
*/
 class program46
	 {
    public static void main(String[] args) 
		{
		int n=5;
        for (int i = 1; i <= n; i++)	
		 { 
            for (int j = 1; j <= 5; j++)
			 { 
                if (j % 2 == 1) 
                    System.out.print("1");
                else 
                    System.out.print("0");
            }
            System.out.println();  
        }
    }
}