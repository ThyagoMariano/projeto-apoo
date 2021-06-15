module br.edu.facthus {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires java.sql;

	opens br.edu.facthus to javafx.fxml;
	exports br.edu.facthus;
}