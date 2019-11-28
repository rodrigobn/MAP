package control;

import listener.OnibusListener;
import model.Onibus;
import source.GuicheEvent;

public class Guiche implements OnibusListener {
	
	@Override
	public void vendeAcento(GuicheEvent guicheEvent, int numero) {
		Onibus onibus = (Onibus) guicheEvent.getSource();
		if (onibus.getAcento(numero).getDisponivel()) {
			onibus.getAcento(numero).setOcupado(true);
			onibus.getAcento(numero).setDisponivel(false);
			onibus.getAcento(numero).setReservado(false);
		} else {
			onibus.getAcento(numero).status();
		}
		
		
	}

	@Override
	public void reservaAcento(GuicheEvent guicheEvent, int numero) {
		Onibus onibus = (Onibus) guicheEvent.getSource();
		if (!onibus.getAcento(numero).getReservado() && onibus.getAcento(numero).getDisponivel()) {
			onibus.getAcento(numero).setOcupado(false);
			onibus.getAcento(numero).setDisponivel(false);
			onibus.getAcento(numero).setReservado(true);			
		} else {
			onibus.getAcento(numero).status();
		}
		
	}

	@Override
	public void liberaAcento(GuicheEvent guicheEvent, int numero) {
		Onibus onibus = (Onibus) guicheEvent.getSource();
		if (onibus.getAcento(numero).getReservado() || onibus.getAcento(numero).getOcupado()) {
			onibus.getAcento(numero).setOcupado(false);
			onibus.getAcento(numero).setDisponivel(true);
			onibus.getAcento(numero).setReservado(false);
		} else {
			onibus.getAcento(numero).status();
		}
		
	}
	
	
}
