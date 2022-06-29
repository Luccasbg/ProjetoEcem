public class Moto extends Veiculos implements Actions{

    private int numeroRetrovisores;

    public Moto(String c, String f, int vm, int cap, int nm) {
        setCor(c);
        setFabricante(f);
        setVelocidadeMaxima(vm);
        setCapacidade(cap);
        setNumeroRetrovisores(nm);
    }

    public int getNumeroRetrovisores() {
        return numeroRetrovisores;
    }

    public void setNumeroRetrovisores(int numeroRetrovisores) {
        this.numeroRetrovisores = numeroRetrovisores;
    }

    @Override
    public String locomover() {
        return "Ran gan gan gan gan";
    }
}
