package net.gustavodias.quadraticequation;

public class Roots {
	private Root x1, x2;
	private int rootsCount;
	
	public void addRoot(Root root) throws UnsupportedOperationException {
		if (x1 == null)
			x1 = root;
		else if (x2 == null)
			x2 = root;
		else
			throw new UnsupportedOperationException("Just 2 roots maximum supported!");
		rootsCount++;
	}
	
	public Root getX1() {
		return this.x1;
	}
	
	public Root getX2() {
		return this.x2;
	}
	
	public int getRootsCount() {
		return this.rootsCount;
	}
	
	@Override
	public String toString() {
		if (rootsCount == 0) {
			return "[]";
		} else if (rootsCount == 1) {
			return "[X = " + x1 + "]";
		} else {
			return "[X1 = " + x1 + ", X2 = " + x2 + "]";
		}
	}
}