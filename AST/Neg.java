package AST;

public class Neg extends ExpressionA {

public ExpressionA arg;

public Neg(ExpressionA arg) {
  this.arg = arg;
}

public String toString() {
	  return String.format("%1$s\nNegaNb", arg.toString());

}
}	
