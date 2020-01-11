package br.com.massaterapia.facade;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.massaterapia.dao.JdbcDAOFactory;
import br.com.massaterapia.model.PessoaFisica;

public class PessoaFisicaFacade {
	
	public List<PessoaFisica> listarTodasPessoasFisicas() throws SQLException{
		//Buscar todas as pessoas Fisicas
		JdbcDAOFactory jdbc = new JdbcDAOFactory();
		List <PessoaFisica> pessoasFisicas = new ArrayList<PessoaFisica>();
		
		String sql = "SELECT ID, DAT_NASCIMENTO, CPF FROM T12SPS4.PESSOA_FISICA";
		PreparedStatement ps = jdbc.getConexao().prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()){
		PessoaFisica pessoaFisica = new PessoaFisica();
		
		pessoaFisica.setId(rs.getLong("ID"));
		pessoaFisica.setDatNacimento(rs.getDate("DAT_NASCIMENTO"));
		pessoaFisica.setCpf(rs.getString("CPF"));
		
		pessoasFisicas.add(pessoaFisica);
	
		}
		
		
		
		return pessoasFisicas;
			
			
		
	}
	

}