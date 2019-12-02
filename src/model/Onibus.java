package model;

import java.util.ArrayList;
import java.util.List;

import listener.OnibusListener;
import source.GuicheEvent;

public class Onibus {

	Acento[] acentos;
	
	List<OnibusListener> onibusListeners = new ArrayList<OnibusListener>();
	
	public Onibus(int totalAcentos) {
		this.acentos = new Acento[totalAcentos];
		for (int i = 0; i < acentos.length; i++) {
			Acento umAcento = new Acento();
			acentos[i] = umAcento;
		}
	}
	
	public void vendeAcento(int numero) {
		disparaVendeAcento(numero);
	}
	
	public void reservaAcento(int numero) {
		disparaReservaAcento(numero);
	}
	
	public void liberaAcento(int numero) {
		disparaLiberaAcento(numero);
	}
	
	public void addOnibusListener(OnibusListener ol) {
		if (!onibusListeners.contains(ol)) {
			onibusListeners.add(ol);
		}
	}
	
	public void removeOnibusListener(OnibusListener ol) {
		onibusListeners.remove(ol);
	}

	public Acento[] getAllAcentos() {
		return acentos;
	}
	
	public Acento getAcento(int numero) {
		return acentos[numero];
	}
	
	private void disparaVendeAcento(int numero) {
		List<OnibusListener> ol;
		synchronized (this) {
			ol = (List) (((ArrayList) onibusListeners).clone());
		}
		GuicheEvent evento = new GuicheEvent(this);
		for (OnibusListener onibusListener : ol) {
			onibusListener.vendeAcento(evento, numero);
		}
	}
	
	private void disparaReservaAcento(int numero) {
		List<OnibusListener> ol;
		synchronized (this) {
			ol = (List) (((ArrayList) onibusListeners).clone());
		}
		GuicheEvent evento = new GuicheEvent(this);
		for (OnibusListener onibusListener : ol) {
			onibusListener.reservaAcento(evento, numero);
		}
	}
	
	private void disparaLiberaAcento(int numero) {
		List<OnibusListener> ol;
		synchronized (this) {
			ol = (List) (((ArrayList) onibusListeners).clone());
		}
		GuicheEvent evento = new GuicheEvent(this);
		for (OnibusListener onibusListener : ol) {
			onibusListener.liberaAcento(evento, numero);
		}
	}

	public void mostraAcentos() {
		for (int i = 0; i < acentos.length; i++) {
			System.out.println("Acento: " + i + " = " + acentos[i]);
		}
	}	
}
