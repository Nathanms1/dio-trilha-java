package aulaEnums;

public class SistemaIbge {
	public static void main(String[] args) {
		for(EstadoBrasileiro uf: EstadoBrasileiro.values() ) {
		   System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
		}
		
		EstadoBrasileiro ufSelecionado = EstadoBrasileiro.RIO_GRANDE_DO_SUL;	
		System.out.println("O estado selecionado foi: " + ufSelecionado.getNomeMaiusculo());
	}
}

