package testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import control.Guiche;
import model.Onibus;
import source.GuicheEvent;

public class GuicheTeste {

	Onibus onibus = new Onibus(10);
	Guiche guiche = new Guiche();
	GuicheEvent guicheEvent = new GuicheEvent(onibus);
	
	@Test
	public void testeVendeAcento() {
		assertTrue(onibus.getAllAcentos()[1].getDisponivel());
		guiche.vendeAcento(guicheEvent, 1);
		assertFalse(onibus.getAllAcentos()[1].getDisponivel());		
	}
	
	@Test
	public void testeReservaAcento() {
		assertFalse(onibus.getAllAcentos()[1].getReservado());
		guiche.reservaAcento(guicheEvent, 1);
		assertTrue(onibus.getAllAcentos()[1].getReservado());		
	}
	
	@Test
	public void testeLiberaAcento() {
		guiche.vendeAcento(guicheEvent, 1);
		assertTrue(onibus.getAllAcentos()[1].getOcupado());
		guiche.liberaAcento(guicheEvent, 1);
		assertFalse(onibus.getAllAcentos()[1].getOcupado());		
	}
}
