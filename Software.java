package MeuProjeto;

public class Software extends Projeto {

    private String loc;

    public Software(String nome, String cnpj, int numPessoas, int numMeses, double mediaSalarios) {
        super(nome, cnpj, numPessoas, numMeses, mediaSalarios);
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
