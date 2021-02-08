import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Santander {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Santander window = new Santander();
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
	public Santander() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setResizable(false);
		frame.setBounds(100, 100, 411, 207);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInforme = new JLabel("Informe a Op\u00E7\u00E3o Desejada");
		lblInforme.setHorizontalAlignment(SwingConstants.CENTER);
		lblInforme.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblInforme.setBounds(54, 43, 313, 23);
		frame.getContentPane().add(lblInforme);
		
		JButton btnCadastrar_Agencias = new JButton("Cadastrar Ag\u00EAncias");
		btnCadastrar_Agencias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Colocar aqui o código que gera todas as agências desta conta
				
			}
		});
		btnCadastrar_Agencias.setBounds(136, 109, 137, 23);
		frame.getContentPane().add(btnCadastrar_Agencias);
		
		JButton btnCadastrar_Contas = new JButton("Cadastrar Contas");
		btnCadastrar_Contas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		btnCadastrar_Contas.setBounds(136, 143, 137, 23);
		frame.getContentPane().add(btnCadastrar_Contas);
	}

}
