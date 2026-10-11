package aula07_UltraEmojiCombat;

public class Aula07 {
    static void main() {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "França", 31, 11, 2, 1,
                1.75f, 68.9f);
        l[1] = new Lutador("Putscript", "Brasil", 29, 14, 2, 3,
                1.68f, 57.8f);
        l[2] = new Lutador("Snaphadow", "EUA", 35, 12, 2, 1,
                1.65f, 80.9f);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 14, 0, 2,
                1.93f, 81.6f);
        l[4] = new Lutador("Ufocobol", "Brasil", 37, 5, 4, 3,
                1.70f, 119.3f);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 12, 2, 4,
                1.81f, 105.7f);


        l[0].apresentar();
        l[0].status();
        l[1].apresentar();
        l[1].status();
        l[2].apresentar();
        l[2].status();
        l[3].apresentar();
        l[3].status();
        l[4].apresentar();
        l[4].status();
        l[5].apresentar();
        l[5].status();
    }
}
