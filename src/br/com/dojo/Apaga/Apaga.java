package br.com.dojo.Apaga;

public class Apaga {

	private int primeiroNumero;
	private int segundoNumero;
	private String numeroGerado;
	private static final int VALOR_MAXIMO = 100000;
	
	
	public boolean isMenorQueDezSobreCinco(int valor) {
		return valor <= VALOR_MAXIMO;
	}

	public boolean isSegundoNumeroMenorQueOPrimeiro(int primeiro, int segundo) {
		return segundo < primeiro;
	}

	public boolean isMenorOuIgualAUm(int i) {
		return i >= 1;
	}

	public void geraNumeroDeTamanhoIgualA(int tamanho) {
		int primeiroNumero = (int) Math.random() + 1;
		
		StringBuilder demaisNumeros = new StringBuilder();
		for (int j = 1; j < tamanho; j++) {
			demaisNumeros.append(Integer.toString((int) Math.random()));
		}		
		this.numeroGerado = Integer.toString(primeiroNumero) + demaisNumeros.toString();
	}

	public String getNumeroGerado() {
		return this.numeroGerado;
	}

	public String apagueEGanhe() {
		int quantidade = this.primeiroNumero, 
		    aApagar = this.segundoNumero, 
		    dado = quantidade - aApagar,
		    maior=0,
		    index=-1,
		    atual=0;
		
		for (int i = index+1; i < dado; i++) {
			atual = Integer.parseInt(numeroGerado.substring(i, 1));
			if (maior < atual) {
				maior = atual;
				index = i;
			}
		}
		dado = this.primeiroNumero - index + 1;
		
		return null;
	}

}
