package br.edu.facthus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import br.edu.facthus.exception.CustomException;
import br.edu.facthus.model.Pessoa;

// Tarefa 14: completar
public class InquilinoDAO {
	
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
	
	public void insere(Pessoa inquilino) {
		// completar...
	}
	
	public List<Pessoa> pesquisa() {
		// completar...
		return null;
	}

}
