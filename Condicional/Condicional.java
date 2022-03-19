public class Condicional{
  public static void main (String args[]){
    int mat = 5;
    int bio = 3;
    int qui = 7;
    int prom = 0;

    prom = (mat + bio + qui) / 3;
    if (prom>=6){
      System.out.println("El estudiante aprobo");
    } else {
      System.out.println("El estudiante reprobo");
    }
  }
}