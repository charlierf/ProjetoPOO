import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Saque {

	JFrame frame;
	private JTextField tfSaque;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Saque window = new Saque();
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
	public Saque() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 144);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informe a Quantidade desejada:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(35, 49, 236, 32);
		frame.getContentPane().add(lblNewLabel);
		
		tfSaque = new JTextField();
		tfSaque.setBounds(271, 57, 106, 20);
		frame.getContentPane().add(tfSaque);
		tfSaque.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Colocar aqui a operação do Saque
				
				double valor = Integer.parseInt(tfSaque.getText());
				
				
			}
		});
		btnNewButton.setBounds(355, 88, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
