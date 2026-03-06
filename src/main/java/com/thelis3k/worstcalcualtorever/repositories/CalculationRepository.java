package com.thelis3k.worstcalcualtorever.repositories;

import com.thelis3k.worstcalcualtorever.entities.Calculation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculationRepository extends JpaRepository<Calculation, Long> {
}
