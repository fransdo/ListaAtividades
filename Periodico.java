public class Periodico extends Item {

    private int numeroVolume;

    public Periodico(String titulo, int numeroVolume) {
        super(titulo);
        this.numeroVolume = numeroVolume;
    }

    public int getNumeroVolume() {
        return numeroVolume;
    }
}
