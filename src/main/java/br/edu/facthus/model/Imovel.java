package br.edu.facthus.model;

public class Imovel {
	
	private String registro;
	
	private double aluguel;
	
	private boolean alugado;
	
	private String proprietario;
	
	private String corretor;
	
	public Imovel(String registro, 
			double aluguel, 
			String proprietario) {
		super();
		this.registro = registro;
		this.aluguel = aluguel;
		this.proprietario = proprietario;
		this.alugado = false;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public double getAluguel() {
		return aluguel;
	}

	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario1(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getCorretor() {
		return corretor;
	}

	public void setCorretor1(String corretor) {
		this.corretor = corretor;
	}

	public void add(Imovel imovel) {
		// TODO Auto-generated method stub
		
	}

	public void setRegistro(int int1) {
		// TODO Auto-generated method stub
		
	}

	public void setAluguel(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setAlugado(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setProprietario(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setCorretor(String string) {
		// TODO Auto-generated method stub
		
	}

}
