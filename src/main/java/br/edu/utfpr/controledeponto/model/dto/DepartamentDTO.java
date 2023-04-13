package br.edu.utfpr.controledeponto.model.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class DepartamentDTO {
    @NonNull
    private String name;
    @NonNull
    private String code;
}