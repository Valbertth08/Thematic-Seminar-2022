package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.ScrollPane;
import java.awt.Point;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.DAOConexão;
import DAO.DAO_Operações;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.SystemColor;
import java.awt.Label;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;

public class FRMconsulta extends JFrame {

	private JPanel contentPane;
	private JTable TABLE2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField TXTdgcodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FRMconsulta frame = new FRMconsulta();
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
	public FRMconsulta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 495);
		contentPane =new JPanel();
		contentPane.setEnabled(false);
		contentPane.setBackground(new Color(102, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("CONSULTAR LISTA DE ALUNOS CADASTRADO");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(253, -34, 313, 76);
		lblNewLabel_1.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(null, new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0))));
		panel.setBounds(22, 285, 743, 160);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("ENDEREÇO");
		lblNewLabel_5.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setBounds(514, 11, 73, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("RESPONSAVEL ");
		lblNewLabel_6.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel_6.setForeground(new Color(0, 0, 0));
		lblNewLabel_6.setBounds(629, 11, 90, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("CPF");
		lblNewLabel_4.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setBounds(438, 11, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("IDADE");
		lblNewLabel_3.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setBounds(364, 11, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("NOME");
		lblNewLabel_2.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(268, 11, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("CODIGO");
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(93, 11, 96, 14);
		panel.add(lblNewLabel);
		
		TABLE2 = new JTable();
		TABLE2.setBackground(new Color(255, 255, 255));
		TABLE2.setForeground(new Color(0, 0, 0));
		TABLE2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID_ALUNO", "CODIGO", "SENHA", "NOME", "IDADE", "CPF", "ENDERE\u00C7O", "RESPONSAVEL"
			}
		));
		TABLE2.getColumnModel().getColumn(0).setPreferredWidth(87);
		TABLE2.getColumnModel().getColumn(2).setPreferredWidth(84);
		TABLE2.getColumnModel().getColumn(3).setPreferredWidth(127);
		TABLE2.getColumnModel().getColumn(4).setPreferredWidth(78);
		TABLE2.getColumnModel().getColumn(5).setPreferredWidth(77);
		TABLE2.getColumnModel().getColumn(6).setPreferredWidth(143);
		TABLE2.getColumnModel().getColumn(7).setPreferredWidth(139);
		TABLE2.setBounds(12, 37, 719, 123);
		panel.add(TABLE2);
		
		JLabel lblNewLabel_7 = new JLabel("SENHA");
		lblNewLabel_7.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel_7.setForeground(new Color(0, 0, 0));
		lblNewLabel_7.setBounds(176, 11, 46, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("ID_ALUNO");
		lblNewLabel_8.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel_8.setForeground(new Color(0, 0, 0));
		lblNewLabel_8.setBounds(16, 10, 73, 16);
		panel.add(lblNewLabel_8);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 58, 2, 2);
		contentPane.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		panel_1.setBorder(null);
		panel_1.setBounds(10, 47, 769, 398);
		panel_1.setBackground(new Color(240, 240, 240));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton BNTtodos = new JButton("CONSULTAR");
		BNTtodos.setFocusTraversalKeysEnabled(false);
		BNTtodos.setFocusPainted(false);
		BNTtodos.setBorder(new LineBorder(new Color(0, 0, 0)));
		BNTtodos.setBackground(new Color(51, 204, 51));
		BNTtodos.setForeground(new Color(0, 0, 0));
		BNTtodos.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		BNTtodos.setEnabled(false);
		BNTtodos.setBounds(8, 190, 110, 27);
		panel_1.add(BNTtodos);
		
		JRadioButton rbntodos = new JRadioButton("CONSULTAR TODOS ALUNOS");
		rbntodos.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		rbntodos.setVerifyInputWhenFocusTarget(false);
		rbntodos.setForeground(new Color(0, 0, 0));
		rbntodos.setBounds(8, 159, 229, 23);
		panel_1.add(rbntodos);
		buttonGroup.add(rbntodos);
		
		JButton BNTconsultaraluno = new JButton("CONSULTAR");
		BNTconsultaraluno.setFocusTraversalKeysEnabled(false);
		BNTconsultaraluno.setFocusPainted(false);
		BNTconsultaraluno.setBorder(new LineBorder(new Color(0, 0, 0)));
		BNTconsultaraluno.setForeground(Color.BLACK);
		BNTconsultaraluno.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		BNTconsultaraluno.setEnabled(false);
		BNTconsultaraluno.setBounds(8, 105, 110, 31);
		panel_1.add(BNTconsultaraluno);
		BNTconsultaraluno.setBackground(new Color(51, 204, 51));
		
		JLabel LBaluno = new JLabel("DIGITE O ID_ALUNO(A):");
		LBaluno.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		LBaluno.setEnabled(false);
		LBaluno.setBounds(12, 58, 132, 14);
		panel_1.add(LBaluno);
		
		
		JRadioButton rbnaluno = new JRadioButton("CONSULTAR ALUNO(A)");
		rbnaluno.setFocusPainted(false);
		rbnaluno.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		rbnaluno.setForeground(new Color(0, 0, 0));
		rbnaluno.setBounds(8, 27, 180, 23);
		panel_1.add(rbnaluno);
		rbnaluno.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				
			if(rbnaluno.isSelected()) {
				TXTdgcodigo.setEnabled(true);
			    TXTdgcodigo.setEditable(true);	
			    BNTconsultaraluno.setEnabled(true);
			    LBaluno.setEnabled(true);
			    BNTtodos.setEnabled(false);
			 
			    }
		
	
			}
		});
		buttonGroup.add(rbnaluno);
		
		TXTdgcodigo = new JTextField();
		TXTdgcodigo.setSelectionColor(SystemColor.scrollbar);
		TXTdgcodigo.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		TXTdgcodigo.setBackground(SystemColor.window);
		TXTdgcodigo.setEditable(false);
		TXTdgcodigo.setBounds(10, 73, 163, 20);
		panel_1.add(TXTdgcodigo);
		TXTdgcodigo.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 153, 153));
		panel_2.setBounds(8, 150, 180, 1);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\55989\\Downloads\\icons8-soccer-100.png"));
		lblNewLabel_11.setBounds(609, 22, 174, 129);
		panel_1.add(lblNewLabel_11);
		
		JButton btnNewButton_1 = new JButton("LIMPAR CAMPOS");
		btnNewButton_1.setBackground(new Color(51, 204, 0));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     TXTdgcodigo.setText("");
				((DefaultTableModel)TABLE2.getModel()).setRowCount(0);
			}
		});
		btnNewButton_1.setBounds(625, 204, 132, 26);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(476, 131, 74, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\55989\\Downloads\\icons8-search-30.png"));
		lblNewLabel_10.setBounds(218, 12, 37, 39);
		contentPane.add(lblNewLabel_10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FRMoptionprofessor.voltar();
				dispose();
			}
			
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\55989\\Downloads\\icons8-undo-26.png"));
		btnNewButton.setBackground(new Color(102, 204, 102));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(-11, -11, 69, 57);
		contentPane.add(btnNewButton);
		BNTconsultaraluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DAO_Operações.ConsultaAluno(TXTdgcodigo.getText(),TABLE2);
			
			}
			
		});
		rbntodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
		if(rbntodos.isSelected()) {
			TXTdgcodigo.setEnabled(false);
			TXTdgcodigo.setEditable(false);
			BNTconsultaraluno.setEnabled(false);
			LBaluno.setEnabled(false);
			BNTtodos.setEnabled(true);
		}
	
		}
				
		});
		BNTtodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DAO_Operações.ConsultaTodosalunos(TABLE2);
			}
		});
	}

	protected void getaluno() {
		
		
	}
}
