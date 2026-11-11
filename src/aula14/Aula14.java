package aula14;

public class Aula14 {
    static void main() {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

//        System.out.println(v[0].toString());
//        System.out.println(v[1].toString());
//        System.out.println(v[2].toString());

        Aluno aluno[] = new Aluno[2];
        aluno[0] = new Aluno("Jesus", 33, "M", "1827", 1);
        aluno[1] = new Aluno("Sofia", 31, "F", "1812", 2);

//        System.out.println(aluno[0].toString());
//        System.out.println(aluno[1].toString());

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(aluno[0], v[2]);  //Jesus assiste a HTML5
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(aluno[0], v[1]);  //Jesus assiste a PHP
        vis[0].avaliar(87.0f);
        System.out.println(vis[0].toString());


    }
}
