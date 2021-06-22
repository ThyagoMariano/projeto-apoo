package br.edu.facthus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.facthus.exception.CustomException;
import br.edu.facthus.model.Corretor;
import br.edu.facthus.model.Imovel;
import br.edu.facthus.model.Pessoa;


public class ImovelDAO {
	
	private static final List<Imovel> Imovel = null;
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
		try {
			Connection connection = getConnection();
			PreparedStatement statement = connection.prepareStatement(
					"INSERT INTO pessoas (registro, aluguel, alugado, proprietario, corretor) "
					+ "VALUES (?, ?)");
			
			statement.setString(1, imovel.getRegistro());
			statement.setDouble(2, imovel.getAluguel());
			statement.setBoolean(3, imovel.isAlugado());
			statement.setString(4, imovel.getProprietario());
			statement.setString(5, imovel.getCorretor());
			
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CustomException("Ocorreu um erro ao inserir .");
		}
	}
	
	public List<Imovel> pesquisa() {
    List<Imovel> Imovel = new ArrayList<>();
		
		try {
			Connection connection = getConnection();
			Statement statement = connection.createStatement();
			
			ResultSet rs = statement.executeQuery(
					"SELECT registro, aluguel, alugado, proprietario, corretor");
			
			while (rs.next()) {
				Imovel Imovel1 = new Imovel(null, 0, null);
				Imovel1.setRegistro(rs.getInt("registro"));
				Imovel1.setAluguel(rs.getString("aluguel"));
				Imovel1.setAlugado(rs.getString("alugado"));
				Imovel1.setProprietario(rs.getString("proprietario"));
				Imovel1.setCorretor(rs.getString("corretor"));
				
				Imovel1.add(Imovel1);
			}
			
			return Imovel; 
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CustomException("Ocorreu um erro ao pesquisar .");
		}		
	}
	}


