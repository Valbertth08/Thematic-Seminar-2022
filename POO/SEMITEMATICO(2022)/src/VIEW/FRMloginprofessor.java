package VIEW;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.DAOConexão;
import DAO.DAO_Operações;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JFormattedTextField;
import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.border.BevelBorder;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Button;
import java.awt.ComponentOrientation;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import java.awt.Panel;

public class FRMloginprofessor extends JFrame {

	private JPanel contentPane;
	private JTextField TXTuse;
	private JPasswordField pswsenha;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FRMloginprofessor frame = new FRMloginprofessor();
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
	public FRMloginprofessor() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(102, 11, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 57, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(10, 132, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(71, 214, 89, 23);
		getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(10, 82, 138, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 149, 138, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 418);
		contentPane = new JPanel();
		contentPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.setFocusCycleRoot(true);
		contentPane.setBackground(new Color(102, 204, 102));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(191, 79, 50, 50);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\55989\\Downloads\\icons8-user-50.png"));
		
		Panel panel = new Panel();
		panel.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 10));
		panel.setBounds(68, 149, 292, 188);
		panel.setBackground(new Color(255, 255, 240));
		contentPane.add(panel);
		panel.setLayout(null);
		
		TXTuse = new JTextField();
		TXTuse.setBounds(40, 58, 134, 14);
		panel.add(TXTuse);
		TXTuse.setOpaque(false);
		TXTuse.setBorder(new CompoundBorder(null, new MatteBorder(0, 0, 2, 0, (Color) new Color(204, 204, 204))));
		TXTuse.setHorizontalAlignment(SwingConstants.LEFT);
		TXTuse.setColumns(10);
		TXTuse.setBackground(new Color(220, 220, 220));
		
		JLabel lblNewLabel_11 = new JLabel("USUÁRIO:");
		lblNewLabel_11.setBounds(40, 33, 62, 14);
		panel.add(lblNewLabel_11);
		lblNewLabel_11.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		lblNewLabel_11.setForeground(Color.BLACK);
		
		pswsenha = new JPasswordField();
		pswsenha.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 10));
		pswsenha.setOpaque(false);
		pswsenha.setBorder(new CompoundBorder(null, new MatteBorder(0, 0, 2, 0, (Color) new Color(211, 211, 211))));
		pswsenha.setBounds(40, 110, 134, 14);
		panel.add(pswsenha);
		pswsenha.setBackground(new Color(220, 220, 220));
		pswsenha.setForeground(new Color(0, 0, 0));
		
		JLabel lblNewLabel_21 = new JLabel("SENHA:");
		lblNewLabel_21.setBounds(40, 90, 51, 14);
		panel.add(lblNewLabel_21);
		lblNewLabel_21.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		lblNewLabel_21.setForeground(Color.BLACK);
		
		JButton btnlogin = new JButton("LOGIN");
		btnlogin.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnlogin.setBounds(40, 135, 103, 23);
		panel.add(btnlogin);
		btnlogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnlogin.setForeground(new Color(248, 248, 255));
		btnlogin.setIcon(null);
		btnlogin.setBackground(new Color(0, 128, 0));
		
		JLabel lblNewLabel_4 = new JLabel("Professor");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		lblNewLabel_4.setBounds(185, 129, 79, 14);
		contentPane.add(lblNewLabel_4);
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DAO_Operações.ChecarProfessor ((TXTuse.getText()), Integer.parseInt(pswsenha.getText()));
		       dispose();
	
			}
			
			
			/*
			
			private void checarUSE() {
			String use;
			int senha;
			use= TXTuse.getText();
			senha= Integer.parseInt(pswsenha.getText()) ;
			DTOusuario  use1= new  DTOusuario();
			use1.setUsuario(use);
			use1.setSenha(senha);
			Connection con = Conexão.ConectaBD();
			String sql= "select * From  usuario where nome =? and senha=?";

			try {
				PreparedStatement stmt=  con.prepareStatement(sql);
				stmt.setString(1, use1.getUsuario());
				stmt.setInt(2, use1.getSenha());
				
				ResultSet result =stmt.executeQuery();
				
				if(result.next()) {
				JOptionPane.showMessageDialog(null, "Login efetuado");
				
				FRMgerenciador view2= new FRMgerenciador();
				view2.setVisible(true);
				dispose();
			
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Erro de login ou senha");
					dispose();
				}
			} 
			catch (Exception erro) {
				JOptionPane.showMessageDialog(null," "+erro);
			}

		*/
			
			
			/*
			Connection conn= Conexão.ConectaBD();
			String sql= "INSERT INTO usuario (nome,senha) VALUES(?,?)";
			try {
				PreparedStatement smt= conn.prepareStatement(sql);
				smt.setString(1, use1.getUsuario());
				smt.setInt(2, use1.getSenha());
				smt.execute();
				smt.close();
				conn.close();
				JOptionPane.showMessageDialog(null,"salvo com sucesso");
			} catch (Exception erro) {
				JOptionPane.showMessageDialog(null,"Falha ao salvar"+erro);
		
			}
			*/
			
			
			
		});
	}
}
