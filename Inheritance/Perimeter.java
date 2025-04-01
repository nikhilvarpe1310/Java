class Perimeter extends Area
{
	double perimeter;
	double perimeterOfSquare(double a)
	{
		perimeter=4*a;
		return perimeter;
	}
	double perimeterOfRectangle(double a, double b)
	{
		perimeter=2*(a+b);
		return perimeter;
	}
}