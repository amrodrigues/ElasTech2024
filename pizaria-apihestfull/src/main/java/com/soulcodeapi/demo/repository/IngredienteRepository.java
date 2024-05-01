package com.soulcodeapi.demo.repository;

import com.soulcodeapi.demo.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteRepository extends JpaRepository<Ingrediente , Long> {
}
