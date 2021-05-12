package AST;

public class Var extends ExpressionA {
  public String var;
    
  public Var (String var) {
    this.var = var;
  }
  
  public String toString() {
    return "CsteStr "+var;
  }

}
