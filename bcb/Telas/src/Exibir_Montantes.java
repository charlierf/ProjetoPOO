import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exibir_Montantes {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exibir_Montantes window = new Exibir_Montantes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exibir_Montantes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 255);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escolha a Op\u00E7\u00E3o Desejada");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(43, 38, 358, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Exibir Montante Aplicado em um Banco");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Bancos window = new Bancos();
				window.frame.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(101, 107, 225, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnExibirMontanteAplicado = new JButton("Exibir Montante Aplicado em Dinheiro Aplicado a Ag\u00EAncia");
		btnExibirMontanteAplicado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Agencia_Montante window = new Agencia_Montante();
				window.frame.setVisible(true);
				
			}
		});
		btnExibirMontanteAplicado.setBounds(57, 153, 313, 35);
		frame.getContentPane().add(btnExibirMontanteAplicado);
	}

}
