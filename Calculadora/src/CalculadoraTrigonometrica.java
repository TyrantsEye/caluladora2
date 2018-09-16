import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;
import static java.lang.Math.toRadians;


public class CalculadoraTrigonometrica {
   double x;
  void radianes(double a){
      x = toRadians(a);
  }    
  double seno(){
      double resultado=sin(x);
      return resultado;
  }
  double coseno(){
      double resultado=cos(x);
      return resultado;
  }
  double tangente(){
      double resultado=tan(x);
      return resultado;
  }      
}
