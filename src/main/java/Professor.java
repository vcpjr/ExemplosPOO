package main.java;

import java.util.ArrayList;
import java.util.Date;

public class Professor {
    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    private String diciplina;
    private ArrayList<Aluno> alunos;

    public Professor() {

    }

    public Professor(String nome, String sobrenome, Date dataNascimento, String diciplina, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.diciplina = diciplina;
        this.alunos = alunos;
    }

    public double calcularMediaDaTurma() {
        double mediaTurma = 0;
        double quantidadeAlunos = alunos.size();

        for (int i = 0; i < quantidadeAlunos; i++) {
            mediaTurma = mediaTurma + alunos.get(i).calcularMediaFinal();
        }

        return mediaTurma / quantidadeAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
