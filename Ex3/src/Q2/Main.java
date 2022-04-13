package Q2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField txtVoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("20 - MARIA");
		lblNewLabel.setBounds(73, 38, 65, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("30 - PEDRO");
		lblNewLabel_1.setBounds(73, 73, 65, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1 - NULO");
		lblNewLabel_2.setBounds(73, 115, 65, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2 - BRANCO");
		lblNewLabel_3.setBounds(73, 150, 65, 14);
		contentPane.add(lblNewLabel_3);
		
		txtVoto = new JTextField();
		txtVoto.setBounds(162, 202, 103, 27);
		contentPane.add(txtVoto);
		txtVoto.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Seu Voto");
		lblNewLabel_4.setBounds(73, 208, 65, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnVotar = new JButton("VOTAR");
		btnVotar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int vMaria = 0, vPedro = 0, totalVotos = 0, vBranco = 0, vNulo = 0;
				int voto = Integer.parseInt(txtVoto.getText());
				double perVit, perBranco = 0, perNulo = 0; 
				switch(voto){
					case 20:
						vMaria++;
						totalVotos++;
						break;
					case 30:
						vPedro++;
						totalVotos++;
						break;
					case 1:
						vNulo++;
						totalVotos++;
						perNulo = (vNulo/totalVotos) * 100;
						break;
					case 2:
						vBranco++;
						totalVotos++;
						perBranco = (vBranco/totalVotos) * 100;
						break;
					default:
						
						break;
				}
				if (vMaria > vPedro) {
					perVit = (vMaria / totalVotos) * 100; 
					JOptionPane.showMessageDialog(null,"Maria venceu com " + perVit );
					
				}
				if (vMaria < vPedro) {
					perVit = (vPedro / totalVotos) * 100; 
					JOptionPane.showMessageDialog(null,"Pedro venceu com " + perVit );
					
				}
				JOptionPane.showMessageDialog(null,"Porcentagem de votos brancos: " + perBranco );
				JOptionPane.showMessageDialog(null,"Porcentagem de votos nulos: " + perNulo );
				JOptionPane.showMessageDialog(null,"Número total de votos:" + totalVotos );
			}
		});
		btnVotar.setBackground(Color.GREEN);
		btnVotar.setForeground(Color.BLACK);
		btnVotar.setBounds(102, 264, 122, 23);
		contentPane.add(btnVotar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Fechando o programa");
				System.exit(0);
			}
		});
		btnCancelar.setBackground(Color.RED);
		btnCancelar.setBounds(268, 264, 122, 23);
		contentPane.add(btnCancelar);
	}
}
