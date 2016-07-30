package br.com.dalloul.vetor;

public class Executa {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(1);

		vetor.adiciona("A");
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");

		System.out.print("Lista o Vetor -> ");
		System.out.println(vetor.lista());
		System.out.println();
		System.out.print("Tamanho do Vetor -> ");
		System.out.println(vetor.getTamanho());
		System.out.println();
		System.out.print("Obter o elemento de uma posição no Vetor -> ");
		System.out.println(vetor.busca(2));
		System.out.println();
		System.out.print("Verifica se o elemento existe no Vetor -> ");
		System.out.println(vetor.busca("E"));
		System.out.println();
		System.out.print("Adicionar elemento em qualquer posição do Vetor -> ");
		vetor.adiciona(2, "B+");
		System.out.println(vetor.lista());
		System.out.println();
		System.out.print("Remover o elemento do Vetor passando a posição -> ");
		System.out.println(vetor.remove(55));
		System.out.print(vetor.lista());
		

	}

}
