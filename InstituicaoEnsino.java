package MeuProjeto;

public class InstituicaoEnsino extends Interface{
    private String nome;
    private int numAlunos;
    private double salarioProfessoresAno;
    private double investimentoEducacaoAno;
    private double indicador;

    public InstituicaoEnsino(String nome, int numAlunos, double salarioProfessoresAno, double investimentoEducacaoAno, double indicador) {
        this.nome = nome;
        this.numAlunos = numAlunos;
        this.salarioProfessoresAno = salarioProfessoresAno;
        this.investimentoEducacaoAno = investimentoEducacaoAno;
        this.indicador = indicador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumAlunos() {
        return numAlunos;
    }

    public void setNumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;
    }

    public double getSalarioProfessoresAno() {
        return salarioProfessoresAno;
    }

    public void setSalarioProfessoresAno(double salarioProfessoresAno) {
        this.salarioProfessoresAno = salarioProfessoresAno;
    }

    public double getInvestimentoEducacaoAno() {
        return investimentoEducacaoAno;
    }

    public void setInvestimentoEducacaoAno(double investimentoEducacaoAno) {
        this.investimentoEducacaoAno = investimentoEducacaoAno;
    }

    public double getIndicador() {
        return indicador;
    }

    public void setIndicador(double indicador) {
        this.indicador = indicador;
    }
}
