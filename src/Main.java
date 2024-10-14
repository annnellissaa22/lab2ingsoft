import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

enum ZileleSaptamanii{ // enum este tot o clasa
    LUNI, MARTI, MIERCURI, JOI, VINERI, SAMBATA, DUMINICA //constante -> instante ale clasei
}
public class Main {
    public static void main(String[] args) {
        for(ZileleSaptamanii zi  : ZileleSaptamanii.values()){ // un array
            System.out.println(zi);
        }

        //Collection, List, ArrayList, LinkedList.
        //collection si list sunt interfete
        //lista este o colectie - > utilizam foreach (for : in Java)
        List lista = new ArrayList(100);

        //Collection <- List <... ArrayList, LinkedList
        //           <- Set <... TreeSet, HashSet
        //Set - structura de date specializata in verificarea continutului
        //cati invitati sunt la nunta(ex). ? complexitatea e O(n)
        //cautare in lista - cautare binara - O(log n)
        //adaugare in lista - arbori binari - O(log n)
        // ^ TreeSet
        // HashSet - tabele de dispersie
        // complexitate O(log 1)


        HashSet<String> set = new HashSet<String>();
        set.add("TEST1");
        set.add("TEST2");
        for(String HashSet : set)
        {
            System.out.println(HashSet);
        }

      }
}