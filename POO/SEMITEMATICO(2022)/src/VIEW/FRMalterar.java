package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.DAO_Operações;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.ScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class FRMalterar extends JFrame {

	private JPanel contentPane;
	private JTextField ALidaluno;
	private JTextField ALsenha;
	private JTextField ALnome;
	private JTextField ALidade;
	private JTextField ALcpf;
	private JTextField ALed;
	private JTextField ALresponsavel;
	private JTextField TXTusuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FRMalterar frame = new FRMalterar();
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
	public FRMalterar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 438);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 102));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ALTERAR ALUNO");
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel.setBounds(206, 11, 120, 14);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(204, 204, 204));
		panel.setBounds(70, 59, 373, 309);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("ALTERAR NOME:");
		lblNewLabel_2.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(10, 80, 95, 14);
		panel.add(lblNewLabel_2);
		
		ALsenha = new JTextField();
		ALsenha.setBounds(211, 36, 135, 20);
		panel.add(ALsenha);
		ALsenha.setColumns(10);
		
		ALnome = new JTextField();
		ALnome.setBounds(10, 105, 152, 20);
		panel.add(ALnome);
		ALnome.setColumns(10);
		
		ALidade = new JTextField();
		ALidade.setBounds(211, 105, 46, 20);
		panel.add(ALidade);
		ALidade.setColumns(10);
		
		ALcpf = new JTextField();
		ALcpf.setBounds(10, 178, 152, 20);
		panel.add(ALcpf);
		ALcpf.setColumns(10);
		
		ALed = new JTextField();
		ALed.setBounds(211, 171, 152, 20);
		panel.add(ALed);
		ALed.setColumns(10);
		
		ALresponsavel = new JTextField();
		ALresponsavel.setBounds(211, 242, 152, 20);
		panel.add(ALresponsavel);
		ALresponsavel.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("NOVA SENHA:");
		lblNewLabel_3.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setBounds(211, 11, 95, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ALTERAR  IDADE:");
		lblNewLabel_4.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setBounds(211, 80, 109, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("NOVO CPF:");
		lblNewLabel_6.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		lblNewLabel_6.setForeground(new Color(0, 0, 0));
		lblNewLabel_6.setBounds(10, 159, 67, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("NOVO ENDEREÇO:");
		lblNewLabel_7.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		lblNewLabel_7.setForeground(new Color(0, 0, 0));
		lblNewLabel_7.setBounds(211, 148, 109, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("ALTERAR RESPONSÁVEL:");
		lblNewLabel_8.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		lblNewLabel_8.setForeground(new Color(0, 0, 0));
		lblNewLabel_8.setBounds(211, 217, 152, 14);
		panel.add(lblNewLabel_8);
		
		JButton BNTalter = new JButton("ALTERAR");
		BNTalter.setFocusPainted(false);
		BNTalter.setFocusTraversalKeysEnabled(false);
		BNTalter.setBackground(new Color(0, 153, 0));
		BNTalter.setForeground(new Color(255, 255, 255));
		BNTalter.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		BNTalter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DAO_Operações.Alterar(ALnome.getText(), Integer.parseInt(ALsenha.getText()), Integer.parseInt(ALidade.getText()), Integer.parseInt(ALcpf.getText()),ALed.getText(),
						ALresponsavel.getText(),Integer.parseInt (ALidaluno.getText()),TXTusuario.getText());
				
			}
		});
		BNTalter.setBounds(10, 278, 89, 23);
		panel.add(BNTalter);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 102, 102));
		panel_1.setBounds(184, 11, 1, 287);
		panel.add(panel_1);
		
		JLabel lblNewLabel_5 = new JLabel("NOVO CÓDIGO:");
		lblNewLabel_5.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 11, 95, 14);
		panel.add(lblNewLabel_5);
		
		TXTusuario = new JTextField();
		TXTusuario.setBounds(10, 37, 152, 20);
		panel.add(TXTusuario);
		TXTusuario.setColumns(10);
		
		JButton LIMPAR = new JButton("LIMPAR");
		LIMPAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ALidaluno.setText("");
				TXTusuario.setText("");
				ALnome.setText("");
				ALcpf.setText("");
				ALsenha.setText("");
				ALidade.setText("");
				ALed.setText("");
				ALresponsavel.setText("");
				
			}
		});
		LIMPAR.setBackground(new Color(0, 153, 0));
		LIMPAR.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		LIMPAR.setFocusTraversalKeysEnabled(false);
		LIMPAR.setFocusPainted(false);
		LIMPAR.setForeground(Color.WHITE);
		LIMPAR.setBounds(274, 278, 89, 23);
		panel.add(LIMPAR);
		
		JLabel lblNewLabel_1 = new JLabel("INSIRA O ID_ALUNO:");
		lblNewLabel_1.setBounds(70, 39, 109, 14);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		
		ALidaluno = new JTextField();
		ALidaluno.setBounds(184, 36, 152, 20);
		contentPane.add(ALidaluno);
		ALidaluno.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(102, 204, 102));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FRMoptionprofessor.voltar();
				dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\55989\\Downloads\\icons8-undo-26.png"));
		btnNewButton.setBounds(10, 11, 34, 23);
		contentPane.add(btnNewButton);
	}
}
