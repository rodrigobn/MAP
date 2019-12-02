package view;

import java.util.Scanner;

import control.Guiche;
import model.Onibus;

public class Rodoviaria {

	public static void main(String[] args) {
		Guiche guiche = new Guiche();
		Onibus onibus = new Onibus(10);
		onibus.addOnibusListener(guiche);
		
		int opcao = 1;
		
		while (opcao != 0) {
			menu();			
			Scanner sc = new Scanner(System.in);
			opcao = sc.nextInt();
			
			if (opcao == 0) {
				break;
			}

			labelPoltronas();
			onibus.mostraAcentos();
			int acento = sc.nextInt();
			
			switch (opcao) {
			case 1:
				if (acento < 10) {
					onibus.vendeAcento(acento);
				}
				break;
				
			case 2:
				if (acento < 10) {
					onibus.reservaAcento(acento);
				}
				break;
				
			case 3:
				if (acento < 10) {
					onibus.liberaAcento(acento);
				}
				break;
			}
			
		}
		

	}

	private static void menu() {
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Comprar um acento");
		System.out.println("2 - Reservar um acento");
		System.out.println("3 - Liberar um acento");
		System.out.println("0 - sair");
	}

	private static void labelPoltronas() {
		System.out.println("Escolha uma poltrona: ");
	}

}
