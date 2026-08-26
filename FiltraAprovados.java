public class FiltraAprovados {

    public static Estudante[] filtraAprovados(Estudante[] estudantes) {
        int quantidadeAprovados = 0;

        for (Estudante estudante : estudantes) {
            if (estudante.calculaMedia() >= 6) {
                quantidadeAprovados++;
            }
        }

        if (quantidadeAprovados == 0) {
            return null;
        }

        Estudante[] aprovados = new Estudante[quantidadeAprovados];
        int indice = 0;
        for (Estudante estudante : estudantes) {
            if (estudante.calculaMedia() >= 6) {
                aprovados[indice] = estudante;
                indice++;
            }
        }

        return aprovados;
    }

    public static void main(String[] args) {
        Estudante e1 = new Estudante("Ana");
        double[] notasAna = e1.getNota();
        notasAna[0] = 8; notasAna[1] = 7; notasAna[2] = 9; notasAna[3] = 6; notasAna[4] = 10;

        Estudante e2 = new Estudante("Bruno");
        double[] notasBruno = e2.getNota();
        notasBruno[0] = 3; notasBruno[1] = 4; notasBruno[2] = 5; notasBruno[3] = 2; notasBruno[4] = 4;

        Estudante[] turma = { e1, e2 };
        Estudante[] aprovados = filtraAprovados(turma);

        if (aprovados == null) {
            System.out.println("Nenhum estudante foi aprovado.");
        } else {
            System.out.println("Estudantes aprovados:");
            for (Estudante estudante : aprovados) {
                System.out.println("- " + estudante.getNome() + " (media: " + estudante.calculaMedia() + ")");
            }
        }
    }
}
