public class Operaciones{
  public static void main (String args[]){
    int var1 = 5, var2 = 3, resultado = 0;
    int parametro = 2;
    
    switch(parametro){
      case 1: resultado = var1 + var2;
              System.out.println("El resultado de la suma es " + resultado);
              break;
      case 2: resultado = var1 - var2;
              System.out.println("El resultado de la resta es " + resultado);
              break;
      case 3: resultado = var1 * var2;
              System.out.println("El resultado de la multiplicacion es " + resultado);
              break;
      case 4: resultado = var1 / var2;
              System.out.println("El resultado de la division es " + resultado);
              break;
      default: System.out.println("Error, la pcion no existe");
    }
  }
}