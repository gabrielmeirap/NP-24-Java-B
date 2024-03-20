package br.com.senaisp.bauru.gabriel.secao05;

import java.util.Scanner;

public class ExemploScanner01 {

	public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);
    System.out.println("Digite um nome:");
    String nome = scn.next();
    System.out.println("Digite so sobrenome:");
    String sobreNome= scn.next();
    System.out.println("  Olá  " + nome + " " + sobreNome);
	
    scn.close();
	}
	

}
