import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Deposito {

	 JFrame frame;
	private JTextField tfDeposito;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deposito window = new Deposito();
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
	public Deposito() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDeposito_Aqui = new JLabel("Fa\u00E7a aqui seu Deposito");
		lblDeposito_Aqui.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeposito_Aqui.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDeposito_Aqui.setBounds(59, 47, 310, 37);
		frame.getContentPane().add(lblDeposito_Aqui);
		
		JLabel lblNewLabel = new JLabel("Insira o Valor do Deposito:");
		lblNewLabel.setBounds(59, 131, 133, 25);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		tfDeposito = new JTextField();
		tfDeposito.setBounds(202, 133, 113, 20);
		frame.getContentPane().add(tfDeposito);
		tfDeposito.setColumns(10);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Aqui ta o valor que o usuario esta passando para depositar
				
				double valor = Integer.parseInt(tfDeposito.getText());
				
				//Prosseguir com o deposito
			}
		});
		btnFinalizar.setBounds(346, 225, 78, 25);
		frame.getContentPane().add(btnFinalizar);
	}
}
