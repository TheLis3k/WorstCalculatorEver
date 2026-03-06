package com.thelis3k.worstcalcualtorever.entities;

import com.thelis3k.worstcalcualtorever.enums.OperationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcType;
import org.hibernate.dialect.type.PostgreSQLEnumJdbcType;

@Entity
@Table(name="calculations")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Calculation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_number")
    private Double firstNumber;

    @Column(name = "second_number")
    private Double secondNumber;

    @Enumerated(EnumType.STRING)
    @JdbcType(PostgreSQLEnumJdbcType.class)
    @Column(name = "operation")
    private OperationType operation;

    private Double result;
}
