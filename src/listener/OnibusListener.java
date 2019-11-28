package listener;

import java.util.EventListener;

import source.GuicheEvent;

public interface OnibusListener extends EventListener {

	public void vendeAcento(GuicheEvent guicheEvent, int numero);
	public void reservaAcento(GuicheEvent guicheEvent, int numero);
	public void liberaAcento(GuicheEvent guicheEvent, int numero);
	
}
