import javax.swing.*;
class atividade{
    public static void main (String entrada[]){
        int n1, n2, div;
        double pot;
        String msg= "";
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Outro numero inteiro: "));
        div = (int)n1 / (int)n2;
        pot = Math.pow(n1, n2);
        msg = msg + "O Quociente da divisão de: " + n1 + "Por: " + n2 + " = " + div + "\n";
        msg = msg + "A Potencia de: " + n1 + "Por: " + n2 + " = " + pot + "\n";
        JOptionPane.showMessageDialog(null, msg);
    }
}