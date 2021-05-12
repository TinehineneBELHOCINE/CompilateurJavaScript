package AST;

public class NOT extends ExpressionA {

public ExpressionA arg;

public NOT(ExpressionA arg) {
  this.arg = arg;
}

public String toString() {
	  return String.format("%1$s\nNot", arg.toString());

}
}	
