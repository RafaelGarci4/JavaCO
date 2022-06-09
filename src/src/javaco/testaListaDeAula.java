package javaco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class testaListaDeAula {


    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando as ArrayList",21);
        Aula a2 = new Aula("Lista de objetos",20);
        Aula a3 = new Aula("Relacionamento de lista de objetos",15);

        ArrayList<Aula> listaAulas = new ArrayList<>();
        listaAulas.add(a1);
        listaAulas.add(a2);
        listaAulas.add(a3);

        Collections.sort(listaAulas);
        System.out.println(listaAulas);
        Collections.sort(listaAulas, Comparator.comparing(Aula::getTempo));
        System.out.println(listaAulas);



    }
}
