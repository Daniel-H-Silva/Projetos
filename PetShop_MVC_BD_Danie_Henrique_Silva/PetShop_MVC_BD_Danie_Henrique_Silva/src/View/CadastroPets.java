package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import java.awt.Choice;
import javax.swing.JButton;

public class CadastroPets extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPets frame = new CadastroPets();
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
	public CadastroPets() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Cão", "Gato", "Passaro"}));
		comboBox.setBounds(129, 160, 121, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("CADASTRO DE PETS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNewLabel.setBounds(177, 10, 163, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOME:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 45, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(66, 42, 147, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("IDADE:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(248, 45, 56, 13);
		contentPane.add(lblNewLabel_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Arial", Font.PLAIN, 13));
		spinner.setBounds(308, 41, 45, 20);
		contentPane.add(spinner);
		
		JLabel lblNewLabel_3 = new JLabel("COR:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(10, 86, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 83, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("SEXO:");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(248, 86, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "M", "F"}));
		comboBox_1.setFont(new Font("Arial", Font.PLAIN, 13));
		comboBox_1.setBounds(309, 82, 56, 21);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_5 = new JLabel("RAÇA:");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(10, 124, 45, 13);
		contentPane.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(66, 121, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("TIPO DE ANIMAL:");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(10, 164, 114, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("PASSARO");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(89, 201, 73, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("CÃO/GATO");
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_7_1.setBounds(335, 201, 73, 13);
		contentPane.add(lblNewLabel_7_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(89, 247, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("NINHADA:");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(10, 250, 73, 13);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("PORTE:");
		lblNewLabel_8_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_8_1.setBounds(256, 250, 73, 13);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_2 = new JLabel("PESO:");
		lblNewLabel_8_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_8_2.setBounds(256, 304, 73, 13);
		contentPane.add(lblNewLabel_8_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(335, 247, 96, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(335, 301, 96, 19);
		contentPane.add(textField_5);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton.setBounds(190, 350, 139, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_9 = new JLabel("ID DO PROPRIETARIO:");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_9.setBounds(248, 124, 147, 13);
		contentPane.add(lblNewLabel_9);
		
		textField_6 = new JTextField();
		textField_6.setBounds(390, 121, 56, 19);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
	}
}
