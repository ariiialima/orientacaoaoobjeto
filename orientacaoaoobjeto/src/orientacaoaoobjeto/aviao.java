package orientacaoaoobjeto;
import java.util.*;
public class aviao {
	
	public static void main(String[] args) {

		Aviao embarque = new Aviao(System.in);

		embarque.nome = "Felipe";
		embarque.numeroDaPassagem = 17171;
		embarque.numeroDoVoo = 53105;
		embarque.rota = "S�o Paulo - Nova Iorque";
		embarque.assento = 51;

		System.out.println("***PORT�O DE EMBARQUE/BOARDING GATE***");
		System.out.println("O nome do passageiro: " + embarque.nome);
		System.out.println("N�mero de passagem: " + embarque.numeroDaPassagem);
		System.out.println("Destino/Rota: " + embarque.rota);
		System.out.println("Assento: " + embarque.assento);
		embarque.viajar();
		System.out.println();
		System.out.println("***TELA DE EMBARQUE***");
		embarque.informar();

	}
}


