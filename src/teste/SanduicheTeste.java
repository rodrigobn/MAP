package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.FabricaSanduiche1;
import Main.Sanduiche;
import produtoConcreto.PaoFrances;

class SanduicheTeste {
	private Sanduiche sanduiche;
	
	@Test
	public void isNull() {
		assertNull(sanduiche);
	}
	
	@Test
	public void SanduicheNotNull() {
		sanduiche = new FabricaSanduiche1().montaSanduiche();
		
		assertNotNull(sanduiche);
	}
	
	@Test
	public void SanduicheCompleto() {
		sanduiche = new FabricaSanduiche1().montaSanduiche();
		assertNotNull(sanduiche.getFatia1());
		assertNotNull(sanduiche.getFatia2());
		assertNotNull(sanduiche.getOvo());
		assertNotNull(sanduiche.getPresunto());
		assertNotNull(sanduiche.getQueijo());
		assertNotNull(sanduiche.getTomate());
	
	}
	
	@Test
	public void SanduicheIncompleto() {
		
		sanduiche = new Sanduiche(null, null, null, null, null, null);
		
		assertNull(sanduiche.getFatia1());
		assertNull(sanduiche.getFatia2());
		assertNull(sanduiche.getOvo());
		assertNull(sanduiche.getPresunto());
		assertNull(sanduiche.getQueijo());
		assertNull(sanduiche.getTomate());
	
	}


}
