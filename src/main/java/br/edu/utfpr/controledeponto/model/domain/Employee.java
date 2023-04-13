package br.edu.utfpr.controledeponto.model.domain;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String cpf;

    @ManyToOne
    @NonNull
    private Departament departament;

    public Employee() {

    }
}
