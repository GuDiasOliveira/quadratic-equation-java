package net.gustavodias.quadraticequation.examples;

import net.gustavodias.quadraticequation.QuadraticEquation;
import net.gustavodias.quadraticequation.Roots;

public class ExamplesQuadraticEquations {
	
	public static void main(String[] args) {
		System.out.println("\nx² - 5x + 6 = 0");
		printSolution(new QuadraticEquation(1, -5, 6));
		
		System.out.println("\n3x² + 12x - 15 = 0");
		printSolution(new QuadraticEquation(3, 12, -15));
		
		System.out.println("\n4x + 2 = 0");
		printSolution(new QuadraticEquation(0, 4, 2));
		
		System.out.println("\n4x² + 56x + 196 = 0");
		printSolution(new QuadraticEquation(4, 56, 196));
		
		System.out.println("\n5x² - 720 = 0");
		printSolution(new QuadraticEquation(5, 0, -720));
		
		System.out.println("\nx² - 8x = 0");
		printSolution(new QuadraticEquation(1, -8, 0));
		
		System.out.println("\n5x² + 720 = 0");
		printSolution(new QuadraticEquation(5, 0, 720));
		
		System.out.println("\n2x² + 4x + 2 = 0");
		printSolution(new QuadraticEquation(2, 4, 2));
		
		System.out.println("\n9x² - 12x + 4 = 0");
		printSolution(new QuadraticEquation(9, -12, 4));
		
		System.out.println("\n2x² - 3x + 4 = 0");
		printSolution(new QuadraticEquation(2, -3, 4));
		
		System.out.println("\n-50x² = 0");
		printSolution(new QuadraticEquation(-50, 0, 0));
	}
	
	private static void printSolution(QuadraticEquation equation) {
		Roots roots = equation.solve();
		if (roots.getRootsCount() == 2) {
			System.out.println("X1 = " + roots.getX1() + " ; X2 = " + roots.getX2());
		} else {
			System.out.println("X = " + roots.getX1());
		}
	}
}