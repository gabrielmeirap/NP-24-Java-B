package br.com.senaisp.bauru.gabriel.exercicio;

import java.util.Scanner;

public class ExemploSwitch {

	public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.println("Digite um valor de 1 a 10:");
     int vlr = sc.nextInt();
     switch (vlr) {
     case 1: System.out.println("Voce ganhou um boné!");
     case 2: System.out.println("Voce ganhou um caneta!");
     case 3: System.out.println("Voce ganhou um lápis!");
     case 4: System.out.println("Voce ganhou um calculadora!");
     case 5: System.out.println("Voce ganhou um borracha!");
     case 6: System.out.println("Voce ganhou um régua!");
     case 7: System.out.println("Voce ganhou um transferidor!");
     case 8: System.out.println("Voce ganhou um compasso!");
     case 9: System.out.println("Voce ganhou um celular!");
     case 10: System.out.println("Voce ganhou um R$ 1.000,00!");
     default: System.out.println("Que pena, você perdeu tudo!");
     }
     sc.close();
	}

}
