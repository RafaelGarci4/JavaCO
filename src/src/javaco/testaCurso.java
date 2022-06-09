package javaco;

import java.util.List;

public class testaCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colecoes java", "Paulo Silveira");

        List<Aula> aulas = javaColecoes.getAulas();

        javaColecoes.adicionarAula(new Aula("trabalhando com arrayList",21));

        javaColecoes.adicionarAula(new Aula("Criando uma aula",20));

        javaColecoes.adicionarAula(new Aula("Modelando colecoes",22));

        System.out.println(javaColecoes.getAulas());
    }
}
