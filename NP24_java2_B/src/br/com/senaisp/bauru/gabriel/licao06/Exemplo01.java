package br.com.senaisp.bauru.gabriel.licao06;

public class Exemplo01 {

	public static void main(String[] args) {
      for(int i=0;i<10;i++) {
    	  System.out.println("7 x" + i + "=" + (7*i));
      }
      //Contagem regressiva
      for(int i=100;i>0;i--) {
    	  System.out.println(i);
      }
      //For sem as chaves
      for(int i=0;i<5;i++)
    	  System.out.println(i);
      System.out.println("linha seguinte!");
      //for sem parametros
      for(;;) {
    	  System.out.println("For infinito!");
      }
	}

}
