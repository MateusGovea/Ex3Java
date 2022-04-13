package Q1;

import javax.swing.JOptionPane;
import Q1.ValidarCpf;

public class Main {

	public static void main(String[] args) {
		String cpf, nome;
		
		nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		cpf = JOptionPane.showInputDialog("Digite o seu cpf: ");
		
        if (ValidarCpf.isCPF(cpf) == true)
        	JOptionPane.showMessageDialog(null, "CPF Válido: " + ValidarCpf.imprimeCPF(cpf));
        else
        	JOptionPane.showMessageDialog(null, "CPF inválido");
	}

}
