import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Realizar_Tranferencia {

	JFrame frame;
	private JTextField tfTransferencia;
	private JTextField tfValor_Transferido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Realizar_Tranferencia window = new Realizar_Tranferencia();
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
	public Realizar_Tranferencia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 434, 245);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTranferencia_Pix = new JLabel("\u00C0rea de Transfer\u00EAncia Pix");
		lblTranferencia_Pix.setHorizontalAlignment(SwingConstants.CENTER);
		lblTranferencia_Pix.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTranferencia_Pix.setBounds(28, 32, 354, 28);
		frame.getContentPane().add(lblTranferencia_Pix);
		
		JLabel lblNewLabel = new JLabel("Informe o Pix para Transfer\u00EAncia:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(28, 97, 200, 28);
		frame.getContentPane().add(lblNewLabel);
		
		tfTransferencia = new JTextField();
		tfTransferencia.setBounds(238, 102, 170, 20);
		frame.getContentPane().add(tfTransferencia);
		tfTransferencia.setColumns(10);
		
		JButton btnNewButton = new JButton("Prosseguir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Informar aqui todo conteudo de transferencia pix
				
				String pix = tfTransferencia.getText().toUpperCase().trim();
				double valor_transferido = Integer.parseInt(tfValor_Transferido.getText());
				
				
				
			}
		});
		btnNewButton.setBounds(319, 175, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Informe o Valor a ser Transferido:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(28, 134, 200, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfValor_Transferido = new JTextField();
		tfValor_Transferido.setBounds(238, 133, 170, 20);
		frame.getContentPane().add(tfValor_Transferido);
		tfValor_Transferido.setColumns(10);
	}

}
