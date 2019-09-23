package models;

import java.util.ArrayList;
import java.util.List;

import excecoes.NumeroNegativoException;
import excecoes.StringVaziaEsception;
import interfaces.Funcionario;

public class WarnerBros {
	
	private Rh rh;
	private List<Filme> filmes;
	
	public WarnerBros() {
		this.rh = new Rh();
		this.filmes = new ArrayList<Filme>();
	}
	
	public Boolean addFilmeNovo(Filme filme) {
		if (this.getFilmes().contains(filme)) {
			return false;
		}
		return this.filmes.add(filme);
	}
	
	public void buscaPorFuncao(String nome, String funcao) {
		for (int i = 0; i < filmes.size(); i++) {
			for (int j = 0; j < filmes.get(i).getFuncionarios().size(); j++) {				
				if (filmes.get(i).getFuncionarios().get(j).getNome() == nome && filmes.get(i).getFuncionarios().get(j).getFuncao() == funcao) {
					System.out.println(filmes.get(i).getNome());					
				}				
			}			
		}
	}
	
	public void creditos(Filme filme) {
		System.out.println("\n-------------Creditos-------------");
		System.out.println("Filme: " + filme.getNome());
		System.out.println("Ano: " + filme.getAno());
		for (Funcionario funcionarios : filme.getFuncionarios()) {
			System.out.println(funcionarios.getFuncao() + ": " + funcionarios.getNome());
		}
	}
	
	public List<Filme> getFilmes() {
		return filmes;
	}

	public static void main(String[] args) throws NumeroNegativoException, StringVaziaEsception {
		WarnerBros wb = new WarnerBros();
		
		Funcionario funcionario1 = new Ator("Rodrigo", 123);
		Funcionario funcionario2 = new Ator("Aline", 456);		
		Funcionario funcionario3 = new Diretor("Rodrigo", 123);
		

		wb.filmes.add(new Filme("Liga da Justiça", 2017));
		wb.filmes.add(new Filme("Mulher Maravilha", 2017));
		wb.filmes.add(new Filme("Coringa", 2019));
		wb.filmes.add(new Filme("Aquaman", 2018));
		wb.filmes.add(new Filme("Batman", 2013));
		
		wb.rh.delegaFilme(wb.getFilmes().get(0), funcionario1);
		wb.rh.delegaFilme(wb.getFilmes().get(0), funcionario3);
		wb.rh.delegaFilme(wb.getFilmes().get(0), funcionario2);
		wb.rh.delegaFilme(wb.getFilmes().get(0), funcionario2);//Não adiciona pq ja existe o funcionario no filme
		
		wb.rh.delegaFilme(wb.getFilmes().get(1), funcionario1);
		wb.rh.delegaFilme(wb.getFilmes().get(2), funcionario3);
		wb.rh.delegaFilme(wb.getFilmes().get(3), funcionario3);
		wb.rh.delegaFilme(wb.getFilmes().get(4), funcionario3);
		
		
		wb.rh.definiSalario(funcionario1, 3500);
		
		System.out.println("Filmes do Funcionario: " + funcionario3.getNome() + " com a função de " + funcionario3.getFuncao());
		wb.buscaPorFuncao(funcionario3.getNome(), funcionario3.getFuncao());
		
		wb.creditos(wb.getFilmes().get(0));
		
		
		System.out.println("\nTodos os filmes da empresa Warner Bros");
		for (Filme filems : wb.getFilmes()) {
			System.out.println(filems);
		}

	}


	

}
