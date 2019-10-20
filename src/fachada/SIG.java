package fachada;

import models.Administrativa;
import models.Almoxerifado;
import models.Aluno;
import models.Financeira;
import models.Infraestrutura;
import models.Professor;

public class SIG {

	private Administrativa adm;
	private Financeira fin;
	private Aluno alu;
	private Professor pro;
	private Almoxerifado alm;
	private Infraestrutura infraestrutura;

	public SIG(Administrativa adm, Financeira fin, Aluno alu, Professor pro, Almoxerifado alm, Infraestrutura infrastrutura) {
		this.adm = adm;
		this.fin = fin;
		this.alu = alu;
		this.pro = pro;
		this.alm = alm;
		this.infraestrutura = infrastrutura;
	}

	public void AcessarSubsistemas() {
		System.out.println("Informações Administrativas: \n");
		adm.getReunioesAgendadas();
		adm.getEntrevistas();
		System.out.println("\nInformações Financeiras: \n");
		fin.acessarFolha();
		fin.visualizarBalanco();
		System.out.println("\nInformações dos Alunos: \n");
		alu.historico();
		alu.rdm();
		System.out.println("\nInformações dos Professores: \n");
		pro.alocacao();
		pro.tempoCasa();
		System.out.println("\nInformações sobre o Almoxerifado: \n");
		alm.estoque();
		alm.compra();
		System.out.println("\nInformações sobre a Infrestrutura: \n");
		infraestrutura.alocacaoSalas();
	}

	public Administrativa getAdm() {
		return adm;
	}

	public void setAdm(Administrativa adm) {
		this.adm = adm;
	}

	public Financeira getFin() {
		return fin;
	}

	public void setFin(Financeira fin) {
		this.fin = fin;
	}

	public Aluno getAlu() {
		return alu;
	}

	public void setAlu(Aluno alu) {
		this.alu = alu;
	}

	public Professor getPro() {
		return pro;
	}

	public void setPro(Professor pro) {
		this.pro = pro;
	}

	public Almoxerifado getAlm() {
		return alm;
	}

	public void setAlm(Almoxerifado alm) {
		this.alm = alm;
	}

	public Infraestrutura getInfraestrutura() {
		return infraestrutura;
	}

	public void setInfraestrutura(Infraestrutura infraestrutura) {
		this.infraestrutura = infraestrutura;
	}
	
	

}
