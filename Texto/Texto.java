import javax.swing.*;
import java.awt.event.*;

public class Texto extends JFrame implements ActionListener{
  private JTextField text1;
  private JLabel label1;
  private JButton boton1;

  public Texto(){
    setLayout(null);
    
    label1 = new JLabel("Usuario:");
    label1.setBounds(10, 10, 100, 30);
    add(label1);

    text1 = new JTextField();
    text1.setBounds(120, 17, 150, 20);
    add(text1);

    boton1 = new JButton("Aceptar");
    boton1.setBounds(10, 80, 100, 30);
    add(boton1);
    boton1.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      String texto = text1.getText();
      setTitle(texto);
    }
  }

  public static void main (String arg[]){
    Texto texto1 = new Texto();
    texto1.setBounds(0, 0, 300, 150);
    texto1.setVisible(true);
    texto1.setResizable(false);
    texto1.setLocationRelativeTo(null);
  }
}