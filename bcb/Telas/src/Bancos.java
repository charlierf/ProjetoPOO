import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bancos {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bancos window = new Bancos();
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
	public Bancos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escolha o Banco Desejado");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(71, 38, 290, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnItau = new JButton("ITA\u00DA");
		btnItau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Exibir aqui o Montante aplicado aos bancos do Itaú
				
				
			}
		});
		btnItau.setBounds(27, 114, 124, 42);
		frame.getContentPane().add(btnItau);
		
		JButton btnSantander = new JButton("SANTANDER");
		btnSantander.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Exibir aqui o Montante aplicado aos bancos do Santander
				
			}
		});
		btnSantander.setBounds(27, 192, 124, 42);
		frame.getContentPane().add(btnSantander);
		
		JButton btnBradesco = new JButton("BRADESCO");
		btnBradesco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Exibir aqui o Montante aplicado aos bancos do Bradesco
				
			}
		});
		btnBradesco.setBounds(293, 114, 124, 42);
		frame.getContentPane().add(btnBradesco);
		
		JButton btnCaixa = new JButton("CAIXA");
		btnCaixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Exibir aqui o Montante aplicado aos bancos da caixa
				
			}
		});
		btnCaixa.setBounds(293, 192, 124, 42);
		frame.getContentPane().add(btnCaixa);
	}

}
