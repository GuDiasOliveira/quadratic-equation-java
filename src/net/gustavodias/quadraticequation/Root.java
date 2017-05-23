package net.gustavodias.quadraticequation;

public class Root {
	private double real, imaginary;
	
	public Root(double real, double imaginary) {
		setReal(real);
		setImaginary(imaginary);
	}
	
	public Root(double real) {
		this(real, 0);
	}
	
	public Root() {
	}
	
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}
	
	public boolean isComplex() {
		return imaginary != 0;
	}
	
	@Override
	public String toString() {
		String str = String.valueOf(real);
		if (imaginary != 0) {
			str += imaginary > 0 ? " + " : " - ";
			str += Math.abs(imaginary) + "i";
		}
		return str;
	}
}