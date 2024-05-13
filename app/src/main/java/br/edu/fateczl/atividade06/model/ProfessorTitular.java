package br.edu.fateczl.atividade06.model;

public class ProfessorTitular extends Professor {
    public ProfessorTitular() {
        super();
    }

    @Override
    public double calcSalario(int horas, double horaAula) {
        return 0;
    }


    @Override
    public double calcSalarioAtual(double salarioAtual, int anosInstituicao) {
        return salarioAtual * anosInstituicao;
    }
}