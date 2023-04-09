package br.edu.utfpr.controledeponto.model.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "departaments")
@Data
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Departament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String code;

    public Departament() {
    }
}
