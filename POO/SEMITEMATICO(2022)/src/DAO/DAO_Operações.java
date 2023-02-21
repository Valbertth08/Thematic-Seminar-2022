package DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.mysql.cj.protocol.Resultset;

import DTO.DTOaluno;
import DTO.DTOprofessor;


import VIEW.FRMoptionprofessor;

public class DAO_Operações {
	private static void dispose() {
		
		
	}
	public static void ChecarProfessor(String usuario, int senha) {
		
	DTOprofessor  prof1= new  DTOprofessor(null,0);
	prof1.setUsuario(usuario);
	prof1.setSenha(senha);
	
	String sql= "select * From  professor where usuario=? and senha=?";
     Connection conn= DAOConexão.Conexao();
	try {
		PreparedStatement stmt=  conn.prepareStatement(sql);
		stmt.setString(1, prof1.getUsuario());
		stmt.setInt(2, prof1.getSenha());
		ResultSet result =stmt.executeQuery();
		
		if(result.next()) {
		JOptionPane.showMessageDialog(null, "Login efetuado");
        FRMoptionprofessor opçao = new FRMoptionprofessor();
        opçao.setVisible(true);
		}
		else {
			JOptionPane.showMessageDialog(null," Erro de login ou senha");
			
		}
  
	}catch (SQLException erro) {
		
		}
		

}

	public static void Cadastro(int codigo, int senha,String nomealuno,int idade, int cpf,String endereço,String responsavel) {
			 DTOaluno alunov= new DTOaluno(codigo, senha, nomealuno,idade , cpf, endereço, responsavel);
			 alunov.setCodigo(codigo);
			 alunov.setSenha(senha);
			 alunov.setNome(nomealuno);
			 alunov.setIdade(idade);
			 alunov.setCpf(cpf);
			 alunov.setEndereço(endereço);
			 alunov.setResponsavel(responsavel);
				Connection conaluno= DAOConexão.Conexao();
				String sql= "INSERT INTO Aluno (codigo, senha, nome,idade,cpf,endereço,responsavel) VALUES(?,?,?,?,?,?,?)";
			
			try {
				PreparedStatement smtaluno= conaluno.prepareStatement(sql);
				smtaluno.setInt(1, alunov.getCodigo());
				smtaluno.setInt(2, alunov.getSenha());
				smtaluno.setString(3, alunov.getNome());
				smtaluno.setInt(4, alunov.getIdade());
				smtaluno.setInt(5, alunov.getCpf());
				smtaluno.setString(6, alunov.getEndereço());
				smtaluno.setString(7, alunov.getResponsavel());
				smtaluno.execute();
				smtaluno.close();
				conaluno.close();
				JOptionPane.showMessageDialog(null,"salvo com sucesso");
				

			} catch (Exception erro) {
				JOptionPane.showMessageDialog(null,"Falha ao salvar"+erro);

			}
		
	}
	public static void ConsultaTodosalunos(JTable  tabela) {

		String sql="select *from aluno";
		Connection conn= DAOConexão.Conexao();
		try {
			
			Statement stmt= conn.createStatement();
			ResultSet rs= stmt.executeQuery(sql);
			JOptionPane.showMessageDialog(null, "Consulta realizada com sucesso");
			
			while(rs.next()){
				String id_Aluno=String.valueOf( rs.getInt("id_aluno"));
				String codi=String.valueOf( rs.getInt("codigo"));
				String senha= String.valueOf (rs.getInt("senha"));
				String nome= rs.getString("nome");
				String idade= String.valueOf (rs.getInt("idade"));
				String cpf=String.valueOf( rs.getInt("cpf"));
				String endereço= rs.getString("endereço");
				String responsavel= rs.getString("responsavel");
				String tbData[]= {id_Aluno,codi,senha,nome,idade,cpf,endereço,responsavel};
				DefaultTableModel mode=  (DefaultTableModel)tabela.getModel();
				mode.addRow(tbData);
			}
		
			
		} catch (Exception e2) {
			System.out.println("Erro ao consultar"+e2);
			
		}
		
	}

	public static void ConsultaAluno(String codigo,JTable  tabela) {
		  String sql="select *from aluno where id_aluno=?";
			Connection conn= DAOConexão.Conexao();
			try {
				
				PreparedStatement st= conn.prepareStatement(sql);
				st.setInt(1, Integer.parseInt(codigo));
				ResultSet rs= st.executeQuery();
				JOptionPane.showMessageDialog(null, "Consulta realizada com sucesso");
				
				while(rs.next()){
					String id_Aluno=String.valueOf( rs.getInt("id_aluno"));
					String codi=String.valueOf( rs.getInt("codigo"));
					String senha= String.valueOf (rs.getInt("senha"));
					String nome= rs.getString("nome");
					String idade= String.valueOf (rs.getInt("idade"));
					String cpf=String.valueOf( rs.getInt("cpf"));
					String endereço= rs.getString("endereço");
					String responsavel= rs.getString("responsavel");
					String tbData[]= {id_Aluno,codi,senha,nome,idade,cpf,endereço,responsavel};
					DefaultTableModel mode=  (DefaultTableModel)tabela.getModel();
					mode.addRow(tbData);
				}
			
			} catch (Exception e2) {
				System.out.println("Erro ao consultar"+e2);
				
			}
		

	}
	
		public static void Alterar(String nome, int senha,int idade, int cpf, String endereço, String responsavel, int id_aluno,String usuario) {
			
			String sql="update aluno set nome=?, senha=?, idade=?, cpf=?, endereço=?, responsavel=? ,codigo=? where id_aluno=? ";
			Connection conn= DAOConexão.Conexao();
			
			try {
				PreparedStatement st= conn.prepareStatement(sql);
				st.setString(1,nome);
				st.setInt(2, senha);
				st.setInt(3, idade);
				st.setInt(4, cpf);
				st.setString(5,endereço);
				st.setString(6,responsavel);
				st.setString(7,usuario);
				st.setInt(8, id_aluno);
				
				st.execute();
			JOptionPane.showMessageDialog(null, "Valores Atualizados");
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao atualizar"+e);
			}
		
		
	}
public static void Excluir(int id_aluno) {
	Connection conn= DAOConexão.Conexao();
	String sql=" delete from aluno where id_aluno=?";
	try {
		PreparedStatement st= conn.prepareStatement(sql);
		st.setInt(1,id_aluno );
		st.execute();
		JOptionPane.showMessageDialog(null, "Excluído com sucesso");
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Erro ao Excluir"+e);
	
	}


	
}
}
