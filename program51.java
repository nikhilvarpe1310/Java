/*
12345
22345
33345
44445
55555


*/
 class program51
{
    public static void main(String[] args) 
	{
		int n=5;
        	for (int i = 1; i <= n; i++)	
		 { 
            		for (int j = 1; j <= n; j++)
			 { 
               			 if (i<j) 
				{
                   		 	System.out.print(j);
				}
                		else 
				{
                    			System.out.print(i);
				}
           		 }
           		 System.out.println();  
        }
    }
}