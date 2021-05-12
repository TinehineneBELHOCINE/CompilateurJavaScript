
package AST;

public class NotEqual extends ExpressionA_Binaire {

	public NotEqual(ExpressionA gauche, ExpressionA droite) {
		super(gauche, droite);
	}

	public String symbole() {
		return "NotEql";
	};

}
