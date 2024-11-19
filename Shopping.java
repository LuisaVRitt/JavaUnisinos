package desafio_laboratorio_1;

public class Shopping {
	protected String nome;
	protected Endereco endereco;
	protected Loja[] lojas;
	
	
	//métodos construtor
	public Shopping() {
		
	}
	
	public Shopping(String nome, Endereco endereco, int quantMaxLojas) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		lojas = new Loja[quantMaxLojas];
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Loja[] getLojas() {
		return lojas;
	}
	public void setLojas(Loja[] lojas) {
		this.lojas = lojas;
	}
	
	 public boolean insereLoja(Loja loja) {
	    	for (int i = 0; i < lojas.length; i++) {
	    		if(lojas[i] == null) {
	    			lojas[i] = loja;
	    			return true;
	    		}
	    	}
	    	return false;
	    }
	 
	 public boolean removeLoja(String nome) {
	    	for (int i = 0; i < lojas.length; i++) {
	    		if(lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nome)) {
	    			lojas[i] = null;
	    			return true;
	    		}
	    	}
	    	return false;
	    }
	 
	 int x = 1;
	 public int quantidadeLojasPorTipo(String tipo) {
		 for (int i = 0; i < lojas.length; i++) {
			 if(tipo.equalsIgnoreCase("Alimentacao") && lojas[i] instanceof Alimentacao) {
				 x++;
			 }
			 else if(tipo.equalsIgnoreCase("Bijuteria") && lojas[i] instanceof Bijuteria) {
				 x++;
			 }
			 else if(tipo.equalsIgnoreCase("Cosmetico") && lojas[i] instanceof Cosmetico) {
				 x++;
			 }
			 else if(tipo.equalsIgnoreCase("Informatica") && lojas[i] instanceof Informatica) {
				 x++;
			 }
			 else if(tipo.equalsIgnoreCase("Vestuario") && lojas[i] instanceof Vestuario) {
				 x++;
			 }
			 
			 else {
				 return -1;
			 }
			 
		 }
		 return x;
	 }
	 
	 
	 public Informatica lojaSeguroMaisCaro() {
		 Informatica informaticaSeguroMaisCaro = null;
		 double maiorValorSeguro = 0;
		 
		 for (Loja loja : lojas) {
			 if(loja instanceof Informatica) {
				 double valorSeguro = ((Informatica)loja).getSeguroEletronicos();
						 if(maiorValorSeguro < valorSeguro) {
							 maiorValorSeguro = valorSeguro;
							 informaticaSeguroMaisCaro = (Informatica)loja;
						 }
			 }
		 }
		 
		 return informaticaSeguroMaisCaro;
	 }
	
}


