package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class DAOConexão {
	

		public static Connection conetion;
		
	      	public static Connection Conexao() {
			try {
		         conetion= DriverManager.getConnection("jdbc:mysql://localhost/seminario","root","123456");
				
				
			} catch (Exception erro) {
				JOptionPane.showMessageDialog(null, "Erro de conexão"+erro);	
			}
			return conetion;
	            
			}
	}




	


