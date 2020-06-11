package main.java;

import java.util.ArrayList;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Aluno vilmar = new Aluno("Vilmar", "Pereira", "101010", 'M', 6, 6, 6,6);
        Aluno sanderson = new Aluno("Sanderson", "da Luz", "202020", 'M', 8, 8, 8, 8);
        Aluno jose = new Aluno("José", "Silva", "303030", 'M', 4,3,4,5);

        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(vilmar);
        alunos.add(sanderson);
        alunos.add(jose);

        //TODO criar o professor e associar os alunos a ele

        Professor girafales = new Professor();
        girafales.setNome("Girafales");
        girafales.setSobrenome("Linguiça");
        girafales.setDataNascimento(new Date(1950,5,15));
        girafales.setDiciplina("Geografia");
        girafales.setAlunos(alunos);

       mostrarMediasAlunos(alunos);

        System.out.println("Média da turma: " + girafales.calcularMediaDaTurma());
    }

    private static void mostrarMediasAlunos(ArrayList<Aluno> alunos) {
        double notaCorteReprovacao = 4;
        double notaCorteAprovacao = 7;

        for (int i = 0; i < alunos.size(); i++) {
            Aluno alunoAtual = alunos.get(i);
            System.out.println("Situação do " + alunoAtual.getNomeCompleto()+ ": " + alunoAtual.determinarSituacaoAprovacao(notaCorteReprovacao, notaCorteAprovacao));

            System.out.println(alunoAtual.getNomeCompleto() + " - M." + alunoAtual.getMatricula() + " - " + alunoAtual.calcularMediaFinal());
        }

    }


}
