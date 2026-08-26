import java.util.Scanner;

/**
 * Exercicio 2
 * Classe Estudante com nome, array de 5 notas, e metodos de manipulacao.
 */
public class Estudante {

    private String nome;
    private double[] notas;

    // Construtor: recebe o nome e dimensiona o array de notas em 5
    public Estudante(String nome) {
        this.nome = nome;
        this.notas = new double[5];
    }

    // Le do teclado as cinco notas do estudante
    public void insereNotas() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + " de " + nome + ":");
            notas[i] = scanner.nextDouble();
        }
    }

    // Devolve a media aritmetica das notas
    public double calculaMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    // Metodo get do nome
    public String getNome() {
        return nome;
    }

    // Metodo get das notas
    public double[] getNotas() {
        return notas;
    }

    // Devolve a menor nota do estudante
    public double menorNota() {
        double menor = notas[0];
        for (double nota : notas) {
            if (nota < menor) {
                menor = nota;
            }
        }
        return menor;
    }
}
