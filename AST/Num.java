package AST;

public class Num extends ExpressionA {
  public int num;
    
  public Num(int num) {
    this.num = num;
  }
  
  public String toString() {
    return "CsteNb "+num;
  }

}
