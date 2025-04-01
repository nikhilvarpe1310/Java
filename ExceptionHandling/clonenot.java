package a.b.c.d.e;
public class clonenot implements Cloneable
{
	public int a;
		public void display()
		{
			System.out.println("display method of demo");
		}
		public  clonenot clone()
		{
			clonenot c1 = null;
			try{
			c1 = (clonenot)super.clone();
			}catch(CloneNotSupportedException e)
			{
				System.out.println(e);	
			}
			return c1;
			
		}
}