package teste;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import Main.FabricaSanduiche1;
import Main.FabricaSanduiche2;
import Main.Sanduiche;
import produtoConcreto.OvoCapoeira;
import produtoConcreto.PaoFrances;
import produtoConcreto.PaoIntegral;
import produtoConcreto.PresuntoFrango;
import produtoConcreto.PresuntoPeru;
import produtoConcreto.QueijoPrato;
import produtoConcreto.QuejoCheddar;
import produtoConcreto.Tomate;

import static org.hamcrest.CoreMatchers.instanceOf;

class FabricaSanduiche2Teste {
	
	private FabricaSanduiche2 sanduiche;
	
	@Test
	public void isNull() {
		assertNull(sanduiche);
	}
	
	@Test
	public void SanduicheNotNull() {
		sanduiche = new FabricaSanduiche2();
		
		assertNotNull(sanduiche);
	}
	
	@Test
	public void montaSanduiche() {
		sanduiche = new FabricaSanduiche2();
		assertThat(sanduiche.montaSanduiche(), instanceOf(Sanduiche.class));
	}
	
	@Test
	public void addPao() {
		sanduiche = new FabricaSanduiche2();
		assertThat(sanduiche.addPao(), instanceOf(PaoIntegral.class));
	}
	
	@Test
	public void addQueijo() {
		sanduiche = new FabricaSanduiche2();
		 assertThat(sanduiche.addQueijo(), instanceOf(QuejoCheddar.class));
		
	}
	
	@Test
	public void addOvo() {
		sanduiche = new FabricaSanduiche2();
		 assertThat(sanduiche.addOvo(), instanceOf(OvoCapoeira.class));
		
	}
	
	@Test
	public void addTomate() {
		sanduiche = new FabricaSanduiche2();
		 assertThat(sanduiche.addTomate(), instanceOf(Tomate.class));
		
	}
	
	@Test
	public void addPresunto() {
		sanduiche = new FabricaSanduiche2();
		assertThat(sanduiche.addPresunto(), instanceOf(PresuntoPeru.class));
	}

}
