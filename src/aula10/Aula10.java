package aula10;

public class Aula10 {
    static void main() {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Jesus");
        p2.setNome("Juan");
        p3.setNome("Maria");
        p4.setNome("Pedro");

        p1.setSexo("M");
        p2.setSexo("M");
        p3.setSexo("F");
        p4.setSexo("M");

        p1.setIdade(33);
        p2.setIdade(24);
        p3.setIdade(65);
        p4.setIdade(39);

        p2.setCurso("Informática");
        p3.setSalario(2500.75F);
        p4.setSetor("Estoque");

        p3.receberAumento(550.20f);
        p4.mudarTrabalho();
        p2.cancelarMatricula();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println("O funcionário "+p4.getNome()+" trabalha no "+p4.getSetor());
        System.out.println("O aluno "+p2.getNome()+" está cursando "+p2.getCurso());

    }
}
