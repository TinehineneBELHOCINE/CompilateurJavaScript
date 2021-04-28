package AST;

public class Boole extends ExpressionA {
	public boolean boole;

	public Boole(boolean boole) {
		this.boole = boole;
	}

	public String toString() {
		return Boolean.toString(boole);
	}

}
