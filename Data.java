package desafio_laboratorio_1;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	//métodos construtor
	public Data() {
		
	}
	
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		if(mes <= 0 || mes >= 13 || ano <= 0 || dia <= 0 || dia >= 32) {
			System.out.println("Erro! Data inválida!");
			dia=1;
			mes=1;
			ano=2000;
			}
		else if(dia == 31 && (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
			System.out.println("Erro! Data inválida!");
			dia=1;
			mes=1;
			ano=2000;
		}
		else if(dia <= 28 && mes == 2 && verificaAnoBissexto()) {
			System.out.println("Erro! Data inválida!");
			dia=1;
			mes=1;
			ano=2000;
		}
	}
	
	//getters e setters
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isAnoBissexto() {
		return anoBissexto;
	}

	public void setAnoBissexto(boolean anoBissexto) {
		this.anoBissexto = anoBissexto;
	}
	
	public String toString() {
		return dia
				+"/"
				+mes
				+"/"
				+ano;
	}

	//outros métodos
	private boolean anoBissexto;
	
	public boolean verificaAnoBissexto() {
		anoBissexto=(ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0);
		return anoBissexto;
	}

}


