package AST;

// non disponible hors du package (non publique).
// Permet uniquement de factoriser le code des noeuds binaires.
abstract class ExpressionA_Binaire extends ExpressionA {
  ExpressionA gauche;
  ExpressionA droite;

  ExpressionA_Binaire (ExpressionA gauche,ExpressionA droite) {
    this.gauche = gauche;
    this.droite = droite;
  }

  abstract String symbole(); 

  public String toString() {
    return String.format("%2$s\n%3$s\n%1$s\nHalt", symbole(), gauche.toString(), droite.toString());
  }
}
