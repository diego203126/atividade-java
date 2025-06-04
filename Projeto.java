package MeuProjeto;

public class Projeto extends Interface{
    protected String nome;
    protected String cnpj;
    protected int numPessoas;
    protected int numMeses;
    protected double mediaSalarios;
    protected Indicador indicador;

    public Projeto(String nome, String cnpj, int numPessoas, int numMeses, double mediaSalarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numPessoas = numPessoas;
        this.numMeses = numMeses;
        this.mediaSalarios = mediaSalarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public int getNumMeses() {
        return numMeses;
    }

    public void setNumMeses(int numMeses) {
        this.numMeses = numMeses;
    }

    public double getMediaSalarios() {
        return mediaSalarios;
    }

    public void setMediaSalarios(double mediaSalarios) {
        this.mediaSalarios = mediaSalarios;
    }

    public Indicador getIndicador() {
        return indicador;
    }

    public void setIndicador(Indicador indicador) {
        this.indicador = indicador;
    }
}
