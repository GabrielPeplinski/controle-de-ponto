package br.edu.utfpr.controledeponto.model.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class EmployeeDTO {
    @NonNull
    private String name;
    @NonNull
    private String cpf;
    @NonNull
    private int setor;
}