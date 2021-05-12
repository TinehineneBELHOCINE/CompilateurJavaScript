
package AST;

public class Inf extends ExpressionA_Binaire {

	public Inf(ExpressionA gauche, ExpressionA droite) {
		super(gauche, droite);
	}

	public String symbole() {
		return "LoStNb";
	};

}
