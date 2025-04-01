/*
54321
44321
33321
22221
11111
*/
 class program48
{
    public static void main(String[] args) 
	{
		int n=5;
        	for (int i = n; i >= 1; i--)	
		 { 
            		for (int j = n; j >= 1; j--)
			 { 
               			 if (i<j) 
				{
                   		 	System.out.print(i);
				}
                		else 
				{
                    			System.out.print(j);
				}
           		 }
           		 System.out.println();  
        }
    }
}