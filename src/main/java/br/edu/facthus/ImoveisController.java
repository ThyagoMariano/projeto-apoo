package br.edu.facthus;

import java.util.ArrayList;

import br.edu.facthus.dao.ImovelDAO;
import br.edu.facthus.model.Imovel;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
// Tarefa 09: completar...

public class ImoveisController {

	@FXML
	private TextField txtRegistro;
	@FXML
	private TextField txtAluguel;
	@FXML
	private TextField txtProprietario;
	@FXML
	private TableView<Imovel> tblImovel;
	@FXML
	private TableColumn<Imovel,String> cRegistro;
	@FXML
	private TableColumn<Imovel,String> cProprietario;
	@FXML
	private TableColumn<Imovel, Double> cAluguel;
	
	private ArrayList<Imovel> imovel = new ArrayList<>();
}
