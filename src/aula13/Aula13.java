package aula13;

public class Aula13 {
    static void main() {
        Lobo x = new Lobo();
        x.emitirSom();
        Cachorro c = new Cachorro();
        c.emitirSom();
        c.reagir("Olá");  //Abanar e latir
        c.reagir("Vai apanhar!");  //Rosnar
        c.reagir(11, 45);  //Abanar
        c.reagir(true);  //Abanar
        c.reagir(false);  //Rosnar e latir
        c.reagir(2, 12.5f);  //Latir
        c.reagir(17, 4.5f);  //Rosnar
    }
}
