public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Clean Code");
        System.out.println("Disponivel? " + livro.isDisponivel());

        livro.emprestar();
        System.out.println("Disponivel? " + livro.isDisponivel());

        livro.emprestar();
        livro.devolver();
        System.out.println("Disponivel? " + livro.isDisponivel());

        Periodico periodico = new Periodico("Revista Java Magazine", 145);
        System.out.println("Periodico: " + periodico.getTitulo() + " - volume " + periodico.getNumeroVolume());
    }
}
