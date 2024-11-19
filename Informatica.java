package desafio_laboratorio_1;

public class Informatica extends Loja{
	protected double seguroEletronicos;

	//métodos construtor
	public Informatica() {
		super();
	}
	
	public Informatica(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco,
			Data dataFundacao, int quantMaxProdutos, double seguroEletronicos) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
		this.seguroEletronicos = seguroEletronicos;
	}



	public double getSeguroEletronicos() {
		return seguroEletronicos;
	}


	public void setSeguroEletronicos(double seguroEletronicos) {
		this.seguroEletronicos = seguroEletronicos;
	}


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
        		+"Seguro dos eletrônicos: R$ "
        		+String.format("%.2f", seguroEletronicos);
    }
}

