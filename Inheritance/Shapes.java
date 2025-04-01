//root class= Area. child of Area is perimeter 
//root class= Area. child of Area is perimeter.child of perimeter is volume 

class Shapes
{
	public static void main(String args[])
		{	
			Perimeter p1=new Perimeter();			//simple or single inheritance 
			p1.areaOfSquare();
			p1.areaOfRectangle();
			System.out.println(p1.perimeterOfSquare(10));
			System.out.println(p1.perimeterOfRectangle(10,20));

			Volume v1=new Volume();				//multi-level inheritance
			v1.areaOfSquare();
			v1.areaOfRectangle();
			System.out.println(v1.perimeterOfSquare(10));
			System.out.println(v1.perimeterOfRectangle(10,20));
			System.out.println(v1.volumeOfSquare(10));
			System.out.println(v1.volumeOfRectangle(10,20,30));
					
		}
}