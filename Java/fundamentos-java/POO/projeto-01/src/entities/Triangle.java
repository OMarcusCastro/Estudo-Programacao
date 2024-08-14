package entities;

public class Triangle {

	double a;
	double b;
	double c;

	public Triangle(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double area(){
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
