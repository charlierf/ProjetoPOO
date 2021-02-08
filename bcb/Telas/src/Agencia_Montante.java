import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Agencia_Montante {

	JFrame frame;
	private JTextField tfAgencia_Montante;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agencia_Montante window = new Agencia_Montante();
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
	public Agencia_Montante() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setResizable(false);
		frame.setBounds(100, 100, 395, 206);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informe a Ag\u00EAncia");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(74, 37, 242, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Informe Aqui:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(38, 108, 101, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfAgencia_Montante = new JTextField();
		tfAgencia_Montante.setBounds(149, 112, 149, 20);
		frame.getContentPane().add(tfAgencia_Montante);
		tfAgencia_Montante.setColumns(10);
		
		JButton btnFinalizar_Montante = new JButton("Finalizar");
		btnFinalizar_Montante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Agencia_Montante = tfAgencia_Montante.getText().toUpperCase().trim();
				
				Teste_Leve window = new Teste_Leve();
				window.frame.setVisible(true);
				
				
				
			}
		});
		btnFinalizar_Montante.setBounds(290, 143, 89, 23);
		frame.getContentPane().add(btnFinalizar_Montante);
	}

}
