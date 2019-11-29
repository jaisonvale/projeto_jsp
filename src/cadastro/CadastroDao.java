package cadastro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;

import java.util.List;


public class CadastroDao {

	private Connection connection;
	protected String login;
	
	public CadastroDao() {
		this.connection = new Conect().getConnection();
	}

	public void adiciona(Dados dados) {
		String sql = "insert into cadastro (id, nome, email, endereco, dataNascimento) values(?,?,?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, dados.getId());
			stmt.setString(2, dados.getNome());
			stmt.setString(3, dados.getEmail());
			stmt.setString(4, dados.getEndereco());
			stmt.setDate(5, new Date(dados.getDataNascimento().getTimeInMillis()));
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public	List<Dados>	getLista()	{													
	try	{																	
		List<Dados>	dado	=	new	ArrayList<Dados>();	
		PreparedStatement	stmt	=	this.connection.prepareStatement("select * from cadastro");	
		ResultSet	rs	=	stmt.executeQuery();
			
		
	
	while	(rs.next())	{	
		Dados	dados	=	new	Dados();
		dados.setId(rs.getLong("id"));																					
		dados.setNome(rs.getString("Nome"));	
		dados.setEmail(rs.getString("Email"));
		dados.setEndereco(rs.getString("Endereco"));
											
		Calendar	data	=	Calendar.getInstance();																					
		data.setTime(rs.getDate("dataNascimento"));	

		dados.setDataNascimento(data);			
		dado.add(dados);								
}															
	rs.close();																	
	stmt.close();																	
	return	dado;													
	}	catch	(SQLException	e)	{																	
		throw	new	RuntimeException(e);													
		}									
	}
}
