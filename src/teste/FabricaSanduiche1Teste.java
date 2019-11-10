package teste;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import Main.FabricaSanduiche1;
import Main.FabricaSanduiche3;
import Main.Sanduiche;
import produtoConcreto.OvoCapoeira;
import produtoConcreto.PaoFrances;
import produtoConcreto.PresuntoFrango;
import produtoConcreto.QueijoPrato;
import produtoConcreto.Tomate;

import static org.hamcrest.CoreMatchers.instanceOf;

public class FabricaSanduiche1Teste {
	private FabricaSanduiche1 sanduiche;

	@Test
	public void isNull() {
		assertNull(sanduiche);
	}

	@Test
	public void SanduicheNotNull() {
		sanduiche = new FabricaSanduiche1();

		assertNotNull(sanduiche);
	}

	@Test
	public void montaSanduiche() {
		sanduiche = new FabricaSanduiche1();
		assertThat(sanduiche.montaSanduiche(), instanceOf(Sanduiche.class));
	}

	@Test
	public void addPao() {
		sanduiche = new FabricaSanduiche1();
		assertThat(sanduiche.addPao(), instanceOf(PaoFrances.class));
	}

	@Test
	public void addQueijo() {
		sanduiche = new FabricaSanduiche1();
		assertThat(sanduiche.addQueijo(), instanceOf(QueijoPrato.class));

	}

	@Test
	public void addOvo() {
		sanduiche = new FabricaSanduiche1();
		assertThat(sanduiche.addOvo(), instanceOf(OvoCapoeira.class));

	}

	@Test
	public void addTomate() {
		sanduiche = new FabricaSanduiche1();
		assertThat(sanduiche.addTomate(), instanceOf(Tomate.class));

	}
	
	@Test
	public void addPresunto() {
		sanduiche = new FabricaSanduiche1();
		assertThat(sanduiche.addPresunto(), instanceOf(PresuntoFrango.class));
	}

}
