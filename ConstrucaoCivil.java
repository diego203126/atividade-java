package MeuProjeto;

public class ConstrucaoCivil extends Projeto{
    private int numApartsAndar;
    private double metrosQuadradosPorApart;
    private double numerosAndares;
    private double metrosQuadradosAreaComumAndar;
    private double metrosQuadradosAreaComum;

    public ConstrucaoCivil(String nome, String cnpj, int numPessoas, int numMeses, double mediaSalarios) {
        super(nome, cnpj, numPessoas, numMeses, mediaSalarios);
    }

    public int getNumApartsAndar() {
        return numApartsAndar;
    }

    public void setNumApartsAndar(int numApartsAndar) {
        this.numApartsAndar = numApartsAndar;
    }

    public double getMetrosQuadradosPorApart() {
        return metrosQuadradosPorApart;
    }

    public void setMetrosQuadradosPorApart(double metrosQuadradosPorApart) {
        this.metrosQuadradosPorApart = metrosQuadradosPorApart;
    }

    public double getNumerosAndares() {
        return numerosAndares;
    }

    public void setNumerosAndares(double numerosAndares) {
        this.numerosAndares = numerosAndares;
    }

    public double getMetrosQuadradosAreaComumAndar() {
        return metrosQuadradosAreaComumAndar;
    }

    public void setMetrosQuadradosAreaComumAndar(double metrosQuadradosAreaComumAndar) {
        this.metrosQuadradosAreaComumAndar = metrosQuadradosAreaComumAndar;
    }

    public double getMetrosQuadradosAreaComum() {
        return metrosQuadradosAreaComum;
    }

    public void setMetrosQuadradosAreaComum(double metrosQuadradosAreaComum) {
        this.metrosQuadradosAreaComum = metrosQuadradosAreaComum;
    }
}
