package teste;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.FabricaSanduiche1;
import Main.FabricaSanduiche3;
import Main.Sanduiche;
import produtoConcreto.OvoCapoeira;
import produtoConcreto.OvoGranja;
import produtoConcreto.PaoBola;
import produtoConcreto.PaoFrances;
import produtoConcreto.PresuntoFrango;
import produtoConcreto.QueijoMussarela;
import produtoConcreto.QueijoPrato;
import produtoConcreto.Tomate;

class FabricaSanduiche3Teste {

	private FabricaSanduiche3 sanduiche;

	@Test
	public void isNull() {
		assertNull(sanduiche);
	}

	@Test
	public void SanduicheNotNull() {
		sanduiche = new FabricaSanduiche3();

		assertNotNull(sanduiche);
	}

	@Test
	public void montaSanduiche() {
		sanduiche = new FabricaSanduiche3();
		assertThat(sanduiche.montaSanduiche(), instanceOf(Sanduiche.class));
	}

	@Test
	public void addPao() {
		sanduiche = new FabricaSanduiche3();
		assertThat(sanduiche.addPao(), instanceOf(PaoBola.class));
	}

	@Test
	public void addQueijo() {
		sanduiche = new FabricaSanduiche3();
		assertThat(sanduiche.addQueijo(), instanceOf(QueijoMussarela.class));

	}

	@Test
	public void addOvo() {
		sanduiche = new FabricaSanduiche3();
		assertThat(sanduiche.addOvo(), instanceOf(OvoGranja.class));

	}

	@Test
	public void addTomate() {
		sanduiche = new FabricaSanduiche3();
		assertThat(sanduiche.addTomate(), instanceOf(Tomate.class));

	}
	
	@Test
	public void addPresunto() {
		sanduiche = new FabricaSanduiche3();
		assertThat(sanduiche.addPresunto(), instanceOf(PresuntoFrango.class));
	}

}
