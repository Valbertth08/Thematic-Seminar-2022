package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.DAO_Operações;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.ImageIcon;

public class FRMexcluir extends JFrame {

	private JPanel contentPane;
	private JTextField EXcodigoaluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FRMexcluir frame = new FRMexcluir();
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
	public FRMexcluir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 274);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID_ALUNO DO ALUNO:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		lblNewLabel_1.setBounds(25, 76, 142, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FRMoptionprofessor.voltar();
				dispose();
			}
		});
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBackground(new Color(102, 204, 102));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\55989\\Downloads\\icons8-undo-26.png"));
		btnNewButton_1.setBounds(2, 0, 40, 26);
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 37, 276, 154);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EXCLUIR ALUNO");
		lblNewLabel.setBounds(89, 5, 92, 17);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(10, 66, 24, 48);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\55989\\Downloads\\icons8-remove-24 (1).png"));
		
		EXcodigoaluno = new JTextField();
		EXcodigoaluno.setBounds(146, 39, 86, 17);
		panel.add(EXcodigoaluno);
		EXcodigoaluno.setFocusTraversalKeysEnabled(false);
		EXcodigoaluno.setColumns(10);
		
		JButton btnNewButton = new JButton("Excluir");
		btnNewButton.setBounds(44, 82, 89, 20);
		panel.add(btnNewButton);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNewButton.setBackground(new Color(0, 153, 51));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DAO_Operações.Excluir(Integer.parseInt(EXcodigoaluno.getText()));
			}
		});
	}
}
