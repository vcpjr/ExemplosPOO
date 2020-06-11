package main.java;

public class Principal {
    public static void main(String[] args) {
        Aluno vilmar = new Aluno("Vilmar", "101010", 'M', 6, 6, 6,6);
        Aluno sanderson = new Aluno("Sanderson", "202020", 'M', 8, 8, 8, 8);
        Aluno jose = new Aluno("José", "303030", 'M', 2,1,4,5);

        Aluno[] alunos = new Aluno[3];
        alunos[0] = vilmar;
        alunos[1] = sanderson;
        alunos[2] = jose;

        double notaCorteReprovacao = 4;
        double notaCorteAprovacao = 7;

//        System.out.println("Situação do Vilmar: " + vilmar.determinarSituacaoAprovacao(notaCorteReprovacao, notaCorteAprovacao));
//        System.out.println("Situação do " + sanderson.getNome() + " : " + sanderson.determinarSituacaoAprovacao(notaCorteReprovacao, notaCorteAprovacao));
//        System.out.println("Situação do José: " + jose.determinarSituacaoAprovacao(notaCorteReprovacao, notaCorteAprovacao));
//        System.out.println();
//        System.out.println("****************** Médias dos alunos: ******************");
//        System.out.println(vilmar.getNome() + " - M." + vilmar.getMatricula() + " - " + vilmar.calcularMediaFinal());
//        System.out.println(sanderson.getNome() + " - M." + sanderson.getMatricula() + " - " + sanderson.calcularMediaFinal());
//        System.out.println(jose.getNome() + " - M." + jose.getMatricula() + " - " + jose.calcularMediaFinal());

        for (int i = 0; i < alunos.length; i++) {
            Aluno alunoAtual = alunos[i];
            System.out.println("Situação do " + alunoAtual.getNome()+ ": " + alunoAtual.determinarSituacaoAprovacao(notaCorteReprovacao, notaCorteAprovacao));

            System.out.println(alunoAtual.getNome() + " - M." + alunoAtual.getMatricula() + " - " + alunoAtual.calcularMediaFinal());
        }


    }
}
