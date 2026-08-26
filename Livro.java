public class Livro extends Item {

    private boolean disponivel;

    public Livro(String titulo) {
        super(titulo);
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro \"" + titulo + "\" emprestado com sucesso.");
        } else {
            System.out.println("Livro \"" + titulo + "\" ja esta emprestado.");
        }
    }
    
    public void devolver() {
        disponivel = true;
        System.out.println("Livro \"" + titulo + "\" devolvido com sucesso.");
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
