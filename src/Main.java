import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> numeriPrimi = primeNumberSet();
        Integer nonPrimo = 2013;
        numeriPrimi.add(nonPrimo);
        // Uso l'iteratore
        Iterator<Integer> iterator = numeriPrimi.iterator();
        while(iterator.hasNext()){
            Integer numero = iterator.next();
            if(numero.equals(nonPrimo)){
                iterator.remove();
            }
        }
        // Rimuovo tutti gli elementi
        numeriPrimi.clear();
        System.out.println("La lista di numeri primi è vuota? " + numeriPrimi.isEmpty());
    }

    public static HashSet<Integer> primeNumberSet(){
        HashSet<Integer> numbersSet = new HashSet<Integer>();
        // 1 non è un numero primo
        numbersSet.add(2);
        numbersSet.add(3);
        numbersSet.add(5);
        numbersSet.add(7);
        numbersSet.add(11);
        return numbersSet;
    }
}