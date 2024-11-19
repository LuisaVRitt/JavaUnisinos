package desafio_laboratorio_1;

public class Bijuteria extends Loja{
	protected double metaVendas;
	
	//métodos construtor
	public Bijuteria() {
		super();
	}
	
	public Bijuteria(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco,
			Data dataFundacao, int quantMaxProdutos, double metaVendas) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
		this.metaVendas = metaVendas;
	}

	//getters e setters
	public double getMetaVendas() {
		return metaVendas;
	}



	public void setMetaVendas(double metaVendas) {
		this.metaVendas = metaVendas;
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
        		+"Meta de vendas: R$ "
        		+String.format("%.2f", metaVendas);
    }
}

