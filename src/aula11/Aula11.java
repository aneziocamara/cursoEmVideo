package aula11;

import java.nio.charset.StandardCharsets;

public class Aula11 {
    static void main() {
//        Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("Joao");
        v1.setIdade(23);
        v1.setSexo("M");
        System.out.println(v1.toString());
        System.out.println("----------------------------------");
        Aluno a1 = new Aluno();
        a1.setNome("Jesus");
        a1.setMatricula(1111);
        a1.setCurso("Java");
        a1.setIdade(33);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        System.out.println("----------------------------------");
        Bolsista b1 = new Bolsista();
        b1.setNome("Cristo");
        b1.setIdade(19);
        b1.setMatricula(1112);
        b1.setBolsa(30f);
        b1.setSexo("M");
        System.out.println(b1.toString());
        b1.pagarMensalidade();
    }
}
