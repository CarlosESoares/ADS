package GUI;

import javax.swing.JOptionPane;

public class TesteOptionPane {
	public static void main(String[] args) {
		JOptionPane painel = new JOptionPane();
		double a = Double.valueOf(JOptionPane.showInputDialog("Digite o primeiro numero"));
		double b = Double.valueOf(JOptionPane.showInputDialog("Digite o segundo numero"));
		double c = 0;
		if (b!= 0) {
			c = a/b;
			JOptionPane.showMessageDialog(null, "A/b = " + c);
			
		}else {
			JOptionPane.showInternalMessageDialog(null, "b=0, divisao invalida ");	
		}
		
	}

}
