package orientacaoaoobjetoex3;

public class ex3 {
	String nome;
	String rota;
	int numeroDoVoo;
	int numeroDaPassagem;
	int assento;
	
	void viajar() {
		System.out.println("Ol� " + nome + ", seu n�mero de voo � " + numeroDoVoo +
				", com destino " + rota + ", seu assento � o n�mero " + assento + "." + "\nEMBARQUE EM 15 MINUTOS");
	}

	void informar() {
		System.out.println("Aten��o passageiros do voo: " + numeroDoVoo +
				" com destino " + rota + "\n***EMBARQUE IMEDIATO!!!***");
	}
}

