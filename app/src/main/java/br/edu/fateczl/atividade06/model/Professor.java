package br.edu.fateczl.atividade06.model;

public abstract class Professor {

    private String nome;
    private String matricula;
    private int idade;

    public Professor() {
        super();
    }

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract double calcSalario(int horas, double horaAula);
    public abstract double calcSalarioAtual(double salarioAtual, int anosInstituicao);

}