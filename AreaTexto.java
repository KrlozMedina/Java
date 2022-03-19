import javax.swing.*;

public class AreaTexto extends JFrame{
  private JTextField textfield1;
  private JTextArea textarea1;

  public AreaTexto(){
    setLayout(null);

    textfield1 = new JTextField();
    textfield1.setBounds(10, 10, 200, 30);
    add(textfield1);

    textarea1 = new JTextArea();
    textarea1.setBounds(10, 50, 400, 300);
    add(textarea1);
  }

  public static void main(String args[]){
    AreaTexto areatexto1 = new AreaTexto();
    areatexto1.setBounds(0, 0, 540, 400);
    areatexto1.setVisible(true);
    areatexto1.setResizable(false);
    areatexto1. setLocationRelativeTo(null);
  }
}