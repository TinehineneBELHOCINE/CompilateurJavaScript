
package AST;

public class SupEgal extends ExpressionA_Binaire {

	public SupEgal(ExpressionA gauche, ExpressionA droite) {
		super(gauche, droite);
	}

	public String symbole() {
		return "GrEqNb";
	};

}
