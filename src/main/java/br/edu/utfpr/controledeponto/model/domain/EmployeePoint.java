package br.edu.utfpr.controledeponto.model.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "employees_points")
@Data
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class EmployeePoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;

    @OneToOne
    @NonNull
    private Employee employee;

    public EmployeePoint() {
    }

    public @NonNull Employee getEmployee()
    {
        return this.employee;
    }

    public String getCreatedDate()
    {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        return format.format(this.createdAt);
    }
}
