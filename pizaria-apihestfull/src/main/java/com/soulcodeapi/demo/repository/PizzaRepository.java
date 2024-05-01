package com.soulcodeapi.demo.repository;

import com.soulcodeapi.demo.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
