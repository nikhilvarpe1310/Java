/* Multiple inheritance possible due interface because interface is 0 implemented class that's why all methods are abstract means no method is given his implemention .when the method is empty in two interface is same then it doesn't give ambuigity error .chile class gives needs to give implementation for all the methods (common as well as and different)i.e. it overrides the method and the closer method is get called which is near to object.i.e.c1.m1() means m1 method of child and m3 method of child
class MultipleInheritanceUsingInterface
*/
{
	public static void main(String[] args)
	{	
		Child c1=new Child();
		c1.m1();
		c1.m2();
		c1.m3();
	}
}