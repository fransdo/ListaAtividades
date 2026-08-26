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
        for (int i = 0; i < nota.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + " de " + nome + ":");
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

    public double calculaMedia(int[] pesos) {
        double somaPonderada = 0;
        int somaPesos = 0;
        for (int i = 0; i < nota.length; i++) {
            somaPonderada += nota[i] * pesos[i];
            somaPesos += pesos[i];
        }
        return somaPonderada / somaPesos;
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

    // Teste
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Carla");
        double[] notas = estudante.getNota();
        notas[0] = 7; notas[1] = 8; notas[2] = 6; notas[3] = 9; notas[4] = 10;

        int[] pesos = { 1, 1, 2, 2, 4 };

        System.out.println("Media aritmetica: " + estudante.calculaMedia());
        System.out.println("Media ponderada: " + estudante.calculaMedia(pesos));
    }
}
