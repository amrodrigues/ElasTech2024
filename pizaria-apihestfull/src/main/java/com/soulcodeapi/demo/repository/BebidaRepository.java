package com.soulcodeapi.demo.repository;

import com.soulcodeapi.demo.model.Bebida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BebidaRepository extends JpaRepository<Bebida, Long> {

}
