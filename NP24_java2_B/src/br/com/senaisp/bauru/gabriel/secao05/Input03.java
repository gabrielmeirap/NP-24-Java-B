package br.com.senaisp.bauru.gabriel.secao05;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner scn = new Scanner (System.in);
        //Find and print the sum of three integers entered by the user
        System.out.println("Digite 3 valores inteiros:");
        int vlrl, vlr2, vlr3, total;
        vlrl = scn.nextInt();
        vlr2 = scn.nextInt();
        vlr3 = scn.nextInt();
        total = vlrl+vlr2+vlr3;
        scn.nextLine(); //capturar enter
        String nome = scn.nextLine();
        System.out.println("Total"+ total);
        System.out.println
        //Remember to close the Scanner
        scn.close();
        
    }
}
