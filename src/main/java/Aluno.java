package main.java;

public class Aluno {

    //Atributos
    //visibilidade Tipo nomeAtributo (padrão camelCase)
    private String nome;
    private String sobrenome;
    private String matricula;
    private char sexo;
    private double notaProva1;
    private double notaProva2;
    private double mediaTrabalhos;
    private double mediaExercicios;

    //Construtor
    public Aluno() {

    }

    public Aluno(String nome, String sobrenome, String matricula, char sexo, double notaProva1, double notaProva2, double mediaExercicios, double mediaTrabalhos) {
        this.nome = nome;
        this.sobrenome= sobrenome;
        this.matricula = matricula;
        this.sexo = sexo;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.mediaTrabalhos = mediaTrabalhos;
        this.mediaExercicios = mediaExercicios;
    }

    //Métodos
    public double calcularMediaFinal() {
        return (notaProva1 + notaProva2 + mediaExercicios + mediaTrabalhos)/4;
    }

    public String determinarSituacaoAprovacao(double notaMaximaReprovacao, double notaMinimaAprovacao)  {
        String situacao = "";
        double mediaFinal = this.calcularMediaFinal();

        if(mediaFinal >= notaMinimaAprovacao) {
            situacao = "Aprovado";
        } else if (mediaFinal <= notaMaximaReprovacao) {
            situacao = "Reprovado";
        } else {
            situacao = "Exame";
        }

        return situacao;
    }

    public String getNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    //Métodos get e set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public double getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public double getMediaTrabalhos() {
        return mediaTrabalhos;
    }

    public void setMediaTrabalhos(double mediaTrabalhos) {
        this.mediaTrabalhos = mediaTrabalhos;
    }

    public double getMediaExercicios() {
        return mediaExercicios;
    }

    public void setMediaExercicios(double mediaExercicios) {
        this.mediaExercicios = mediaExercicios;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
