package desafio_laboratorio_1;

public class Produto {
	private String nome;
	private double preco;
	private Data dataValidade;
	
    //métodos construtor
	public Produto() {
		
	}
	
	public Produto(String nome, double preco, Data dataValidade) {
		this.nome = nome;
		this.preco = preco;
		this.dataValidade = dataValidade;
	}

	//getters e setters
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	public Data getDataValidade() {
		return dataValidade;
	}


	public void setDataValidade(Data dataValidade) {
		this.dataValidade = dataValidade;
	}

	//método toString
	public String toString() {
		return nome
				+"\n"
				+"R$ "
				+String.format("%.2f", preco)
				+"\n"
				+"Data de validade: "
				+dataValidade.toString();
	}
	
	//outros métodos
	public boolean estaVencido(Data data) {
		if((data.getAno() > dataValidade.getAno()) || (data.getAno() >= dataValidade.getAno() && data.getMes() > dataValidade.getMes()) || (data.getAno() >= dataValidade.getAno() && data.getMes() >= dataValidade.getMes() && data.getDia() > dataValidade.getDia()))
				return true;
		else 
			return false;
	}

}
