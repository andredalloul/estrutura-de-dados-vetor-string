package br.com.dalloul.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.tamanho * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public void adiciona(String elemento) {
		aumentaCapacidade();
		this.elementos[this.tamanho] = elemento;
		this.tamanho++;
	}

	public void adiciona(int posicao, String elemento) {
		aumentaCapacidade();
		for (int i = this.tamanho; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
	}

	public String remove(int posicao) {
		if (this.tamanho > posicao) {
			for (int i = posicao; i < this.tamanho - 1; i++) {
				this.elementos[i] = this.elementos[i + 1];
			}
			this.tamanho--;
			return null;
		}
		return ("essa posição não existe no Vetor");
	}

	public String lista() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		s.append(this.elementos[this.tamanho - 1]);
		s.append("]");
		return s.toString();
	}

	public String busca(int posicao) {
		if (this.tamanho >= posicao) {
			return this.elementos[posicao];
		}
		return ("Elemento não existe na posicão -> " + posicao);
	}

	public String busca(String elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equalsIgnoreCase(elemento)) {
				return ("O elemento " + elemento + " existe no Vetor na posicão " + i);
			}
		}
		return ("Não foi encontrado o elemento " + elemento + " no Vetor");
	}

	/**
	 * @return the tamanho
	 */
	public int getTamanho() {
		return tamanho;
	}

}
