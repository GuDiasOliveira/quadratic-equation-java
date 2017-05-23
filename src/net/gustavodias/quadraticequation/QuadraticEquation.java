package net.gustavodias.quadraticequation;

public class QuadraticEquation {
	private double a, b, c;
	
	public QuadraticEquation(double a, double b, double c) {
		setA(a);
		setB(b);
		setC(c);
	}
	
	public QuadraticEquation() {
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public double getDelta() {
		return b*b - 4*a*c;
	}
	
	public Roots solve() {
		double delta = getDelta();
		
		Roots roots = new Roots();
		
		if (a == 0) {
			// It is a first degree equation
			if (b != 0)
				roots.addRoot(new Root(-c/b));
			
		} else if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2*a);
			double x2 = (-b - Math.sqrt(delta)) / (2*a);
			roots.addRoot(new Root(x1));
			roots.addRoot(new Root(x2));
			
		} else if (delta == 0) {
			roots.addRoot(new Root(-b/(2*a)));
			
		} else {
			double real = -b/(2*a);
			double imaginary = Math.sqrt(-delta)/(2*a);
			roots.addRoot(new Root(real, imaginary));
			roots.addRoot(new Root(real, -imaginary));
		}
		
		return roots;
	}
}