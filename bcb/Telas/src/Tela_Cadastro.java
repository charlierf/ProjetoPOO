import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_Cadastro {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Cadastro window = new Tela_Cadastro();
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
	public Tela_Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 257);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblOpcao_Cadastro = new JLabel("Escolha o Banco Desejado");
		lblOpcao_Cadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpcao_Cadastro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblOpcao_Cadastro.setBounds(37, 21, 364, 43);
		frame.getContentPane().add(lblOpcao_Cadastro);
		
		JButton btnCadastro_Itau = new JButton("ITA\u00DA");
		btnCadastro_Itau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Itau window = new Itau();
				window.frame.setVisible(true);
				
			}
		});
		btnCadastro_Itau.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCadastro_Itau.setBounds(26, 75, 147, 43);
		frame.getContentPane().add(btnCadastro_Itau);
		
		JButton btnCadastro_Santander = new JButton("SANTANDER");
		btnCadastro_Santander.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Santander window = new Santander();
				window.frame.setVisible(true);
				
			}
		});
		btnCadastro_Santander.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCadastro_Santander.setBounds(26, 171, 147, 43);
		frame.getContentPane().add(btnCadastro_Santander);
		
		JButton btnCadastro_Bradesco = new JButton("BRADESCO");
		btnCadastro_Bradesco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Bradesco window = new Bradesco();
				window.frame.setVisible(true);
				
			}
		});
		btnCadastro_Bradesco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCadastro_Bradesco.setBounds(254, 75, 147, 43);
		frame.getContentPane().add(btnCadastro_Bradesco);
		
		JButton btnCadastro_Caixa = new JButton("CAIXA");
		btnCadastro_Caixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Caixa window = new Caixa();
				window.frame.setVisible(true);
				
			}
		});
		btnCadastro_Caixa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCadastro_Caixa.setBounds(254, 171, 147, 43);
		frame.getContentPane().add(btnCadastro_Caixa);
	}

}
