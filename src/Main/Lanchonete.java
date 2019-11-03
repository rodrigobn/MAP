package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import interfaces.Ovo;
import interfaces.Pao;
import interfaces.Presunto;
import interfaces.Queijo;
import produtoConcreto.OvoCapoeira;
import produtoConcreto.OvoGranja;
import produtoConcreto.PaoBola;
import produtoConcreto.PaoFrances;
import produtoConcreto.PaoIntegral;
import produtoConcreto.PresuntoFrango;
import produtoConcreto.PresuntoPeru;
import produtoConcreto.QueijoMussarela;
import produtoConcreto.QueijoPrato;
import produtoConcreto.QuejoCheddar;
import produtoConcreto.Tomate;

public class Lanchonete {

	private List<Pao> paes;
	private List<Queijo> queijos;
	private List<Presunto> presuntos;
	private List<Ovo> ovos;
	
	public Lanchonete() {
		this.paes = new ArrayList<Pao>();
		this.queijos = new ArrayList<Queijo>();
		this.presuntos = new ArrayList<Presunto>();
		this.ovos = new ArrayList<Ovo>();
	}
	
	public boolean addPao(Pao pao) {
		return this.paes.add(pao);
	}
	
	public boolean addQueijo(Queijo queijo) {
		return this.queijos.add(queijo);		
	}
	
	public boolean addPresunto(Presunto presunto) {
		return this.presuntos.add(presunto);
	}
	
	public boolean addOvo(Ovo ovo) {
		return this.ovos.add(ovo);
	}
	
	public void montaSanduiche(Pao pao, Queijo queijo, Presunto presunto, Ovo ovo, Tomate tomate) {
		new Sanduiche(pao, queijo, presunto, ovo, tomate);
	}
	
	public void montaSanduicheAleatorio() {
		Random paoRandom = new Random();
		Random queijoRandom = new Random();
		Random presuntoRandom = new Random();
		Random ovoRandom = new Random();
		
		Pao pao = this.paes.get(paoRandom.nextInt(this.paes.size()));
		Queijo queijo = this.queijos.get(queijoRandom.nextInt(this.queijos.size()));
		Presunto presunto = this.presuntos.get(presuntoRandom.nextInt(this.presuntos.size()));
		Ovo ovo = this.ovos.get(ovoRandom.nextInt(this.ovos.size()));
		
		
		this.montaSanduiche(pao, queijo, presunto, ovo, Tomate.getInstance());
	}
	
	public void stoque() {
		this.addPao(PaoBola.getInstance());
		this.addPao(PaoFrances.getInstance());
		this.addPao(PaoIntegral.getInstance());
		
		this.addQueijo(QuejoCheddar.getInstance());
		this.addQueijo(QueijoMussarela.getInstance());
		this.addQueijo(QueijoPrato.getInstance());
		
		this.addPresunto(PresuntoFrango.getInstance());
		this.addPresunto(PresuntoPeru.getInstance());
		
		this.addOvo(OvoCapoeira.getInstance());
		this.addOvo(OvoGranja.getInstance());		
		
	}
	
	public static void main(String[] args) {
		
		Lanchonete lanchonete = new Lanchonete();
		/*
		System.out.println("Sanduiche 1: \n");
		
		new Lanchonete().montaSanduiche(
				PaoBola.getInstance(),
				QueijoPrato.getInstance(),
				PresuntoPeru.getInstance(),
				OvoGranja.getInstance(),
				Tomate.getInstance());
		
		System.out.println("\nSanduiche 2: \n");
		
		new Lanchonete().montaSanduiche(
				PaoIntegral.getInstance(),
				QueijoMussarela.getInstance(),
				PresuntoFrango.getInstance(),
				OvoCapoeira.getInstance(),
				Tomate.getInstance());
		
		System.out.println("\nSanduiche 3: \n");
		
		new Lanchonete().montaSanduiche(
				PaoFrances.getInstance(),
				QuejoCheddar.getInstance(),
				PresuntoPeru.getInstance(),
				OvoGranja.getInstance(),
				Tomate.getInstance());
		*/
		lanchonete.stoque();
		
		
		for (int i = 1; i < 4; i++) {
			System.out.println("\n" + i + "° Sanduiche: \n");
			lanchonete.montaSanduicheAleatorio();
		}
		
		
	}
}

