package desafio_laboratorio_1;


public class Loja {
	   protected String nome;
	   protected int quantidadeFuncionarios;
	   protected int salarioBaseFuncionario;
	   protected Endereco endereco;
	   protected Data dataFundacao;
	   protected Produto[] estoqueProdutos;
	   
	   //métodos construtor
	   public Loja() {
	   	
		}

	   public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco,
				Data dataFundacao, int quantMaxProdutos) {
			super();
			this.nome = nome;
			this.quantidadeFuncionarios = quantidadeFuncionarios;
			this.salarioBaseFuncionario = salarioBaseFuncionario;
			this.endereco = endereco;
			this.dataFundacao = dataFundacao;
			this.estoqueProdutos = new Produto[quantMaxProdutos];
		}

		public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantMaxProdutos) {
			super();
			this.nome = nome;
			this.quantidadeFuncionarios = quantidadeFuncionarios;
			salarioBaseFuncionario = -1;
			this.endereco = endereco;
			this.dataFundacao = dataFundacao;
			this.estoqueProdutos = new Produto[quantMaxProdutos];
		}

		//getters e setters
		public String getNome() {
	       return nome;
	   }

	   public void setNome(String nome) {
	       this.nome = nome;
	   }

	   public int getQuantidadeFuncionarios() {
	       return quantidadeFuncionarios;
	   }

	   public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
	       this.quantidadeFuncionarios = quantidadeFuncionarios;
	   }

	   public int getSalarioBaseFuncionario() {
	               return salarioBaseFuncionario;
	       }

	   public void setSalarioBaseFuncionario(int salarioBaseFuncionario) {
	       this.salarioBaseFuncionario = salarioBaseFuncionario;
	   }
	   

	   public Endereco getEndereco() {
			return endereco;
		}

		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}

		public Data getDataFundacao() {
			return dataFundacao;
		}

		public void setDataFundacao(Data dataFundacao) {
			this.dataFundacao = dataFundacao;
		}

		public Produto[] getEstoqueProdutos() {
			return estoqueProdutos;
		}

		public void setEstoqueProdutos(Produto[] estoqueProdutos) {
			this.estoqueProdutos = estoqueProdutos;
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
	               +"Estoque de produtos: "
	               +estoqueProdutos;
	   }
	   
	   //outros métodos
	   public double gastosComSalario() {
	       if (salarioBaseFuncionario == -1) {
	           return -1.0;
	       }
	       else
	           return  quantidadeFuncionarios * salarioBaseFuncionario;
	   }
	   
	   public char tamanhoDaLoja() {
	       if (quantidadeFuncionarios < 10) 
	           return 'P';
	       else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios < 30)
	           return 'M';
	       else
	           return 'G';
	   }
	   
	   public void imprimeProdutos() {
	   	if(estoqueProdutos == null) {
	   		System.out.println("Não há produtos cadastrados!");
	   	}
	   	else {
	   		for (int i = 0; i < estoqueProdutos.length; i++) {
	     		  System.out.println(estoqueProdutos[i]);
	     		  System.out.println("-----------------------------------------------------");
	     		}
	   	}
	   }
	   
	   public boolean insereProduto(Produto produto) {
	   	for (int i = 0; i < estoqueProdutos.length; i++) {
	   		if(estoqueProdutos[i] == null) {
	   			estoqueProdutos[i] = produto;
	   			return true;
	   		}
	   	}
	   	return false;
	   }

	   public boolean removeProduto(String nome) {
	   	for (int i = 0; i < estoqueProdutos.length; i++) {
	   		if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nome)) {
	   			estoqueProdutos[i] = null;
	   			return true;
	   		}
	   	}
	   	return false;
	   }
	}

