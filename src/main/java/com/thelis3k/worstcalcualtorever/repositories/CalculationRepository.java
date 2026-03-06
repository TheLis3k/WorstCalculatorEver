package com.thelis3k.worstcalcualtorever.repositories;

import com.thelis3k.worstcalcualtorever.entities.Calculation;
import com.thelis3k.worstcalcualtorever.enums.OperationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CalculationRepository extends JpaRepository<Calculation, Long> {
    boolean existsByFirstNumberAndSecondNumberAndOperation(
        Double firstNumber,
        Double secondNumber,
        OperationType operation
    );

    void deleteByFirstNumberAndSecondNumberAndOperation(
        Double firstNumber,
        Double secondNumber,
        OperationType operation
    );

    Optional<Calculation> findFirstByFirstNumberAndSecondNumberAndOperation(
        Double firstNumber,
        Double secondNumber,
        OperationType operation
    );
}
