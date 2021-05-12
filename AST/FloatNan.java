package AST;

public class FloatNan extends ExpressionA {
  public float floa;
    
  public FloatNan(float floa) {
    this.floa = floa;
  }
  
  public String toString() {
    return "CsteNan "+floa;
  }

}
