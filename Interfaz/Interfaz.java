import javax.swing.*;

public class Interfaz extends JFrame{
  private JLabel label1;
  private JLabel label2;

  public Interfaz(){
    setLayout(null);

    label1 = new JLabel("Hola mundo");
    label1.setBounds(10, 20, 300, 30);
    add(label1);

    label2 = new JLabel("Mi nombre es Carlos Medina");
    label2.setBounds(10, 100, 300, 30);
    add(label2);
  }

  public static void main (String args[]){
    Interfaz interfaz1 = new Interfaz();
    interfaz1.setBounds(0, 0, 300, 200);
    interfaz1.setVisible(true);
    interfaz1.setLocationRelativeTo(null);
    interfaz1.setResizable(false);
  }
}