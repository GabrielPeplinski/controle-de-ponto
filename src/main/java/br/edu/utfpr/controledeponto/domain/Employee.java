package br.edu.utfpr.controledeponto.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Data
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String cpf;

    @NonNull
    private String setor;
}
