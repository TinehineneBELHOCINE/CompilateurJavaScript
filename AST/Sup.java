
package AST;

public class Sup extends ExpressionA_Binaire {

	public Sup(ExpressionA gauche, ExpressionA droite) {
		super(gauche, droite);
	}

	public String symbole() {
		return "GrStNb";
	};

}
