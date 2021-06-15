package br.edu.facthus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import br.edu.facthus.exception.CustomException;
import br.edu.facthus.model.Imovel;

// Tarefa 13: completar...
public class ImovelDAO {
	
	private Connection connection = null;
	
	private Connection getConnection() {
		try {
			if (connection == null)
				connection = DriverManager
					.getConnection("jdbc:sqlite:imoveis.db");
			
			return connection;
		} catch (SQLException e) {
			throw new CustomException("Erro abrindo conexão com o banco de dados.");
		}
	}
	
	public void insere(Imovel imovel) {
		// completar...
	}
	
	public List<Imovel> pesquisa() {
		// completar...
		return null;
	}

}
