package me.dio.academia.digital.entity;

import java.time.LocalDate;

public class AvaliacaoFisica {

    private Long id;
    private Aluno aluno;
    private LocalDate dataDaAvaliacao = LocalDate.now();
    private double peso;
    private double altura;
}
