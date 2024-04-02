import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Integer> IstInt = new ArrayList<Integer>();
        Random rnd = new Random ();
        //Adicionado valores aleatórios de 1 a 200 na lista
        for (int i=0;1<100;i++) {
        	IstInt.add(rnd.nextInt(200)+1);
        	
        }
        //listar os valores gerados 
        for (int it: IstInt) {
        	System.out.println(it);
        }
        //Utilizando o iterador
        System.out.println("Listando usando iterator");
        Iterator<Integer> iter = IstInt.iterator();
        while (iter.hasNext()) {
        	System.out.println(iter.next());
        }
        //removendo os pares => Isso pode dar problemas 
        //porque eu perco a referencia de indices 
        /*
        for (int it : IstInt) {
        	if (it%2==0) {
        		//removendo o item par
        		IstInt.remove(it);
        	}
        }
        //Para resolver o problema, removendo a partir do 
         //indice do maior para o menor
          *   
          */
        
        for (int i=IstInt.size()-1;i>0;i--) {
        	if (Istint.get(i)%2==0;i--)
        }
        //Listando o resultante depois ed retirado os valores 
        //Utilizando o listIterator
        ListIterator<Integer> IsIt = IstInt.listIterator();
        while (IsIt.hasNext());
           System.out.println(IsIt.nextIndex());
         
    }
}
