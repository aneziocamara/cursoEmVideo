package aula12;

public class Aula12 {
    static void main() {

        Ave a = new Ave();
        Mamifero m = new Mamifero();
        Peixe p = new Peixe();
        Reptil r = new Reptil();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();

        m.setPeso(35.3f);
        System.out.println(m.getPeso());
        m.setCorDoPelo("Marron.");
        System.out.println(m.getCorDoPelo());
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.locomover();
        p.locomover();
        r.locomover();

        c.locomover();
        k.locomover();
        k.emitirSom();
    }
}
