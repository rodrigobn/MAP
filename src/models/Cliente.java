package models;

import fachada.SIG;

public class Cliente {
    
    
    public static void main(String[] args) {
        
    	SIG SisGerente = new SIG(new Administrativa(), new Financeira(), new Aluno(), new Professor(), new Almoxerifado(), new Infraestrutura());
        SisGerente.AcessarSubsistemas();
    }
}
