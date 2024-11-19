package desafio_laboratorio_1;


public class Cosmetico extends Loja {
	protected double taxaComercializacao;
	
	//métodos construtor
	public Cosmetico() {
		super();
	}

	public Cosmetico(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco,
			Data dataFundacao, int quantMaxProdutos, double taxaComercializacao) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
		this.taxaComercializacao = taxaComercializacao;
	}
	
	//getters e setters
	public double getTaxaComercializacao() {
		return taxaComercializacao;
	}



	public void setTaxaComercializacao(double taxaComercializacao) {
		this.taxaComercializacao = taxaComercializacao;
	}


	//método toString
	public String toString() {
        return nome 
                +" , quantidade de funcionários: "
                +quantidadeFuncionarios
                +", salário base dos funcionários: "
                +salarioBaseFuncionario
                +"\n"
                +dataFundacao.toString()
                +"\n"
                +endereco.toString()
        		+"\n"
        		+"Taxa de comercialização: "
        		+String.format("%.2f", taxaComercializacao);
    }

}


