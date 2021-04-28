package AST;

public class Floa extends ExpressionA {
  public float floa;
    
  public Floa(float floa) {
    this.floa = floa;
  }
  
  public String toString() {
    return "CsteNb "+floa;
  }

}
