package aula09;

public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        p[0] = new Pessoa("Jesus",33,"M");
        p[1] = new Pessoa("Maria",22,"F");

        l[0] = new Livro("Apredendo Java","Zé das Couves",350, p[0], 1, true);
        l[1] = new Livro("Java para iniciantes","Maria Montes",450, p[0], 0, false);
        l[2] = new Livro("Java avamçado","Gustavo Guanabara",500, p[1], 3, true);

        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();

        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());

    }
}
