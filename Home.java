package Atv1;

import javax.swing.JOptionPane;

public class Home {
    public static void main(String[] args) {
      
     notas ler = new notas();
     String nome =  JOptionPane.showInputDialog("Informe o nome:");
      double n1 =  Double.parseDouble(JOptionPane.showInputDialog("Qual é sua nota 1:"));
       double n2 =  Double.parseDouble(JOptionPane.showInputDialog("Qual é sua nota 2:"));
        double n3 =  Double.parseDouble(JOptionPane.showInputDialog("Qual é sua nota 3:"));
        double resultado = ler.media(n1, n2, n3);
        JOptionPane.showMessageDialog(null, "============================\n"
                + "Seu nome é: "+nome
                + "\nSua 1° nota foi: "+n1
                + "\nSua 2° nota foi: "+n2
                + "\nSua 3° nota foi: "+n3
                + "\nE a sua media é: "+resultado
                + "\n============================");
    }  
}
