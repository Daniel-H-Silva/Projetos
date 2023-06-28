package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("CADASTRO DE PROPRIETARIO");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(119, 30, 222, 38);
		contentPane.add(btnNewButton);
		
		JButton btnCadastroDePets = new JButton("CADASTRO DE PETS");
		btnCadastroDePets.setBackground(new Color(192, 192, 192));
		btnCadastroDePets.setFont(new Font("Arial", Font.PLAIN, 13));
		btnCadastroDePets.setBounds(119, 99, 222, 38);
		contentPane.add(btnCadastroDePets);
		
		JButton btnConsultarProprietario = new JButton("CONSULTAR PROPRIETARIO");
		btnConsultarProprietario.setBackground(new Color(192, 192, 192));
		btnConsultarProprietario.setFont(new Font("Arial", Font.PLAIN, 13));
		btnConsultarProprietario.setBounds(119, 160, 222, 38);
		contentPane.add(btnConsultarProprietario);
		
		JButton btnConsultarPet = new JButton("CONSULTAR PET");
		btnConsultarPet.setBackground(new Color(192, 192, 192));
		btnConsultarPet.setFont(new Font("Arial", Font.PLAIN, 13));
		btnConsultarPet.setBounds(119, 222, 222, 38);
		contentPane.add(btnConsultarPet);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.setBackground(new Color(128, 64, 0));
		btnSair.setFont(new Font("Arial", Font.PLAIN, 13));
		btnSair.setBounds(175, 287, 119, 38);
		contentPane.add(btnSair);
	}
}
