package AST;

public class Affectation extends ExpressionA {
	public String var;
	public ExpressionA exp;
	 private String aff;

	public Affectation(String var,String aff, ExpressionA exp) {

		this.var = var;
		this.aff = aff;
		this.exp = exp;
	}

	public String toString() {
		// const 2
		// setVar x;
		return String.format("%1$s\n setVar %3$s", exp.toString(), aff.toString(), var.toString());

	}

}
