package desafio_laboratorio_1;


public class Alimentacao extends Loja{
	protected Data dataAlvara;
	
	//métodos construtor
	public Alimentacao() {
		super();
	}
	
	public Alimentacao(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco,
			Data dataFundacao, Data dataAlvara, int quantMaxProdutos) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
		this.dataAlvara = dataAlvara;
	}


	//getters e setters
	public Data getDataAlvara() {
		return dataAlvara;
	}



	public void setDataAlvara(Data dataAlvara) {
		this.dataAlvara = dataAlvara;
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
        		+"Data do Alvará: "
        		+dataAlvara.toString();
    }
}
