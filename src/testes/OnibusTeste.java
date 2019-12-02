package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import control.Guiche;
import model.Acento;
import model.Onibus;
import source.GuicheEvent;

public class OnibusTeste {
	
	Onibus onibus = new Onibus(10);
	Guiche guiche = new Guiche();
	GuicheEvent guicheEvent = new GuicheEvent(onibus);
	
	@Test
	public void testeOnibus() {		
		assertEquals(onibus.getAllAcentos().length, 10);
		assertTrue(onibus.getAcento(0) instanceof Acento);
	}
	
	@Test
	public void testeDisparaVendeAcento() {
		assertTrue(onibus.getAcento(0).getDisponivel());
		guiche.vendeAcento(guicheEvent, 0);
		assertTrue(onibus.getAcento(0).getOcupado());
		
	}
	
	@Test
	public void testeDisparaReservaAcento() {
		assertTrue(onibus.getAcento(0).getDisponivel());
		guiche.reservaAcento(guicheEvent, 0);
		assertTrue(onibus.getAcento(0).getReservado());
		
	}
	
	@Test
	public void testeDisparaLiberaAcento() {
		guiche.vendeAcento(guicheEvent, 0);
		assertTrue(onibus.getAcento(0).getOcupado());
		guiche.liberaAcento(guicheEvent, 0);
		assertTrue(onibus.getAcento(0).getDisponivel());
		
	}
	
}
