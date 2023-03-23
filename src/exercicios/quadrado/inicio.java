package exercicios.quadrado;

import javax.swing.JOptionPane;

public class inicio {
    
    public static void main(string[] args){
        Quadrado quadrado = new Quadrado();

        quadrado.setLado(Float.parseFloat(JOptionPane.showInputDialog(null, "Qual é o tamnho do lado")));

        JOptionPane.showMessageDialog(null, ""
         + "tamanho do lado " + quadrado.getLado() + "/n"
         + "Area do quadrado:" + quadrado.calcularArea() + "/n");
    }
}
