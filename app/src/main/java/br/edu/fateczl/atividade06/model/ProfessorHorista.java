package br.edu.fateczl.atividade06.model;

public class ProfessorHorista extends Professor {
    public ProfessorHorista() {
        super();
    }

    @Override
    public double calcSalario(int horas, double horaAula) {
        return horas * horaAula;
    }

    @Override
    public double calcSalarioAtual(double salarioAtual, int anosInstituicao) {
        return 0;
    }
}