import java.util.Scanner;

public class Caracteres{
  public static void main (String args[]){
    Scanner dato = new Scanner(System.in);
    String usuario = "", pass = "", alias = "";
    int num_carac = 0, desde = 0, hasta = 0;
    
    System.out.print("Ingresar tu usuario: ");
    usuario = dato.nextLine();
    
    System.out.print("Ingresar la contraseña: ");
    pass = dato.nextLine();

    if (usuario.equalsIgnoreCase("Carlos") && pass.equals("Krloz1234")){
      System.out.println("Acceso concedido");      
    } else {
      System.out.println("Datos incorecctos");
    }

    num_carac = usuario.length();
    System.out.println(usuario + " tiene " + num_carac + " caracteres");
    
    System.out.print("Recortar el ususario desde: ");
    desde = dato.nextInt();
    
    System.out.print("hasta: ");
    hasta = dato.nextInt();
    
    alias = usuario.substring(desde, hasta);
    System.out.println(usuario + " tiene " + num_carac + " caracteres, te diremos " + alias);
  }
}