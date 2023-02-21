package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import java.awt.Canvas;

public class FRMoptionprofessor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FRMoptionprofessor frame = new FRMoptionprofessor();
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
	public FRMoptionprofessor() {
		setFocusCycleRoot(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 418, 300);
		contentPane = new JPanel();
		contentPane.setFocusCycleRoot(true);
		contentPane.setBackground(new Color(102, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ESCOLHA A OPERAÇÃO DESEJADA\r\n");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 13));
		lblNewLabel.setBackground(new Color(245, 255, 250));
		lblNewLabel.setBounds(106, 11, 213, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cadastrar Aluno");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusCycleRoot(true);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\55989\\Downloads\\icons8-add-new-24.png"));
		btnNewButton.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FRMcadastro novoaluno = new FRMcadastro();
				novoaluno.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(12, 80, 182, 57);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Consultar Aluno");
		btnNewButton_1.setFocusCycleRoot(true);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setSelected(true);
		btnNewButton_1.setBorder(new CompoundBorder(null, new CompoundBorder(null, new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)))));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\55989\\Downloads\\icons8-edit-file-24.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FRMconsulta consultar= new FRMconsulta();
				consultar.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(204, 80, 182, 56);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Alterar Aluno");
		btnNewButton_2.setFocusCycleRoot(true);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setBorder(new CompoundBorder(null, new CompoundBorder(null, new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)))));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\55989\\Downloads\\icons8-todo-list-24.png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FRMalterar alterar= new FRMalterar();
				alterar.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(12, 148, 182, 57);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Excluir Aluno");
		btnNewButton_3.setFocusCycleRoot(true);
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setBorder(new CompoundBorder(null, new CompoundBorder(null, new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)))));
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\55989\\Downloads\\icons8-remove-24.png"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FRMexcluir excluir = new FRMexcluir();
				excluir.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		btnNewButton_3.setBounds(204, 147, 182, 57);
		contentPane.add(btnNewButton_3);
	}
	
public static void voltar() {
	FRMoptionprofessor voltar = new FRMoptionprofessor();
	voltar.setVisible(true);

}
}
