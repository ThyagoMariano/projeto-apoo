package br.edu.facthus;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {
	
	private void mostraJanela(String nomeFxml, String titulo) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader();
			fxmlLoader.setLocation(getClass().getResource(nomeFxml));
			Scene scene = new Scene(fxmlLoader.load(), 640, 480);
			Stage stage = new Stage();
			stage.setTitle(titulo);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@FXML
	private void cadastroProprietarios() {
		mostraJanela("proprietarios.fxml", "Cadastro de proprietários");
	}
	
	@FXML
	private void cadastroCorretores() {
		// Tarefa 01: mostrar a janela de corretores
	}
	
	@FXML
	private void cadastroImoveis() {
		// Tarefa 02: mostrar a janela de imoveis
	}
	
	@FXML
	private void cadastroInquilinos() {
		mostraJanela("inquilinos.fxml", "Cadastro de Inquilinos");
	}
	
}
