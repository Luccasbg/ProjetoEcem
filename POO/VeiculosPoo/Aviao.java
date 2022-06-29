public class Aviao extends Veiculos implements Actions{

    private int numeroMotores;

    public Aviao(String c, String f, int vm, int cap, int nm) {
        setCor(c);
        setFabricante(f);
        setVelocidadeMaxima(vm);
        setCapacidade(cap);
        setNumeroMotores(nm);
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    @Override
    public String locomover() {
        return "Para o alto, e avante!";
    }
}
