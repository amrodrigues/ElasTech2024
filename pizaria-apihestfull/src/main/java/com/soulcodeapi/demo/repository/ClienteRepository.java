package com.soulcodeapi.demo.repository;

import com.soulcodeapi.demo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
