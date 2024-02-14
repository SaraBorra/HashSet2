import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    // Funzione che restituisce un HashSet riempito
    public static Set<String> creaEriempiHashSet() {
        Set<String> set = new HashSet<>();
        set.add("Elemento1");
        set.add("Elemento2");
        set.add("Elemento3");
        return set;
    }

    public static void main(String[] args) {
        // Crea e riempi l'HashSet
        Set<String> mioSet = creaEriempiHashSet();

        // Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
        String elementoDaRimuovere = "Elemento2";

        // Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
        Iterator<String> iterator = mioSet.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(elementoDaRimuovere)) {
                iterator.remove();
                System.out.println(elementoDaRimuovere + " è stato rimosso.");
            }
        }

        // Svuotare l'HashSet
        mioSet.clear();

        // Verificare se l'HashSet è vuoto e stampare il risultato
        if (mioSet.isEmpty()) {
            System.out.println("L'HashSet è stato svuotato correttamente.");
        } else {
            System.out.println("L'HashSet non è vuoto.");
        }
    }
}