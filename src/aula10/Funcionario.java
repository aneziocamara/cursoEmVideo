package aula10;

public class Funcionario extends Pessoa{

    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(){
        this.trabalhando = !this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalho() {
        return trabalhando;
    }

    public void setTrabalho(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
