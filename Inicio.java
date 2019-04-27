package desafiodejava;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Inicio {
/*	public static void menu() {
		int numeroMenu;
		Scanner index = new Scanner(System.in);
		 System.out.print("\nMenu: \n"
			 		+ "1 - Inserir carro \n2 - Deletar carro \n3 - Listar todos os carros \n"
			 		+ "4 - Sair do programa"); 
	     numeroMenu = index.nextInt();
	     }*/
 public static void main(String...args) {
	 ArrayList<Carro> Carros = new ArrayList();
	 System.out.print("Bem vindo ao Sistema de Véiculos!");
	 Scanner index = new Scanner(System.in);
	 System.out.print("\nMenu: \n"
		 		+ "1 - Inserir carro \n2 - Deletar carro \n3 - Listar todos os carros \n"
		 		+ "4 - Sair do programa"); 
     int numeroMenu = index.nextInt();
	 
	 do {
	 switch(numeroMenu) {
	 case 1:	
		 do {
			 Scanner a = new Scanner(System.in);
		     System.out.print("Insira a cor do carro: ");
		     String cor = a.nextLine();
		     System.out.print("Insira a placa do carro: ");
		     String placa = a.nextLine();
		     System.out.print("Insira a marca do carro: ");
		     String marca = a.nextLine();
		     System.out.print("Insira o ano do carro: ");
		     int ano = a.nextInt();
		  // Parte de definição dos carros.  
		     
		     Carro newCar = new Carro(cor, placa, ano, marca); // Construtor para adicionar em lista.
		     Carros.add(newCar); // Adiciona como objeto.
		     System.out.print("Carro adicionado com sucesso!\n"); // Mensagem de êxito.

			 System.out.print("\nMenu: \n"
				 		+ "1 - Inserir carro \n2 - Deletar carro \n3 - Listar todos os carros \n"
				 		+ "4 - Sair do programa"); 
		     numeroMenu = index.nextInt();
		 }
		 while (numeroMenu == 1);
		break;
		
	 case 2:
		 do {
		 Scanner remove = new Scanner(System.in);
		 System.out.print("Digite o index que deseja remover:");
		 int x = remove.nextInt();
		 Carros.remove(x);
		 System.out.println("Carro removido com sucesso!\n");
		 Scanner d = new Scanner(System.in);
		 System.out.print("Menu: \n"
			 		+ "1 - Inserir carro \n2 - Deletar carro \n3 - Listar todos os carros \n"
			 		+ "4 - Sair do programa"); 
	     numeroMenu = d.nextInt();
		 }
		 while(numeroMenu == 2);
		 break;
		 
	 case 3:
		 for (Carro c : Carros) {
			 System.out.print("Index:" + c + "\nCor: " + c.getCor()+"\n" +"Marca: " + c.getMarca()+"\nAno: "
		 + c.getAno() + "\nPlaca: " + c.getPlaca()+ "\n\n--------------------------------------\n");
		 }	 Scanner c = new Scanner(System.in);
		 System.out.print("\nMenu: \n"
			 		+ "1 - Inserir carro \n2 - Deletar carro \n3 - Listar todos os carros \n"
			 		+ "4 - Sair do programa"); 
	     numeroMenu = c.nextInt(); 
	     break;
	 }
	 }
	 while(numeroMenu < 4);
	 System.out.print("Saindo do sistema... Volte sempre!");
	 }
	 }

 

