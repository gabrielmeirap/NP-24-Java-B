package br.com.senaisp.bauru.gabriel.exercicio;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Digite o código da cor (1,2 OU 3):");
     int codigo = sc.nextInt();
     String cor= "Cor inválida";
     switch (codigo) {
     case 1 -> cor = "Próxima luz do semáforo será verde";
     case 2 -> cor = "Próxima luz do semáforo será Amarelo";
     case 3 -> cor = "Próxima luz do semáforo será vermelho";
     }
     //Outro forma de usar o switch
     /*
     switch (codigo) {
     case 1 -> cor = "Próxima luz do semáforo será verde"; break
     case 2 -> cor = "Próxima luz do semáforo será Amarelo"; break
     case 3 -> cor = "Próxima luz do semáforo será vermelho"; break
     System.out.println(cor);
     sc.close();
	}

}
