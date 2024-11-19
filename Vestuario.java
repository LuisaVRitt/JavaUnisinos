package desafio_laboratorio_1;

public class Vestuario extends Loja{
	protected boolean produtosImportados;
	
	//métodos construtor
	public Vestuario() {
		super();
	}
	
	public Vestuario(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco,
			Data dataFundacao, boolean produtosImportados,int quantMaxProdutos) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
		this.produtosImportados = produtosImportados;
	}


	//getters e setters
	public boolean getProdutosImportados() {
		return produtosImportados;
	}


	public void setProdutosImportados(boolean produtosImportados) {
		this.produtosImportados = produtosImportados;
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
        		+"Produtos importados: "
        		+produtosImportados;
    }

}

