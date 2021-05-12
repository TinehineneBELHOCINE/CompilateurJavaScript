
package AST;

public class InfEgal extends ExpressionA_Binaire {

	public InfEgal(ExpressionA gauche, ExpressionA droite) {
		super(gauche, droite);
	}

	public String symbole() {
		return "LoEqNb";
	};

}
