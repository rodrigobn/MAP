package teste;

import static org.junit.jupiter.api.Assertions.*;
import fachada.SIG;
import models.Administrativa;
import models.Almoxerifado;
import models.Aluno;
import models.Financeira;
import models.Infraestrutura;
import models.Professor;

import org.junit.jupiter.api.Test;

class SIGTeste {
	
	private SIG sig;
	private Administrativa adm = new Administrativa();
	private Financeira fin = new Financeira();
	private Aluno alu = new Aluno();
	private Professor professor = new Professor();
	private Almoxerifado almoxerifado = new Almoxerifado();
	private Infraestrutura infraestrutura = new Infraestrutura();
	private SIG sigMock = new SIG(adm, fin, alu, professor, almoxerifado, infraestrutura);
	
	@Test
	public void isNull() {
		sig = null;
		assertNull(sig);
	}
	
	
	@Test
	public void sigComApenasUmParametro() {
		sig = new SIG(adm, null, null, null, null, null);
		assertEquals(sig.getAdm(), sigMock.getAdm());	
		assertNull(sig.getFin());
		assertNull(sig.getPro());
		assertNull(sig.getAlm());
		assertNull(sig.getInfraestrutura());
		assertNull(sig.getAlu());
	}
	
	@Test
	public void sigComApenasDoisParametro() {
		sig = new SIG(adm, fin, null, null, null, null);
		assertEquals(sig.getAdm(), sigMock.getAdm());	
		assertEquals(sig.getFin(), sigMock.getFin());	
		assertNull(sig.getPro());
		assertNull(sig.getAlm());
		assertNull(sig.getInfraestrutura());
		assertNull(sig.getAlu());
	}
	
	@Test
	public void sigComApenasTrêsParametro() {
		sig = new SIG(adm, fin, alu, null, null, null);
		assertEquals(sig.getAdm(), sigMock.getAdm());	
		assertEquals(sig.getFin(), sigMock.getFin());	
		assertEquals(sig.getAlu(), sigMock.getAlu());	
		assertNull(sig.getPro());
		assertNull(sig.getAlm());
		assertNull(sig.getInfraestrutura());
	}
	
	@Test
	public void sigComApenasQuadroParametro() {
		sig = new SIG(adm, fin, alu, professor, null, null);
		assertEquals(sig.getAdm(), sigMock.getAdm());	
		assertEquals(sig.getFin(), sigMock.getFin());	
		assertEquals(sig.getAlu(), sigMock.getAlu());	
		assertEquals(sig.getPro(), sigMock.getPro());	
		assertNull(sig.getAlm());
		assertNull(sig.getInfraestrutura());
	}
	
	@Test
	public void sigComApenasCincoParametro() {
		sig = new SIG(adm, fin, alu, professor, almoxerifado, null);
		assertEquals(sig.getAdm(), sigMock.getAdm());	
		assertEquals(sig.getFin(), sigMock.getFin());	
		assertEquals(sig.getAlu(), sigMock.getAlu());	
		assertEquals(sig.getPro(), sigMock.getPro());	
		assertEquals(sig.getAlm(), sigMock.getAlm());
		assertNull(sig.getInfraestrutura());
	}
	
	@Test
	public void sigCompleto() {
		sig = new SIG(adm, fin, alu, professor, almoxerifado, infraestrutura);
		assertEquals(sig.getAdm(), sigMock.getAdm());	
		assertEquals(sig.getFin(), sigMock.getFin());	
		assertEquals(sig.getAlu(), sigMock.getAlu());	
		assertEquals(sig.getPro(), sigMock.getPro());	
		assertEquals(sig.getAlm(), sigMock.getAlm());
		assertEquals(sig.getInfraestrutura(), sigMock.getInfraestrutura());
	}

}
