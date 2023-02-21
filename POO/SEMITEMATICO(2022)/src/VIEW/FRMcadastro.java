package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.DAOConexão;
import DAO.DAO_Operações;
import DTO.DTOaluno;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;

public class FRMcadastro extends JFrame {

	protected static final String Intenger = null;
	private JPanel contentPane;
	private JTable table;
	private JTextField TXTnomealuno;
	private JTextField TXTidadealuno;
	private JTextField TXTcpfaluno;
	private JTextField TXTendereçoaluno;
	private JTextField TXTresponsavelaluno;
	private JTextField TXTcodigo;
	private JTextField TXTsenha;
	private JPanel panel;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FRMcadastro frame = new FRMcadastro();
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
	public FRMcadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 483);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CADASTRO DO ALUNO");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel.setBounds(157, 2, 171, 25);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(155, 121, 1, 1);
		contentPane.add(table);
		
		panel = new JPanel();
		panel.setBounds(20, 36, 401, 395);
		contentPane.add(panel);
		panel.setLayout(null);
		
		TXTcodigo = new JTextField();
		TXTcodigo.setBounds(184, 11, 171, 20);
		panel.add(TXTcodigo);
		TXTcodigo.setBackground(new Color(255, 255, 255));
		TXTcodigo.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("CRIAR CÓDIGO DO ALUNO(A):");
		lblNewLabel_5.setBounds(10, 14, 164, 14);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		
		TXTsenha = new JTextField();
		TXTsenha.setBounds(66, 49, 124, 20);
		panel.add(TXTsenha);
		TXTsenha.setBackground(new Color(255, 255, 255));
		TXTsenha.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("SENHA: ");
		lblNewLabel_6.setBounds(10, 52, 46, 14);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		lblNewLabel_6.setForeground(new Color(0, 0, 0));
		
		TXTnomealuno = new JTextField();
		TXTnomealuno.setBounds(56, 93, 230, 20);
		panel.add(TXTnomealuno);
		TXTnomealuno.setBackground(new Color(255, 255, 255));
		TXTnomealuno.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NOME:");
		lblNewLabel_1.setBounds(10, 96, 46, 14);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		
		TXTidadealuno = new JTextField();
		TXTidadealuno.setBounds(63, 137, 46, 20);
		panel.add(TXTidadealuno);
		TXTidadealuno.setBackground(new Color(255, 255, 255));
		TXTidadealuno.setColumns(10);
		
		JLabel lblIdade = new JLabel("IDADE:");
		lblIdade.setBounds(10, 140, 46, 14);
		panel.add(lblIdade);
		lblIdade.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		lblIdade.setForeground(new Color(0, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("CPF:");
		lblNewLabel_2.setBounds(10, 183, 46, 14);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("ENDEREÇO:");
		lblNewLabel_3.setBounds(10, 228, 77, 14);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		
		TXTresponsavelaluno = new JTextField();
		TXTresponsavelaluno.setBounds(152, 283, 212, 20);
		panel.add(TXTresponsavelaluno);
		TXTresponsavelaluno.setBackground(new Color(255, 255, 255));
		TXTresponsavelaluno.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("NOME DO RESPONSÁVEL:");
		lblNewLabel_4.setBounds(10, 286, 146, 14);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		
		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(10, 342, 89, 23);
		panel.add(btnNewButton);
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNewButton.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(245, 255, 250));
		btnNewButton.setBackground(new Color(0, 153, 0));
		
		JButton btnNewButton_2 = new JButton("LIMPAR");
		btnNewButton_2.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBorder(new CompoundBorder(null, new LineBorder(new Color(0, 0, 0))));
		btnNewButton_2.setFocusTraversalKeysEnabled(false);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setBackground(new Color(0, 153, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TXTcodigo.setText("");
				TXTsenha.setText("");
				TXTnomealuno.setText("");
				TXTidadealuno.setText("");
				TXTcpfaluno.setText("");
				TXTendereçoaluno.setText("");
				TXTresponsavelaluno.setText("");
			
			}
		});
		btnNewButton_2.setBounds(283, 342, 89, 23);
		panel.add(btnNewButton_2);
		
		TXTendereçoaluno = new JTextField();
		TXTendereçoaluno.setBounds(76, 225, 266, 20);
		panel.add(TXTendereçoaluno);
		TXTendereçoaluno.setBackground(new Color(255, 255, 255));
		TXTendereçoaluno.setColumns(10);
		
		TXTcpfaluno = new JTextField();
		TXTcpfaluno.setBounds(42, 180, 133, 20);
		panel.add(TXTcpfaluno);
		TXTcpfaluno.setBackground(new Color(255, 255, 255));
		TXTcpfaluno.setColumns(10);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FRMoptionprofessor.voltar();
				dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\55989\\Downloads\\icons8-undo-26.png"));
		btnNewButton_1.setBackground(new Color(102, 204, 102));
		btnNewButton_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(-12, 2, 64, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			DAO_Operações.Cadastro(Integer.parseInt(TXTcodigo.getText()),Integer.parseInt(TXTsenha.getText()),TXTnomealuno.getText(), Integer.parseInt(TXTidadealuno.getText()),
						Integer.parseInt(TXTcpfaluno.getText()),TXTendereçoaluno.getText(),TXTresponsavelaluno.getText());
			}
			
		});
	
	}
	}
