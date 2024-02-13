package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AvaliacaoFisicaForm {
    private Long alunoId;

    private double peso;

    private double altura;
}
