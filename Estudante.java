import java.util.Scanner;

public class Estudante {

    private String nome;
    private double[] nota;

    public Estudante(String nome) {
        this.nome = nome;
        this.nota = new double[5];
    }

    public void insereNotas() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i< nota.length; i++) {
            System.out.println("Digite a nota "+(i+1)+" de " +nome+":");
            nota[i] = scanner.nextDouble();
        }
    }

    public double calculaMedia() {
        double soma = 0;
        for (double nota : nota) {
            soma += nota;
        }
        return soma / nota.length;
    }

    public String getNome() {
        return nome;
    }

    public double[] getNota() {
        return nota;
    }

    public double menorNota() {
        double menor = nota[0];
        for (double nota : nota) {
            if (nota < menor) {
                menor = nota;
            }
        }
        return menor;
    }
}
