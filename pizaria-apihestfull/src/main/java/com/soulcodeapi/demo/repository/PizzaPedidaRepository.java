package com.soulcodeapi.demo.repository;

import com.soulcodeapi.demo.model.PizzaPedida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaPedidaRepository extends JpaRepository<PizzaPedida, Long> {
}
