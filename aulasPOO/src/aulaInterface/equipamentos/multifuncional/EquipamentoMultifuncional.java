package aulaInterface.equipamentos.multifuncional;

import aulaInterface.equipamentos.copiadora.Copiadora;
import aulaInterface.equipamentos.digitalizadora.Digitalizadora;
import aulaInterface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

	@Override
	public void digitalizar() {
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
		
	}

	@Override
	public void copiar() {
		System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
	
}

	@Override
	public void imprimir() {
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
		
	}

}
